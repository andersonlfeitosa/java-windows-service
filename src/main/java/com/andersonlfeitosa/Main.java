package com.andersonlfeitosa;

import java.util.UUID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

  private static final Logger LOGGER = LogManager.getLogger(Main.class);

  private static final long SONECA = 1000;

  public static void main(String[] args) {
    while (true) {
      LOGGER.info("ID: " + UUID.randomUUID().toString());
      sleep();
    }
  }

  private static void sleep() {
    try {
      Thread.sleep(SONECA);
    } catch (InterruptedException e) {
      LOGGER.error(e);
    }
  }

}
