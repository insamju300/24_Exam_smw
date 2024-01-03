package com.koreaIt;

public class Util {

	public static boolean isInteger(String string) {
		// TODO Auto-generated method stub
		try {
			Integer.parseInt(string);
		}catch(Exception e){
			return false;
		}
		
		return true;
	}

}
