package NaveenAutomation.java.Streams;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.net.ssl.HttpsURLConnection;

public class FindBrokenLinks {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://youtube.com");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println("No of links are " + links.size());

        List<String> urlList = new ArrayList<String>();

        for (WebElement e : links) {
            String url = e.getAttribute("href");
            //urlList.add(url);
            checkBrokenLink(url);
        }
        long stTime = System.currentTimeMillis();
        urlList.parallelStream().forEach(e -> checkBrokenLink(e));
        long endTime = System.currentTimeMillis();

        //parallelStream- total time taken: 18433 = 18.4 seconds!
        //stream- total time taken: 159236 = 159 seconds.

        System.out.println("total time taken: " +(endTime-stTime));
        driver.quit();
    }
    public static void checkBrokenLink (String linkUrl) {

        try{
            URL url = new URL(linkUrl);
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
            httpsURLConnection.setConnectTimeout(5000);
            httpsURLConnection.connect();

            if(httpsURLConnection.getResponseCode() >=400) {
                System.out.println(linkUrl + " ---> " + httpsURLConnection.getResponseMessage() + "is a broken link");
            }
            else {
                System.out.println(linkUrl + " ---> " + httpsURLConnection.getResponseMessage());
            }
        }

        catch (Exception e) {

        }

    }
}
