package com.williamssonoma.williamsSonomaPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class WilliamsSonomaEmptyShoppingCartPage extends BaseTestPage{
	
	public WilliamsSonomaEmptyShoppingCartPage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="//h1[normalize-space()='ToDo App']")
	public WebElement headerToDoApp; 	
	

}