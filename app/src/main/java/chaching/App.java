package chaching;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Properties;
import java.util.UUID;

import javax.swing.JFrame;

import com.google.common.hash.Hashing;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import chaching.ui.MainUI;
import lombok.Getter;

public class App {

  @Getter
  private final String name;

  @Getter
  private final String version;

  @Getter
  private final String id;

  @Getter
  private final Logger logger;

  @Getter
  private final JFrame mainUI;

  public App() {
    this.name = "Cha-Ching!"; // TO-DO get from config
    this.version = "1.0.1"; // TO-DO get from config
    this.id = UUID.randomUUID().toString();
    this.logger = LogManager.getLogger(this.name + this.version);
    this.logger.debug("debug");
    this.mainUI = new MainUI();
  }

  public String getHashedID() {
    this.logger.debug("debug");
    return Hashing.sha256().hashString(this.id, StandardCharsets.UTF_8).toString();
  }

  public void run(String args[]) {
    this.logger.debug("debug");
    this.logger.debug("args " + Arrays.toString(args));
    this.logProperties();
    this.mainUI.setVisible(true);
  }

  public void logProperties() {
    this.logger.debug("debug");
    try (InputStream input = App.class.getClassLoader().getResourceAsStream("application.properties")) {
      Properties prop = new Properties();

      if (input == null) {
        this.logger.error("Sorry, unable to find application.properties");
        return;
      }

      // load a properties file
      prop.load(input);

      // get the property value and print it out
      // System.out.println(prop.getProperty("version"));

      this.logger.info("Application properties");
      prop.forEach((key, value) -> this.logger.info(key + " = " + value));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  public static void main(String[] args) {
    App app = new App();
    app.run(args);
  }

}
