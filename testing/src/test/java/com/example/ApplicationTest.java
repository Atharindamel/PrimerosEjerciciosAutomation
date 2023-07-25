package com.example;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.awt.Toolkit;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ApplicationTest {

    @Test
    void shouldAnswerWithTrue() {
        assertTrue(true);
    }
    
    @Test
    void probarChrome(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();  // Con esto abre el Chrome
        driver.manage().window().maximize(); // Maximiza la pantalla
        driver.get("https://www.google.com/"); // Va hasta la dirección URL
        driver.get("https://www.promiedos.com.ar/");
        driver.get("https://chat.openai.com/");
        driver.navigate().back(); // El navegador vuelve una página atrás
        driver.navigate().back();
        driver.navigate().forward(); // El navegador avanza una página
        
        Dimension screenSize = driver.manage().window().getSize();
        driver.manage().window().setSize(new Dimension(screenSize.width / 2, screenSize.height / 2));
        driver.manage().window().setPosition(new org.openqa.selenium.Point((screenSize.width - screenSize.width / 2) / 2, (screenSize.height - screenSize.height / 2) / 2));

        driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");

        driver.manage().window().setSize(new Dimension(screenSize.width, screenSize.height));
        //driver.manage().window().setPosition(new org.openqa.selenium.Point((screenSize.width), (screenSize.height)));

        driver.close(); // Cierra finalmente el navegador
    }
    @Test
    
    void probarFirefox(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();  // Con esto abre el Firefox
        driver.get("https://lxp.eggcooperation.com/content/step/2FN8Rpjhph21U6iIpmbdx1"); // Va hasta la dirección URL
        driver.manage().window().maximize();

        //driver.close();
    }
}
