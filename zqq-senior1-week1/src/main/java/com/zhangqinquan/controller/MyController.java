package com.zhangqinquan.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhangqinquan.bean.Camp;
import com.zhangqinquan.bean.Hero;
import com.zhangqinquan.service.HeroService;

@Controller
public class MyController {

	@Resource
	private HeroService ser;
	
	@RequestMapping("list")
	public String find(Model model,@RequestParam(defaultValue="1")int pageNum,Integer cid,Integer status,Double start,Double end){
		PageHelper.startPage(pageNum, 3);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("cid", cid);
		map.put("status", status);
		map.put("start", start);
		map.put("end", end);
		List<Hero> list = ser.findAll(map);
		PageInfo<Hero> plist = new PageInfo<Hero>(list);
		model.addAttribute("plist", plist);
		model.addAttribute("map", map);
		return "list";
	}
	
	@ResponseBody
	@RequestMapping("findC")
	public List<Camp> findC(){
		List<Camp> list = ser.findC();
		return list;
	}
	@RequestMapping("add")
	public String add(Hero hero){
		ser.add(hero);
		return "redirect:list";
	}
	@ResponseBody
	@RequestMapping("findOne")
	public Hero find(int id){
		Hero hero = ser.findOne(id);
		return hero;
	}
	@RequestMapping("buy")
	@ResponseBody
	public boolean buy(int id){
		int i = ser.buy(id);
		if(i>0){
			return true;
		}else{
			return false;
		}
	}
}
