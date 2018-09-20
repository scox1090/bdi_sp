package com.bdi.sp.game;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execute {

	public static void main(String[] args) {
		BeanFactory bf = new ClassPathXmlApplicationContext("game/game-ioc.xml");	//pre-loading 방식의 경로 지정 법 
		Computer c = (Computer)bf.getBean("computer");
		c.load();
	}
}
