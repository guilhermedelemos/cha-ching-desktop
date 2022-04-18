package chaching;

import java.util.UUID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import lombok.Getter;
import lombok.Setter;

public class ChaChing {

  @Getter @Setter
  private final String version = "1.0.0";

  @Getter
  private final String id = UUID.randomUUID().toString();

  @Getter
  private final Logger logger = LogManager.getLogger("ChaChing");

}
