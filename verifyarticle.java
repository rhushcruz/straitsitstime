import junit.framework.Test;
import junit.framework.TestSuite;

public class Verifyarticle {

  public static Test suite() {
    TestSuite suite = new TestSuite();
    suite.addTestSuite(verifyarticle.class);
    return suite;
  }

  public static void main(String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}
