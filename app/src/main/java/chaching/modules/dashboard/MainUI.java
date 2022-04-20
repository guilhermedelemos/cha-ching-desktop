package chaching.modules.dashboard;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import chaching.core.StandardUI;
import lombok.Getter;

public class MainUI extends StandardUI {

  @Getter
  private final Logger logger = LogManager.getLogger("ChaChing");

  public MainUI() {
    super("Cha-Ching!"); // TO-DO get from config file
    this.getLogger().debug(this.getClassName());
    this.build();
  }

  protected void build() {
    String method = new Object() {}.getClass().getEnclosingMethod().getName();
    this.getLogger().debug(this.getClassAndMethodNames(method));
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setSize(800, 600);
    this.setLocationRelativeTo(null);
    // setIconImage(new ImageIcon(imgURL).getImage());

    JMenuBar mb = new JMenuBar();
    JMenu m1 = new JMenu("File");
    JMenu m2 = new JMenu("Help");
    mb.add(m1);
    mb.add(m2);
    JMenuItem m11 = new JMenuItem("Open");
    JMenuItem m22 = new JMenuItem("Exit");
    JMenuItem m33 = new JMenuItem("About");
    m1.add(m11);
    m1.addSeparator();
    m1.add(m22);
    m2.addSeparator();
    m2.add(m33);

    m22.addActionListener(e -> this.dispose());
    
    //Creating the panel at bottom and adding components
    JPanel panel = new JPanel(); // the panel is not visible in output
    JLabel label = new JLabel("Enter Text");
    JTextField tf = new JTextField(10); // accepts upto 10 characters
    JButton send = new JButton("Send");
    JButton reset = new JButton("Reset");
    panel.add(label); // Components Added using Flow Layout
    panel.add(tf);
    panel.add(send);
    panel.add(reset);
    
    // Text Area at the Center
    JTextArea ta = new JTextArea();
    
    //Adding Components to the this.
    this.getContentPane().add(BorderLayout.SOUTH, panel);
    this.getContentPane().add(BorderLayout.NORTH, mb);
    this.getContentPane().add(BorderLayout.CENTER, ta);
    // this.setVisible(true);
  }
  
}
