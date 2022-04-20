package glemos.chaching.modules.initialization;

import org.springframework.stereotype.Component;

import glemos.chaching.DashboardUI;
import glemos.chaching.core.StandardController;

@Component
public class InitializerController extends StandardController {
  
  public void initialize() {
    SplashUI splash = new SplashUI();
    splash.display();
    
    // Simulate system loading
    try {
      Thread.sleep(3000);
    } catch(Exception e) {
      System.exit(1);
    }
    splash.destroy();

    // LOGIN

    // Show application main window
    DashboardUI dashboard = new DashboardUI();
    dashboard.display();
  }

}
