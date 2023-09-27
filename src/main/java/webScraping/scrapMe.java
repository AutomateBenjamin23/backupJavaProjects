package webScraping;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
public class scrapMe {
    public static void main(String[] args) {
        String url = "https://www.supremenewyork.com";

        try {
            // Send HTTP GET request to the website
            Document document = Jsoup.connect(url).get();

            // Extract the article elements
            Elements articles = document.select(".archive-item");

            // Loop through the articles and retrieve the title and URL
            for (Element article : articles) {
                String title = article.select(".archive-item-title").text();
                String articleUrl = article.select(".archive-item-title a").attr("href");

                System.out.println("Title: " + title);
                System.out.println("URL: " + articleUrl);
                System.out.println("---------------------------");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
