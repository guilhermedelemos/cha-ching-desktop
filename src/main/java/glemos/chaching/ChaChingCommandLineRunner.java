package glemos.chaching;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import glemos.chaching.modules.initialization.InitializerController;

@Component
public class ChaChingCommandLineRunner implements CommandLineRunner {

  @Autowired
  public InitializerController initializerController;

  @Override
  public void run(String... args) {
    initializerController.initialize();
  }

}
