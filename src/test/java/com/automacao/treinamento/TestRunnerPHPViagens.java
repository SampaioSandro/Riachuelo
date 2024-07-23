package com.automacao.treinamento;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

@DisplayName("Sampaio aprendendo MagaluSSS")

public class TestRunnerPHPViagens {
    @Test
    @DisplayName("Primeiro teste, fazendo login ===> Magalu <===")
    public void testFazendoLogin() {
//       Abrir o Chrome - Webdrivermanager sincroniza o driver com o seu navegador automaticamente

        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();

//      Acessar o site da Magalu
        navegador.get("https://phptravels.net/login");

//      Informar E-mail e Senha e Clicar no botao entrar
        navegador.findElement(By.id("email")).sendKeys("user@phptravels.com");
        navegador.findElement(By.name("password")).sendKeys("demouser");
        navegador.findElement(By.id("submitBTN")).click();

//      Verificar Profile

        navegador.findElement(By.xpath("//*[@id=\"fadein\"]/main/div/div/div/div[2]/ul/li[3]/a")).click();

//        Informar dados pessoais

        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        navegador.findElement(By.id("First Name")).clear();
        navegador.findElement(By.id("First Name")).sendKeys("Sandro");
        navegador.findElement(By.id("Last Name")).clear();
        navegador.findElement(By.id("Last Name")).sendKeys("Sampaio");
        navegador.findElement(By.id("Phone")).clear();
        navegador.findElement(By.id("Phone")).sendKeys("982726230");

//        Email é protegido, não permite alterar.

//        navegador.findElement(By.xpath("//*[@id=\"profile\"]/div/div[3]/div[2]/div/div/button/div/div/div/span/text()")).clear();
//        navegador.findElement(By.xpath("//*[@id=\"profile\"]/div/div[3]/div[2]/div/div/button/div/div/div/span/text()")).sendKeys("Brasil");
//        navegador.findElement(By.xpath("//*[@id=\"profile\"]/div/div[4]/div[1]/div/div/button/div/div/div/span")).clear();
//        navegador.findElement(By.xpath("//*[@id=\"profile\"]/div/div[4]/div[1]/div/div/button/div/div/div/span")).sendKeys("Brasil");

        navegador.findElement(By.id("State")).clear();
        navegador.findElement(By.id("State")).sendKeys("São Paulo");
        navegador.findElement(By.id("City")).clear();
        navegador.findElement(By.id("City")).sendKeys("Guarulhos");
        navegador.findElement(By.id("Address")).clear();
        navegador.findElement(By.id("Address")).sendKeys("Rua Feira Grande, 316");
    }
}