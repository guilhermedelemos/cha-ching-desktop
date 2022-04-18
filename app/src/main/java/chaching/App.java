/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package chaching;

import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

import javax.swing.*;

import com.google.common.hash.Hashing;

public class App extends ChaChing {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        try (InputStream input = App.class.getClassLoader().getResourceAsStream("chaching.properties")) {
        //new FileInputStream("./chaching.properties")) {

            Properties prop = new Properties();

            if (input == null) {
                System.out.println("Sorry, unable to find chaching.properties");
                return;
            }

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            // System.out.println(prop.getProperty("version"));

            prop.forEach((key, value) -> System.out.println(key + " = " + value));

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        System.out.println(new App().getGreeting());
        new App().run();
    }

    public void run() {
        this.getLogger().debug("run()");
        this.getLogger().info("ID " + this.getId());
        this.getLogger().info("HASH " + Hashing.sha256().hashString(this.getId(), StandardCharsets.UTF_8));
        // JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Java Swing GUI Application - Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        // frame.setIconImage(new ImageIcon(imgURL).getImage());
        
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

        m22.addActionListener(e -> frame.dispose());
    
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
    
        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }
}
