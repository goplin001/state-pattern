package test;

import service.impl.RedState;
import context.Context;

public class StateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context=new Context();
		context.setState(RedState.getRedState());
		System.out.println(context.leftTurn());
		System.out.println(context.rightTurn());
		
	}

}
