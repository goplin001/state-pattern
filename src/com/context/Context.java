package com.context;

import com.enums.ColorEnum;
import com.service.State;

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
