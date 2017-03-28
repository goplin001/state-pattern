package com.gop.service.impl;

import com.gop.context.Context;
import com.gop.enums.ColorEnum;
import com.gop.service.State;

public class GreenState implements State {

	@Override
	public ColorEnum leftTurn(Context context) {
		// TODO Auto-generated method stub
		return ColorEnum.YELLOW;
	}

	@Override
	public ColorEnum rightTurn(Context context) {
		// TODO Auto-generated method stub
		return ColorEnum.RED;
	}

	@Override
	public ColorEnum getColor() {
		// TODO Auto-generated method stub
		return ColorEnum.GREEN;
	}

}
