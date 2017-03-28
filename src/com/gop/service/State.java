package com.gop.service;

import com.gop.context.Context;
import com.gop.enums.ColorEnum;

public interface State {
	ColorEnum leftTurn(Context context);
	
	ColorEnum rightTurn(Context context);
	
	ColorEnum getColor();

}
