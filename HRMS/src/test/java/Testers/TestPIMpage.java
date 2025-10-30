package Testers;

import BasePgae.Page;
import LoginPages.Loginpage;

public class TestPIMpage extends Page {
	
	Loginpage loginpage = new Loginpage();

	void addEmployee()
	{
		loginpage.open();	
	}
	
	

}
