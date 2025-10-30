package BasePgae;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilspage.Commonutils;

public class Page {
  @Test
  public void f() {
	  
  }
  @BeforeTest
  public void beforeTest() {
	  Commonutils.readproperties();
	  Commonutils.openbrowserurl();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
