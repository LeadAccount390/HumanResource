package LoginPages;

import org.openqa.selenium.By;

import Utilspage.Commonutils;

public class Loginpage {

	private final By username =By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/input");
	
	public void open()
	{
		
			Commonutils.enterUsername(getUsername(),"selenium",true);
	
		
	}
	
	
	
	By getUsername()
	{
		return username;
	}



	

}
