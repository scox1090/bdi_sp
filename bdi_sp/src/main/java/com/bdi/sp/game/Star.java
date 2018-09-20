package com.bdi.sp.game;

public class Star implements Game {

	@Override
	public void play() {
		System.out.println("스타를 플레이 합니다.");
	}

	@Override
	public void start() {
		System.out.println("스타를 실행합니다.");

	}

	@Override
	public void end() {
		System.out.println("스타를 종료합니다.");
	}

}
