package com.bdi.sp.food;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Execute {

	public static void main(String[] args) {
		FileSystemResource fsr = new FileSystemResource("src/main/resources/food/food-ioc.xml"); //lazy-loading 방식의 경로 지정 법
		BeanFactory bf = new XmlBeanFactory(fsr);
		KFC kfc = (KFC)bf.getBean("kfc");
		kfc.buy();
	}
}
