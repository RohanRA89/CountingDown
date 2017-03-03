package com.ironyard.api;

import com.ironyard.dto.TIYResponse;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

import static java.lang.String.format;

/**
 * Created by rohanayub on 2/24/17.
 */
public class ApiHelper {
    Integer number;
    public ApiHelper(Integer number) {
        this.number = number;
    }

    public TIYResponse passNumber() {
        RestTemplate commandSay = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.95 Safari/537.36");

        HttpEntity entity = new HttpEntity(headers);

        Random r = new Random();
        int i = r.nextInt(5);
        String[] myStringArray = new String[]{"http://192.168.2.42:8080/rest/call/%s","http://192.168.2.90:8080/rest/call/%s",
                "http://192.168.2.99:8080/rest/call/%s", "http://192.168.2.144:8080/rest/call/%s", "http://192.168.2.185:8080/rest/call/%s"};
        String url = format(myStringArray[i],number);


        System.out.println(url);
        HttpEntity response = commandSay.exchange(url, HttpMethod.GET, entity, TIYResponse.class);
        TIYResponse halNumber = (TIYResponse) response.getBody();
        return halNumber;
    }

}
