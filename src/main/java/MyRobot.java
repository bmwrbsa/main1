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

public class MyRobot  {
    public static void main(String[] args) {




        Window();



    }
    public static void Window (){
            JFrame frame= new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setBounds(0,0,500,500);




        JButton button  = new JButton("click here");
        button.setBounds(200,200,100,100);
        frame.add(button);

      //  String Title = JOptionPane.showInputDialog(null,"enter your message");

        button.addActionListener((event)->{

            try {
                Whatsapp();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }



        });






    }

    public static void Whatsapp() throws InterruptedException {

        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\bmwrb\\Downloads\\shai\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://web.whatsapp.com//");
        driver.manage().window().maximize();
        List <WebElement> elementList= driver.findElements(By.className("_13NKt copyable-text selectable-text"));
        WebElement NameWhatsApp = elementList.get(0);
      WebElement userINput =  driver.findElement(By.className ("_13NKt copyable-text selectable-text"));
      userINput.sendKeys("משה וינרב");
        Thread t = new Thread(()->{
            while (true){
0                boolean b = driver.getPageSource().contains("Open WhatsApp on your phone");
                if(!b){
                    Window();
                    break;
                }

            }
        });
        t.start();





    }

}

