package com.conveter.vehical;

import com.conveter.bean.IDriveable;
import com.conveter.bean.IFlyable;

public class Vehical {
	IFlyable iflyable;
	IDriveable idriveable;
	
	public void honk() {
		System.out.println("honk");
	}

}
