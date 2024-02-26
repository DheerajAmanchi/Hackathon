package com.displayBookshelves.pageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class urbanLadderHomePage extends basePage {
	static JavascriptExecutor js;
	
	public urbanLadderHomePage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//div[@id=\"credential_picker_container\"]/iframe")
	WebElement iframe;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div")
	WebElement furnitureMenu;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div/div[3]/a[5]")
	WebElement bookshelvesIcon;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div/div[3]/a[4]")
	WebElement studyIcon;
	
	@FindBy(xpath="//*[@id=\"topnav_wrapper\"]/ul/li/span")
	List<WebElement> menuItems;
	
	@FindBy(xpath="//*[@id=\"topnav_wrapper\"]/ul/li[3]/div/div/ul/li/div/a")
	List<WebElement> subMenuItems;
	
	@FindBy(xpath="//*[@id=\"topnav_wrapper\"]/ul/li[3]/div/div/ul/li[1]/ul/li/a/span")
	List<WebElement> SC;
	
	@FindBy(xpath="//*[@id=\"topnav_wrapper\"]/ul/li[3]/div/div/ul/li[3]/ul/li/a/span")
	List<WebElement> LS;
	
	@FindBy(id="close")
	WebElement googleClose;
	
	@FindBy(id="search")
	WebElement search;
	
	@FindBy(id="search_button")
	WebElement searchButton;
	
	@FindBy(xpath="//*[@id=\"topnav_wrapper\"]/ul/li[7]/span")
	WebElement study;

	@FindBy(xpath="//*[@id=\"topnav_wrapper\"]/ul/li[7]/div/div/ul/li[3]/ul/li[1]/a")
	WebElement bookshelveslink;
	
	@FindBy(xpath="//*[@id=\"topnav_wrapper\"]/ul/li[7]/div/div/ul/li[2]/ul/li[1]/a")
	WebElement studyChairslink;
	
	@FindBy(id="header-icon-track-order")
	WebElement trackOrder;
	
	@FindBy(id="header-icon-wishlist")
	WebElement wishlist;
	
	@FindBy(id="header-icon-cart")
	WebElement cart;
	
	@FindBy(xpath="//header[@id=\"header\"]/section/div/ul[2]/li[3]/a")
	WebElement giftCardsButton;
	
	public void clickGoogleClose() {
		js = (JavascriptExecutor) driver;
		try {
			driver.switchTo().frame(iframe);
			js.executeScript("arguments[0].click();", googleClose);
			driver.switchTo().defaultContent();
		}
		catch(Exception e) {
			
		}
	}
	
	public void scrollForFurnitureMenu() {
		
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", furnitureMenu);
		
	}
	
	public void clickfBookshelves() {
		
		bookshelvesIcon.click();
	}
	
	public void clickfStudy() {
		
		studyIcon.click();
	}
	
	public void searchBookshelves(String value) {
		
		search.sendKeys(value);
		
	}
	
	public void clickSearchButton() {
		
		searchButton.click();
	}
	
	public void clickOnStudy() {

		study.click();
	}
	
	public void clickOnStudyChairs() {
		
		studyChairslink.click();
	}
	
	public void clickMenuItem(String menuItemName) {
		
		for(WebElement i : menuItems) {
			if(i.getText().equalsIgnoreCase(menuItemName)) {
				i.click();
				break;
			}
		}
	}
	
	public void clickSubMenuItem(String subMenuItemName) {
		
		for(WebElement i : subMenuItems) {
			if(i.getText().equalsIgnoreCase(subMenuItemName)) {
				i.click();
			}
		}
	}
	
	public void displayAllItems(String subMenuItemName) {
		
		if(subMenuItemName.equalsIgnoreCase("Seating & Chairs")) {
			
			for(WebElement i : SC) {
				System.out.println(i.getText());
			}
		}
		
		else if(subMenuItemName.equalsIgnoreCase("Living Storage")) {
			
			for(WebElement i : LS) {
				System.out.println(i.getText());
			}
		}
	}
	
	public void clickGiftCards() {
		
		giftCardsButton.click();
	}
	
	public void clickOnTrackOrder() {
		
		trackOrder.click();
	}
	
	public void clickOnWishlist() {
		
		wishlist.click();
	}
	
	public void clickOnCart() {
		
		cart.click();
	}
	
	public void clickOnBookshelvesSMItem() {
		
		bookshelveslink.click();
	}
	
}
