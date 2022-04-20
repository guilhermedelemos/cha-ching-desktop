package chaching.modules.initialization;

import chaching.core.StandardService;

public class InitializerService extends StandardService {

  private SplashUI splash;
  
  public void initialize() {
    String method = new Object() {}.getClass().getEnclosingMethod().getName();
    this.getLogger().debug(this.getClassAndMethodNames(method));
    this.splash = new SplashUI();
    this.splash.setVisible(true);

    try {
      Thread.sleep(3000);
    } catch(Exception e) {
      this.getLogger().error("Error initializing the system. " + e.getMessage());
      System.exit(1);
    }
    this.splash.setVisible(false);
    this.splash.dispose();
  }

}
