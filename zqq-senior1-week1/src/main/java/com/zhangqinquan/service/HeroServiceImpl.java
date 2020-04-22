package com.zhangqinquan.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhangqinquan.bean.Camp;
import com.zhangqinquan.bean.Hero;
import com.zhangqinquan.mapper.HeroMapper;

@Service("ser")
public class HeroServiceImpl implements HeroService {

	@Resource
	private HeroMapper hm;

	public List<Hero> findAll(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return hm.findAll(map);
	}

	public List<Camp> findC() {
		// TODO Auto-generated method stub
		return hm.findC();
	}

	public int add(Hero hero) {
		// TODO Auto-generated method stub
		return hm.add(hero);
	}

	public int buy(int id) {
		// TODO Auto-generated method stub
		return hm.buy(id);
	}

	public Hero findOne(int id) {
		// TODO Auto-generated method stub
		return hm.findOne(id);
	}
}
