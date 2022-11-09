package com.rama.rest.reciever;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReceiverController {
  private static final Logger LOGGER = LoggerFactory.getLogger(ReceiverController.class);

  @GetMapping("/receiver/get")
  public String getDetail() throws InterruptedException {
    LOGGER.info("Receiver request:");
   // Thread.sleep(8000);
    return "Get Data from receiver";
  }

  @PostMapping ("/receiver/post")
  public String saveDetail() throws InterruptedException {
    LOGGER.info("Receiver save request:");

    return "Post data save from receiver";
  }

  @PutMapping ("/receiver/put")
  public String updatetDetail() throws InterruptedException {
    LOGGER.info("Receiver update request:");

    return "put update from receiver";
  }

  @DeleteMapping("/receiver/delete")
  public String deleteDetail() throws InterruptedException {
    LOGGER.info("Receiver delete request:");

    return "Delete from receiver";
  }
}
