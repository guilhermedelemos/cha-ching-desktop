package chaching;

import java.util.UUID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import lombok.Getter;

public class ChaChing {
  
  @Getter
  private final String id;

  @Getter
  private final Logger logger;

  public ChaChing() {
    this.id = UUID.randomUUID().toString();
    this.logger = LogManager.getLogger("Cha-Ching!1.0.1"); // TO-DO get from a configuration file
    this.logger.debug("debug");
  }

}
