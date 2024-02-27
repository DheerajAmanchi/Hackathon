package com.displayBookshelves.pageObjects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.displayBookshelves.utils.excelUtils;

public class studyChairsPage extends basePage {
	
	

	public studyChairsPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(tagName="h1")
	public WebElement studyChairsTitle;
	
	String filePath = System.getProperty("user.dir")+"/src/test/resources/bookShelvesData.xlsx";
	
	public String getStudyChairsTitle() {
		
		String scTitle = studyChairsTitle.getText();
		return scTitle;
		
	}
	
	public void displayStudyChairs() throws IOException {
		
		List<String> models= new ArrayList<>();
		List<String> brands= new ArrayList<>();
		List<String> prices = new ArrayList<>();
		
		for(int i=1; i<=3; i++) {
			System.out.println("========================================================================");
			WebElement modelName = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/ul/li[" +i+ "]/div/div[5]/a/div[1]/span"));
			models.add(modelName.getText());
			System.out.println(modelName.getText());
			
			excelUtils.setCellData(filePath,"StudyChairs",i,0,modelName.getText());
			
			WebElement brandName = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/ul/li[" +i+ "]/div/div[5]/a/div[1]/div[2]/div"));
			brands.add(brandName.getText());
			System.out.println(brandName.getText());
			
			excelUtils.setCellData(filePath,"StudyChairs",i,1,brandName.getText());
			
			WebElement price = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/ul/li[" +i+ "]/div/div[5]/a/div[2]/span"));
			prices.add(price.getText());
			System.out.println(price.getText());
			
			excelUtils.setCellData(filePath,"StudyChairs",i,2,price.getText());
			
			System.out.println("========================================================================");
			
		}
	}

}
