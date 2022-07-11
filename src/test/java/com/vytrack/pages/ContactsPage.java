package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage extends BasePage {

    @FindBy(css=".input-widget")
    public WebElement pageNumber;


    public WebElement getContactEmail(String email){
        String xpath = "//*[contains(text(), '"+email+"') and @data-column-label='Email']";
        return Driver.get().findElement(By.xpath(xpath));
    }

    @FindBy (xpath="//a[@title='Create Contact']")
     public WebElement createContactButton;

     @FindBy (xpath="//input[@name='oro_contact_form[firstName]']")
     public WebElement nameInputBox;

     @FindBy (xpath="//input[@name='oro_contact_form[lastName]']")
     public WebElement lastnameInputBox;

     @FindBy (xpath="(//button[@type='submit'])[1]")
     public WebElement saveButton;

     @FindBy (xpath="(//h1)[2]")
     public WebElement nameSaved;




}

