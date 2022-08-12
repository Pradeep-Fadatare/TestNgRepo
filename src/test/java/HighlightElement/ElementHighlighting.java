package HighlightElement;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ElementHighlighting {

    public void highlight(WebElement ele, WebDriver driver){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.boarder='2px solid red'",ele);
    }
}
