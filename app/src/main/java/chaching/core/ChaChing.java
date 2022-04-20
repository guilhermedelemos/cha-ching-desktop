package chaching.core;

import java.util.UUID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import lombok.Getter;

public abstract class ChaChing {
  
  @Getter
  private final String id;

  @Getter
  private final Logger logger;

  public ChaChing() {
    this.id = UUID.randomUUID().toString();
    this.logger = LogManager.getLogger("Cha-Ching!1.0.1"); // TO-DO get from a configuration file
  }

  public String getClassName() {
    return this.getClass().getSimpleName();
  }

  public String getMethodName() {
    return new Object() {}.getClass().getEnclosingMethod().getName();
  }

  public String getClassAndMethodNames(String method) {
    return this.getClassName() + "." + method + "()";
  }

}
