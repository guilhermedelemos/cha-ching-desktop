package chaching.core;

import javax.swing.JFrame;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import lombok.Getter;

public abstract class StandardUI extends JFrame {

  @Getter
  private final Logger logger = LogManager.getLogger("ChaChing");

  public StandardUI() {
    super();
  }

  public StandardUI(String title) {
    super(title);
  }

  protected abstract void build();

  public String getClassName() {
    return this.getClass().getSimpleName();
  }

  public String getMethodName() {
    return new Object() {}.getClass().getEnclosingMethod().getName();
  }

  public String getClassAndMethodNames(String method) {
    return this.getClassName() + "." + method + "()";
  }
  
}
