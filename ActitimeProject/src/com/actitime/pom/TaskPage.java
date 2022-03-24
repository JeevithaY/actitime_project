package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewCust;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustBtn;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement custNameTbx;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description' ]")
	private WebElement custDesc;
	
	@FindBy(xpath="(//div[text()='- Select Customer -'])[1]")
	private WebElement selectCust;
	 
	
	@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
	private WebElement ourCompany;
	
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCust;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']")
	private WebElement actualCustCreate;
	
	
	public TaskPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	

	public WebElement getAddNewCust() {
		return addNewCust;
	}

	public WebElement getNewCustBtn() {
		return newCustBtn;
	}

	public WebElement getCustNameTbx() {
		return custNameTbx;
	}

	public WebElement getCustDesc() {
		return custDesc;
	}

	public WebElement getSelectCust() {
		return selectCust;
	}

	public WebElement getOurCompany() {
		return ourCompany;
	}

	public WebElement getCreateCust() {
		return createCust;
	}

	public WebElement getActualCustCreate() {
		return actualCustCreate;
	}
	
	
	

}
