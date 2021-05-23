package seleniumgluecode;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class test {

    private ChromeDriver driver;


    @Given("^El usuario se encuentra en la pagina Home$")
    public void el_usuario_se_encuentra_en_la_pagina_Home() throws Throwable {
      System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
      driver = new ChromeDriver();
      driver.get("https://imalittletester.com/");
      driver.manage().window().maximize();

    }

    @When("^Hace click sobre el botón the little tester comics$")
    public void hace_click_sobre_el_botón_the_little_tester_comics() throws Throwable {
        WebElement titleComicsLocator = driver.findElement(By.id("menu-item-2008"));
        titleComicsLocator.click();

    }

    @Then("^Nos debe redirigir a la pantalla comics$")
    public void nos_debe_redirigir_a_la_pantalla_comics() throws Throwable {
        WebElement pageTitleLocator = driver.findElement(By.className("page-title"));
        Assert.assertTrue( "No se redirecciono correctamente a la pagina de comics", pageTitleLocator.isDisplayed());
        Assert.assertEquals( "Category: comics", pageTitleLocator.getText());



    }




}
