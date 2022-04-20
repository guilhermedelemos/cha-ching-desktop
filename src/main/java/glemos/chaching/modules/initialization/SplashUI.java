package glemos.chaching.modules.initialization;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

import glemos.chaching.core.StandardUI;

public class SplashUI extends StandardUI {

  private JProgressBar progressBar;

  // protected Logger logger = LoggerFactory.getLogger(SplashUI.class);


  @Override
  protected void build() {
    this.setTitle("Cha-Ching! Loading...");
    // this.logger.debug("SplashUI.build()");
    this.setUndecorated(true);
    // this.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
    this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    this.setSize(650, 400);
    this.setLocationRelativeTo(null);
    // setIconImage(new ImageIcon(imgURL).getImage());
    this.getContentPane().setBackground(new Color(52, 101, 164));

    this.progressBar = new JProgressBar();
    this.progressBar.setValue(0);
    this.progressBar.setIndeterminate(true);
    // this.progressBar.setMaximum(newLength);
    // this.progressBar.setValue(newValue);
    // this.progressBar.setIndeterminate(false);

    this.getContentPane().add(this.progressBar, BorderLayout.SOUTH);
  }

  @Override
  public void display() {
    this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
    EventQueue.invokeLater(() -> this.setVisible(true));
  }

  @Override
  public void destroy() {
    this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    this.setVisible(false);
    this.dispose();
  }
  
}
