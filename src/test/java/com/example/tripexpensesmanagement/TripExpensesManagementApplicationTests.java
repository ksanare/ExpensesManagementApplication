package com.example.tripexpensesmanagement;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TripExpensesManagementApplicationTests {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void contextLoads() {
        // Test if the context loads successfully
        assertThat(restTemplate).isNotNull();
    }

    @Test
    public void testApplicationStarts() {
        // Test if the application starts and is accessible
        String url = "http://localhost:" + port + "/";
        String response = restTemplate.getForObject(url, String.class);
        assertThat(response).contains("Welcome to Trip Expenses Management");
    }

    // Add more tests as needed for your application functionality
}