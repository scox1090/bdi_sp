package com.bdi.sp.food;

public class Bugger implements Food {

	@Override
	public void eat() {
		System.out.println("Bugger를 맛있게 묵었어요~!");

	}

	@Override
	public Food buy(int money) {
		System.out.println(money + "원으로 Bugger를 삽니다.");
		return this;
	}

}
