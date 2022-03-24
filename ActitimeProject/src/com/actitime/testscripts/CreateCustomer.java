package com.actitime.testscripts;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.generics.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskPage;
@Listeners(com.actitime.generics.ListenerImplementation.class)
public class CreateCustomer extends BaseClass{
@Test
public void createCustomer() throws EncryptedDocumentException, IOException, InterruptedException
{
	
	Reporter.log("create customer",true);
	FileLib f=new FileLib();
	  String custName=f.getExcelData("CreateCustomer", 1, 2);
	  String custDesc=f.getExcelData("CreateCustomer", 1, 3);
	  HomePage h=new HomePage(driver);
	  h.setTask();
	  TaskPage t=new TaskPage(driver);
	  t.getAddNewCust().click();
      t.getNewCustBtn().click();
	  t.getCustNameTbx().sendKeys(custName);
	  t.getCustDesc().sendKeys(custDesc);
	  t.getSelectCust().click();
	  t.getOurCompany().click();
	  t.getCreateCust().click();
	  Thread.sleep(4000);
	  String actual = t.getActualCustCreate().getText();
	  Assert.assertEquals(actual, custName);
	  Reporter.log("customer create successfully created",true);
	  
	
}
}
