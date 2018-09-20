package com.bdi.sp.game;

public class Lol implements Game {

	@Override
	public void play() {
		System.out.println("롤을 플레이 합니다.");
	}

	@Override
	public void start() {
		System.out.println("롤을 실행합니다.");

	}

	@Override
	public void end() {
		System.out.println("롤을 종료합니다.");
	}


}
