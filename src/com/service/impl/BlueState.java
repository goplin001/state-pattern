package com.service.impl;

import com.context.Context;
import com.enums.ColorEnum;
import com.service.State;

public class BlueState implements State {

	@Override
	public ColorEnum leftTurn(Context context) {
		// TODO Auto-generated method stub
		return ColorEnum.PINK;
	}

	@Override
	public ColorEnum rightTurn(Context context) {
		// TODO Auto-generated method stub
		return ColorEnum.YELLOW;
	}

	@Override
	public ColorEnum getColor() {
		// TODO Auto-generated method stub
		return ColorEnum.BLUE;
	}

}