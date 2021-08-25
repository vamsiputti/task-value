package org.mass.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pageobject extends BaseClass {
	
	
	
	public Pageobject(WebDriver driver) {
		
		PageFactory.initElements(driver, this);		
		}
	
	@FindBy(id="lbl_val_1")
	private WebElement Value1;
	
	@FindBy(id="lbl_val_2")
	private WebElement Value2;
	
	@FindBy(id="lbl_val_3")
	private WebElement Value3;
	
	@FindBy(id="lbl_val_4")
	private WebElement Value4;
	
	@FindBy(id="lbl_val_5")
	private WebElement Value5;
	
	@FindBy(id="txt_val_1")
	private WebElement Value_1;
	
	@FindBy(id="txt_val_2")
	private WebElement Value_2;
	
	@FindBy(id="txt_val_3")
	private WebElement Value_3;
	
	@FindBy(id="txt_val_4")
	private WebElement Value_4;
	
	@FindBy(id="txt_val_5")
	private WebElement Value_5;
	
	
	@FindBy(id="lib_txt_val")
	private WebElement TotalBalance;
	
	@FindBy(id="txt_ttl_val")
	private WebElement TotalBalancevalue;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getValue1() {
		return Value1;
	}

	public WebElement getValue2() {
		return Value2;
	}

	public WebElement getValue3() {
		return Value3;
	}

	public WebElement getValue4() {
		return Value4;
	}

	public WebElement getValue5() {
		return Value5;
	}

	public WebElement getValue_1() {
		return Value_1;
	}

	public WebElement getValue_2() {
		return Value_2;
	}

	public WebElement getValue_3() {
		return Value_3;
	}

	public WebElement getValue_4() {
		return Value_4;
	}

	public WebElement getValue_5() {
		return Value_5;
	}

	public WebElement getTotalBalance() {
		return TotalBalance;
	}

	public WebElement getTotalBalancevalue() {
		return TotalBalancevalue;
	}

	
	
	
	
	
}
