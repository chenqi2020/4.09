package com.chenqi.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class StreamUtlis {

	/*
	* 方法1：批量关闭流，参数能传入无限个。(10分)
	* 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭，并且参数个数不限。
	*/
	private void syso() {
		// TODO Auto-generated method stub
		String file="";
		try {
			FileInputStream stream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
