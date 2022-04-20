package chaching.modules.initialization;

import java.awt.Color;

import javax.swing.JFrame;

import chaching.core.StandardUI;

public class SplashUI extends StandardUI {

  public SplashUI() {
    super("Splash");
    this.build();
  }

  @Override
  protected void build() {
    String method = new Object() {}.getClass().getEnclosingMethod().getName();
    this.getLogger().debug(this.getClassAndMethodNames(method));
    this.setUndecorated(true);
    // this.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
    this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    this.setSize(650, 400);
    this.setLocationRelativeTo(null);
    // setIconImage(new ImageIcon(imgURL).getImage());
    this.getContentPane().setBackground(new Color(52, 101, 164));
  }
  
}
