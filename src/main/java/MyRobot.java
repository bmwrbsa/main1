import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MyRobot extends JFrame {

    public  void Whatsapp() throws InterruptedException {

        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\bmwrb\\Downloads\\shai\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://web.whatsapp.com//");
        driver.manage().window().maximize();


        Thread t = new Thread(()->{
            while (true){
            boolean b = driver.getPageSource().contains("Open WhatsApp on your phone");
                if(!b){
                    System.exit(0);
                    break;
                }

            }
        });
        t.start();





    }

}

