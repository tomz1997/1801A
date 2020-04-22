package com.zhangqinquan.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.zhangqinquan.bean.Camp;
import com.zhangqinquan.bean.Hero;

public interface HeroService {

	public List<Hero> findAll(Map<String,Object> map);
	
	public List<Camp> findC();
	
	public int add(Hero hero);
	
	public int buy(int id);
	
	public Hero findOne(int id);
}
