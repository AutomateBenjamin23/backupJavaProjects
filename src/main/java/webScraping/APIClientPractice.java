//package webScraping;
//import org.apache.http.HttpResponse;
//import org.apache.http.client.HttpClient;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.impl.client.HttpClients;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class APIClientPractice {
//    public static void main(String[] args) throws IOException {
//        HttpClient httpClient = HttpClients.createDefault();
//        HttpGet request = new HttpGet("https://jsonplaceholder.typicode.com/posts");
//
//        HttpResponse response = httpClient.execute(request);
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
//
//        String line;
//        while ((line = reader.readLine()) != null) {
//            System.out.println(line);
//        }
//    }
//}
//
//public class APIClientPractice {
//}
