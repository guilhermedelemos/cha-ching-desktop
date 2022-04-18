package chaching;

import org.apache.logging.log4j.LogManager;

import lombok.Getter;

public class Logger {

  private static volatile Logger instance;
  
  @Getter
  private final org.apache.logging.log4j.Logger logger;

  private Logger() {
    this.logger = LogManager.getLogger("ChaChing");
  }

  public static Logger getInstance() {
    Logger result = instance;
    if (result != null) {
      return result;
    }
    synchronized(Logger.class) {
      if (instance == null) {
        instance = new Logger();
      }
      return instance;
    }
  }

  public void info(String message) {
    this.logger.info(message);
  }

  public void warn(String message) {
    this.logger.warn(message);
  }

  public void debug(String message) {
    this.logger.debug(message);
  }

  public void error(String message) {
    this.logger.error(message);
  }

}
