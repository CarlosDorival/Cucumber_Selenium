package seleniumgluecode;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;

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


    }

    @Then("^Nos debe redirigir a la pantalla comics$")
    public void nos_debe_redirigir_a_la_pantalla_comics() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }




}
