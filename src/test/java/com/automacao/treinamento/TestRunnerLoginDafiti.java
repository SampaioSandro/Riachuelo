package com.automacao.treinamento;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

@DisplayName("Sampaio aprendendo Dafiti")

public class TestRunnerLoginDafiti {
    @Test
    @DisplayName("Primeiro teste, fazendo login ===> Dafiti <===")
    public void testFazendoLogin()  {
//       Abrir o Chrome - Webdrivermanager sincroniza o driver com o seu navegador automaticamente

        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();

//      Acessar o site da Riachuelo
        navegador.get("https://www.dafiti.com.br");

        navegador.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div/div/div[3]/div[1]/div[1]")).click();

        //        Clicar no botao entrar

        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        navegador.findElement(By.id("LoginForm_email")).sendKeys("sandro.sampaio70@gmail.com");
        navegador.findElement(By.id("LoginForm_password")).sendKeys("Teste2024@");
        navegador.findElement(By.id("customer-account-login")).click();

//        Pesquisar produto  ===> ok
//        navegador.findElement(By.id("input-search")).sendKeys("Bermuda Masculina ");
//        navegador.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/div[2]/div/div/div[2]/div/form/div[1]/button")).click();


   }




}
