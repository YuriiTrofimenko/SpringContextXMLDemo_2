package org.tyaa.springcontextdemo2.implementations;

import org.tyaa.springcontextdemo2.interfaces.IPlayField;

public class PlayField implements IPlayField {
	
	private PlayFieldSea mSea;

	public PlayField() {
		show();
		//mSea.show();
	} 
	
	//Using by authowire
	public PlayField(PlayFieldSea sea) {
		super();
		show();
		mSea = sea;
		mSea.show();
	}	
	
	public PlayFieldSea getSea() {
		return mSea;
	}

	public void setSea(PlayFieldSea _sea) {
		mSea = _sea;
	}

	@Override
	public void show() {
		System.out.println("The playing field is shown");
	}

}
