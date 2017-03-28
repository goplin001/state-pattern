package service.impl;

import service.State;
import context.Context;
import enums.ColorEnum;

public class RedState implements State {
	
	private RedState(){}
	
	private static final RedState red=new RedState();
	
	public static RedState getRedState() {
		return red;
	}

	@Override
	public ColorEnum leftTurn(Context context) {
		// TODO Auto-generated method stub
		return ColorEnum.GREEN;
	}

	@Override
	public ColorEnum rightTurn(Context context) {
		// TODO Auto-generated method stub
		return ColorEnum.PINK;
	}

	@Override
	public ColorEnum getColor() {
		// TODO Auto-generated method stub
		return ColorEnum.RED;
	}

}