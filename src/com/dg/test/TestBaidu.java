package com.dg.test;

import com.netease.dagger.BrowserEmulator;

public class TestBaidu {

	public static void main(String[] args) {
		String googleUrl = "https://www.baidu.com";
		String searchBox = "//input[@name='wd']";
		String searchBtn = "//input[@id='su']";

		BrowserEmulator be = new BrowserEmulator();
		be.open(googleUrl);
		
		
		be.type(searchBox, "github");
		be.click(searchBtn);
		
		
		//be.expectTextExistOrNot(true, "https://github.com/", 5000);
		be.quit();
		
	}

}
