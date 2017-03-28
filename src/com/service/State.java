package com.service;

import com.context.Context;
import com.enums.ColorEnum;

public interface State {
	ColorEnum leftTurn(Context context);
	
	ColorEnum rightTurn(Context context);
	
	ColorEnum getColor();

}
