package org.tyaa.springcontextdemo2.implementations;

import org.springframework.beans.factory.InitializingBean;
import org.tyaa.springcontextdemo2.interfaces.IPlayField;

public class PlayFieldSea implements IPlayField, InitializingBean {

	public PlayFieldSea() {
		show();
	}
	
	@Override
	public void show() {
		System.out.println("The sea is shown");
	}

	@Override
	public void afterPropertiesSet() throws Exception {

		System.out.println("The sea is created");
	}
}
