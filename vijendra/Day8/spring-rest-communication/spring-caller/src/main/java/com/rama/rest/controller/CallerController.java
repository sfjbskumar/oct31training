package com.rama.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class CallerController {
  private static final Logger LOGGER = LoggerFactory.getLogger(CallerController.class);
  @Autowired
  private RestTemplate restTemplate;
  @Value("${get.receive.url}")
  String receivegetUrl; //http://localhost:10082/receiver/get

  @Value("${post.receive.url}")
  String receivepostUrl; //http://localhost:10082/receiver/post

  @Value("${put.receive.url}")
  String receiveputUrl; //http://localhost:10082/receiver/put

  @Value("${delete.receive.url}")
  String receivedeleteUrl; //http://localhost:10082/receiver/delete

  @GetMapping("/caller/get")
  public String getDetail() {
    ResponseEntity<String> response
      = restTemplate.exchange(receivegetUrl,HttpMethod.GET, null,String.class);
    LOGGER.info(response.getStatusCode().toString());
    LOGGER.info(response.getBody());
    return "caller receive data:"+response.getBody();
  }

  @PostMapping("/caller/post")
  public String postDetail() {
    ResponseEntity<String> response
            = restTemplate.exchange(receivepostUrl, HttpMethod.POST,null, String.class);
    LOGGER.info(response.getStatusCode().toString());
    LOGGER.info(response.getBody());
    return "caller receive data:"+response.getBody();
  }

  @PutMapping ("/caller/put")
  public String putDetail() {
    ResponseEntity<String> response
            = restTemplate.exchange(receiveputUrl, HttpMethod.PUT,null, String.class);
    LOGGER.info(response.getStatusCode().toString());
    LOGGER.info(response.getBody());
    return "caller receive data:"+response.getBody();
  }

  @DeleteMapping("/caller/delete")
  public String deletetDetail() {
    ResponseEntity<String> response
            = restTemplate.exchange(receivedeleteUrl, HttpMethod.DELETE,null, String.class);
    LOGGER.info(response.getStatusCode().toString());
    LOGGER.info(response.getBody());
    return "caller receive data:"+response.getBody();
  }
}
