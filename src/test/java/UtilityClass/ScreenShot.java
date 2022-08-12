package UtilityClass;

import Common.LaunchBrowser;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class ScreenShot extends LaunchBrowser {

    public void screenshot() throws IOException {
        Date currentdate=new Date();
        String modifiedDate=currentdate.toString().replace(" ","-");
//        System.out.println(modifiedDate);
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File(".//screenshot/.png"));
    }
}
