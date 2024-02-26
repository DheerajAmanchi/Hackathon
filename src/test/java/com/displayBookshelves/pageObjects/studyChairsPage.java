package com.displayBookshelves.pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class studyChairsPage extends basePage {
	
	

	public studyChairsPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(tagName="h1")
	public WebElement studyChairsTitle;
	
	public String getStudyChairsTitle() {
		
		String scTitle = studyChairsTitle.getText();
		return scTitle;
		
	}
	
	public void displayStudyChairs() {
		
		List<String> models= new ArrayList<>();
		List<String> brands= new ArrayList<>();
		List<String> prices = new ArrayList<>();
		
		for(int i=1; i<=3; i++) {
			System.out.println("========================================================================");
			WebElement modelName = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/ul/li[" +i+ "]/div/div[5]/a/div[1]/span"));
			models.add(modelName.getText());
			System.out.println(modelName.getText());
			
			WebElement brandName = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/ul/li[" +i+ "]/div/div[5]/a/div[1]/div[2]/div"));
			brands.add(brandName.getText());
			System.out.println(brandName.getText());
			
			WebElement price = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/ul/li[" +i+ "]/div/div[5]/a/div[2]/span"));
			prices.add(price.getText());
			System.out.println(price.getText());
			System.out.println("========================================================================");
			
		}
	}

}
