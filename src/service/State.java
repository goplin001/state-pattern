package service;

import context.Context;
import enums.ColorEnum;

public interface State {
	ColorEnum leftTurn(Context context);
	
	ColorEnum rightTurn(Context context);
	
	ColorEnum getColor();

}
