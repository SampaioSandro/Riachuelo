package com.automacao.treinamento;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

@DisplayName("Sampaio aprendendo Dafiti")

public class TestRunnerLoginCea {
    @Test
    @DisplayName("Primeiro teste, fazendo login ===> C & A <===")
    public void testFazendoLogin()  {
//       Abrir o Chrome - Webdrivermanager sincroniza o driver com o seu navegador automaticamente

        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();

//      Acessar o site da C&A
        navegador.get("https://www.cea.com.br");

//      navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

//      Clicar no botao minha conta
        navegador.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div[3]/div/div/section/div/div[5]/div/div/div/div/p[1]")).click();

        //      Clicar no botao entrar

//        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

        navegador.findElement(By.cssSelector("body > div.cea-store-drawer-0-x-drawer.cea-store-drawer-0-x-opened.right-0.fixed.top-0.bottom-0.bg-base.z-999.flex.flex-column > div > div.cea-store-drawer-0-x-childrenContainer.flex.flex-grow-1 > div > div > div > div > div:nth-child(2) > div > div > div:nth-child(1) > div > div > a > button > div")).click();


        //      Clicar em Entrar com e-mail e senha
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        navegador.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[3]/div/div/div/div[1]/div[1]/ul/li[1]/div/button/div")).click();
//        navegador.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[3]/div/div/div/div[2]/div/div/form/div[2]/div/button/div")).click();



   }




}
