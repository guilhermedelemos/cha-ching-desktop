package glemos.chaching;

import java.awt.BorderLayout;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import glemos.chaching.core.StandardUI;

public class DashboardUI extends StandardUI {

  private JMenuBar menu;

  @Override
  protected void build() {
    // this.logger.info("Dashboard.build()");
    this.setTitle("Cha-Ching!");
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setSize(800, 600);
    this.setLocationRelativeTo(null);
    // setIconImage(new ImageIcon(imgURL).getImage());

    menu = new JMenuBar();
    JMenu menuFile = new JMenu("File");
    JMenu menuHelp = new JMenu("Help");
    menu.add(menuFile);
    menu.add(menuHelp);
    JMenuItem menuOpen = new JMenuItem("Open");
    JMenuItem menuItemExit = new JMenuItem("Exit");
    JMenuItem menuAbout = new JMenuItem("About");
    menuFile.add(menuOpen);
    menuFile.addSeparator();
    menuFile.add(menuItemExit);
    menuHelp.addSeparator();
    menuHelp.add(menuAbout);

    menuItemExit.addActionListener(e -> this.dispose());
    
    this.getContentPane().add(menu, BorderLayout.NORTH);
  }
  
}
