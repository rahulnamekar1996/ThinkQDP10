package com.mob;
import com.assignment.inheritancemethodovrriding.Application;

import com.assignment.inheritancemethodovrriding.Devloper;

public class MobileApplication extends Application{
	
    private long IMEI;
	
	public MobileApplication() 
	
	{
		
	}
	public MobileApplication(double version,String technology,Devloper devloper,long IMEI) 
	{
		super(version ,technology,devloper);
		this .IMEI=IMEI;
	}
	public String toString() 
	{
		return "Mob  App" +IMEI+""+super.toString();
	}

}
