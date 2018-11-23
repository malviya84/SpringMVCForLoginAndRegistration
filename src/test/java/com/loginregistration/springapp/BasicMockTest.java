package com.loginregistration.springapp;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.configureFor;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.github.tomakehurst.wiremock.WireMockServer;

public class BasicMockTest {

	 private RestTemplate restTemplate;
	    private WireMockServer wireMockServer;

	    @BeforeEach
	   public void configureSystemUnderTest() {
	        this.restTemplate = new RestTemplate();
	        this.wireMockServer = new WireMockServer(options()
	                .bindAddress("127.0.0.1")
	                .port(8080)
	        );
	        this.wireMockServer.start();
	        configureFor("127.0.0.1", 8080);
	    }

	    @Test
	    @DisplayName("Should ensure that WireMock server was started")
	    public void shouldEnsureThatServerWasStarted() {
	    	
	    	  this.restTemplate = new RestTemplate();
		        this.wireMockServer = new WireMockServer(options()
		                .bindAddress("127.0.0.1")
		                .port(8080)
		        );
		        this.wireMockServer.start();
		        this.wireMockServer.startRecording("http://localhost:8080");
		       // this.wireMockServer.enableRecordMappings(mappingsFileSource, filesFileSource);
		        configureFor("localhost", 8080);
		        stubFor(get(urlEqualTo("/rest/WelcomeService")).willReturn(aResponse().withHeader("Content-Type", "application/json")
	                .withStatus(200)
	                .withBody("You reached a valid WireMock endpoint")
	        ));
	      //  HttpEntity<String> httpRequest = createHttpRequest();
	        
	        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/rest/WelcomeService", String.class);
	        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	        assertEquals(response.getBody().toString(),"You reached a valid WireMock endpoint","verification of mock");
	    }

	    @AfterEach
	   public void stopWireMockServer() {
	        this.wireMockServer.stop();
	    }

}
