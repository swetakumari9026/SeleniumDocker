package com.newtours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {

    private WebDriver driver;
    private WebDriverWait wait;
    @FindBy(name="firstName")
    private WebElement firstNameText;

    @FindBy(name="lastName")
    private WebElement lastName;

    @FindBy(name="email")
    private WebElement email;

    @FindBy(name="password")
    private WebElement password;

    @FindBy(name="confirmPassword")
    private WebElement confirmPassword;

    @FindBy(name="register")
    private WebElement submitButton;



    public RegistrationPage(WebDriver driver){
        this.driver=driver;
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver,this);
    }

    public void goTo(){
        this.driver.get("http://newtours.demoaut.com/mercuryregister.php");
        this.wait.until(ExpectedConditions.visibilityOf(this.firstNameText));
    }

    public void enterUSerDetails(String fistName,String lastName){
        this.firstNameText.sendKeys(fistName);
        this.lastName.sendKeys(lastName);
    }

    public void enterUSerCredentialsDetails(String username,String password){
        this.email.sendKeys(username);
        this.password.sendKeys(password);
        this.confirmPassword.sendKeys(password);
    }

    public void submit(){
        this.submitButton.click();
    }







}
