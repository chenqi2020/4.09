package com.chenqi.utils;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	public static Date getDateByInitMonth(Date src) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String string = format.format(new Date());
		//新的日期
		String s2=string.substring(0, 8)+"01 00:00:00";
		System.out.println("s2"+s2);
		//转换成日期
		return format.parse(s2);
		
	}

}
