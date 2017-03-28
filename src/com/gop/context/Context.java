package com.gop.context;

import com.gop.enums.ColorEnum;
import com.gop.service.State;

public class Context {
	private State state;
	
	public ColorEnum leftTurn() {
		return state.leftTurn(this);
	}
	
	public ColorEnum rightTurn() {
		return state.rightTurn(this);
	}

	public void setState(State state) {
		this.state = state;
	}
	
}
