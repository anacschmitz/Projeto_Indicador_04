package utilitaria;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Componentes {
    private static WebDriver driver;

    public void inicializarHtml(){
        String chromedriver = System.getProperty("user.dir") +
                "/Driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromedriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("file:///" + System.getProperty("user.dir") + "/Driver/componentes.html");
    }

    public void testarBotaoCadastrar(){
        driver.findElement(By.id("elementosForm:cadastrar")).click();
    }

    public void testarCampoNome() {
        driver.findElement(By.id("elementosForm:nome")).sendKeys("Ana Carolina");
    }
    public void validarCampoNome(){
        Assert.assertEquals("Ana Carolina", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
    }
    public void testarCampoSobrenome() {
        driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Schmitz da Silva");
    }
    public void validarCampoSobrenome(){
        Assert.assertEquals("Schmitz da Silva", driver.findElement(By.id("elementosForm:sobrenome")).getAttribute("value"));
    }

    public void testarGenero(){
        driver.findElement(By.id("elementosForm:sexo:1")).click();
    }
    public void validarGenero(){
        driver.findElement(By.id("elementosForm:sexo:1")).isSelected();
    }

    public void testarSugestao() {
        driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Inserir musculação como opção de esporte");
    }
    public void validarSugestao(){
        Assert.assertEquals("Inserir musculação como opção de esporte", driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));
    }

    public void testarComidaFavorita(){
        driver.findElement(By.id("elementosForm:comidaFavorita:3")).click();
    }
    public void validarComidaFavorita() {
        Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:3")).isSelected());
    }
    public void testarEscolaridade(){
        WebElement seletor = driver.findElement(By.id("elementosForm:escolaridade"));
        Select selecao = new Select(seletor);
        selecao.selectByValue("superior");
    }

    public void testarEsporte(){
        WebElement seletor = driver.findElement(By.id("elementosForm:esportes"));
        Select selecao = new Select(seletor);
        selecao.selectByValue("futebol");
    }

    public void testarDadosObrigatorios(){
        WebElement nomeElement = driver.findElement(By.id("descNome")).findElement(By.tagName("span"));
        WebElement sobrenomeElement = driver.findElement(By.id("descSobrenome")).findElement(By.tagName("span"));
        WebElement sexoElement = driver.findElement(By.id("descSexo")).findElement(By.tagName("span"));

        Assert.assertEquals("Ana Carolina", nomeElement.getText());
        Assert.assertEquals("Schmitz da Silva", sobrenomeElement.getText());
        Assert.assertEquals("Feminino", sexoElement.getText());
    }

    public void validarCadastroComida(){
        WebElement comidaElement = driver.findElement(By.id("descComida")).findElement(By.tagName("span"));
        Assert.assertEquals("Vegetariano", comidaElement.getText());
    }
    public void validarCadastroEscolaridade(){
        WebElement escolaridadeElement = driver.findElement(By.id("descEscolaridade")).findElement(By.tagName("span"));
        Assert.assertEquals("superior", escolaridadeElement.getText());
    }

    public void validarCadastroEsportes(){
        WebElement esporteElement = driver.findElement(By.id("descEsportes")).findElement(By.tagName("span"));
        Assert.assertEquals("Futebol", esporteElement.getText());
    }
    public void validarCadastroSugestoes() {
        WebElement sugestaoElement = driver.findElement(By.id("descSugestoes")).findElement(By.tagName("span"));
        Assert.assertEquals("Inserir musculação como opção de esporte", sugestaoElement.getText());
    }
}
