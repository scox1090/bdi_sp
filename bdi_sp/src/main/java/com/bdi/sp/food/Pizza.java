package com.bdi.sp.food;

public class Pizza implements Food {

	@Override
	public void eat() {
		System.out.println("Pizza를 맛있게 묵었어요~!");
	}

	@Override
	public Food buy(int money) {
		System.out.println(money + "원으로 피자를 삽니다.");
		return this;
	}

}
