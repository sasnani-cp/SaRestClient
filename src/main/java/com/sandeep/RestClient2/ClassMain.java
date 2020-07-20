package com.sandeep.RestClient2;

import com.sandeep.RestClient2.exeutable.LoginPostClient;
import com.sandeep.RestClient2.exeutable.SchoolGetter;

public class ClassMain {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Initiating");
		
		SchoolGetter schoolGetter = new SchoolGetter();
		schoolGetter.execute();

		System.out.println("----");
		LoginPostClient loginClient = new LoginPostClient();
		loginClient.execute();
		
		
		
	}

}
