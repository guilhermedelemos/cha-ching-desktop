package chaching;

import javax.swing.*;

public class Dialog {
  public void demo(JFrame frame) {
    JOptionPane.showMessageDialog(frame,
    "Eggs are not supposed to be green.");
    JOptionPane.showMessageDialog(frame,
    "Eggs are not supposed to be green.",
    "Inane warning",
    JOptionPane.WARNING_MESSAGE);
    JOptionPane.showMessageDialog(frame,
    "Eggs are not supposed to be green.",
    "Inane error",
    JOptionPane.ERROR_MESSAGE);
    JOptionPane.showMessageDialog(frame,
    "Eggs are not supposed to be green.",
    "A plain message",
    JOptionPane.PLAIN_MESSAGE);
    //Custom button text
Object[] options = {"Yes, please",
"No, thanks",
"No eggs, no ham!"};
int n = JOptionPane.showOptionDialog(frame,
"Would you like some green eggs to go "
+ "with that ham?",
"A Silly Question",
JOptionPane.YES_NO_CANCEL_OPTION,
JOptionPane.QUESTION_MESSAGE,
null,
options,
options[2]);


Object[] possibilities = {"ham", "spam", "yam"};
String s = (String)JOptionPane.showInputDialog(
                    frame,
                    "Complete the sentence:\n"
                    + "\"Green eggs and...\"",
                    "Customized Dialog",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    possibilities,
                    "ham");
  }
}
