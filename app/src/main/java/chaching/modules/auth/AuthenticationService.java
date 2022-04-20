package chaching.modules.auth;

import chaching.core.StandardService;

public class AuthenticationService extends StandardService {

  public void authenticate() {
    String method = new Object() {}.getClass().getEnclosingMethod().getName();
    this.getLogger().debug(this.getClassAndMethodNames(method));
  }
  
}
