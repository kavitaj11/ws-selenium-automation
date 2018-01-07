package com.williamssonoma.williamsSonomaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.williamssonoma.williamsSonomaPages.BaseTestPage;

import java.util.List;


public class WilliamsSonomaCookwarePotsAnsPansPage extends BaseTestPage{
	
	public WilliamsSonomaCookwarePotsAnsPansPage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//h1[text()='Cookware']")
	public WebElement headerCookware;

	@FindBy(xpath="//div[@class='left-nav-cat-heading'][text()='Featured']")
	public WebElement menuFeatured;

	@FindBy(xpath="//div[@class='left-nav-cat-heading'][text()='Shop by Category']")
	public WebElement menuShopByCategory;

	@FindBy(xpath="//div[@class='left-nav-cat-heading'][text()='Shop by Category']/following-sibling::ul/li[@class='navLink ']")
	public List<WebElement> linksAllProductsShopByCategory;

	@FindBy(xpath="//div[contains(@class, 'stickyOverlayWidget')]")
	public WebElement popupOverlayWidget;

	@FindBy(xpath="//a[contains(@class, 'stickyOverlayMinimizeButton')]")
	public WebElement buttonStickyOverlayMinimize ;

	public void clickMenuShopByCategory(String productName){
		for (WebElement link : linksAllProductsShopByCategory)
		{
			WebElement productLink= link.findElement(By.tagName("a"));
			if (productLink.getText().trim().equals(productName))
			{
				productLink.click(); // click the desired option
				break;
			}
		}
	}






}