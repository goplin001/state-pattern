package com.test;

import com.context.Context;
import com.service.impl.RedState;

public class StateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context=new Context();
		context.setState(RedState.getRedState());
		System.out.println(context.leftTurn());
		System.out.println(context.rightTurn());
		
	}

}
