package service.impl;

import service.State;
import context.Context;
import enums.ColorEnum;

public class PinkState implements State {

	@Override
	public ColorEnum leftTurn(Context context) {
		// TODO Auto-generated method stub
		return ColorEnum.RED;
	}

	@Override
	public ColorEnum rightTurn(Context context) {
		// TODO Auto-generated method stub
		return ColorEnum.BLUE;
	}

	@Override
	public ColorEnum getColor() {
		// TODO Auto-generated method stub
		return ColorEnum.PINK;
	}

}
