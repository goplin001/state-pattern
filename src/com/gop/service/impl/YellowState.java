package com.gop.service.impl;

import com.gop.context.Context;
import com.gop.enums.ColorEnum;
import com.gop.service.State;

public class YellowState implements State {

	@Override
	public ColorEnum leftTurn(Context context) {
		// TODO Auto-generated method stub
		return ColorEnum.BLUE;
	}

	@Override
	public ColorEnum rightTurn(Context context) {
		// TODO Auto-generated method stub
		return ColorEnum.GREEN;
	}

	@Override
	public ColorEnum getColor() {
		// TODO Auto-generated method stub
		return ColorEnum.YELLOW;
	}

}
