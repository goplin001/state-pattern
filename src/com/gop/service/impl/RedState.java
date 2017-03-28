package com.gop.service.impl;

import com.gop.context.Context;
import com.gop.enums.ColorEnum;
import com.gop.service.State;

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
