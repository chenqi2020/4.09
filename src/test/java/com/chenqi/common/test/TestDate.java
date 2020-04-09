package com.chenqi.common.test;

import java.text.ParseException;
import java.util.Date;

import org.junit.Test;

import com.chenqi.utils.DateUtils;

public class TestDate {

	@Test
	public void testYc() {
		
		try {
			Date initMonth = DateUtils.getDateByInitMonth(new Date());
			System.out.println(initMonth);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
