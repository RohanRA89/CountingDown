package com.ironyard;

import com.ironyard.dto.TIYResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CountingDownApplicationTests {

	@Test
	public void contextLoads() {
		RestTemplate restTemplate = new RestTemplate();
		TIYResponse number = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", TIYResponse.class);
		System.out.println(number.toString());

	}
}
