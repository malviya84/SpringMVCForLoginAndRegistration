package com.loginregistration.springapp;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.loginregistration.pojo.Message;

public class BasicTest {
	
	public RestTemplate restTemplate;

	@Test
	public void test() {
		//fail("Not yet implemented");
		restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/rest/WelcomeService", String.class);
		
		System.out.println("response ="+response.toString());
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}

}
