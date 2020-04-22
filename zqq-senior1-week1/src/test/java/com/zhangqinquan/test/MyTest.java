package com.zhangqinquan.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhangqinquan.bean.Hero;
import com.zhangqinquan.service.HeroServiceImpl;


public class MyTest {

	@Test
	public void test01(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		HeroServiceImpl bean = ac.getBean("ser", HeroServiceImpl.class);
		Map<String, Object> map = new HashMap<String, Object>();
		List<Hero> list = bean.findAll(map);
		for (Hero hero : list) {
			System.out.println(hero);
		}
	}
	@Test
	public void test02(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		HeroServiceImpl bean = ac.getBean("ser", HeroServiceImpl.class);
		bean.add(new Hero(0, "77", 9996, new Date(), 0, 2, ""));
	}
	@Test
	public void test03(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		HeroServiceImpl bean = ac.getBean("ser", HeroServiceImpl.class);
		bean.buy(2);
	}
}
