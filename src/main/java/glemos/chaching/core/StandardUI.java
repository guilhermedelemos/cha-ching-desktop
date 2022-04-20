package glemos.chaching.core;

import java.awt.EventQueue;

import javax.swing.JFrame;

public abstract class StandardUI extends JFrame {

  public StandardUI() {
    super();
    this.build();
  }

  public StandardUI(String title) {
    super(title);
    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  }

  protected abstract void build();

  public void display() {
    EventQueue.invokeLater(() -> this.setVisible(true));
  }

  public void destroy() {
    this.setVisible(false);
    this.dispose();
  }

}
