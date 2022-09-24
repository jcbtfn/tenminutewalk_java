package tenminutewalk_java;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class RouteCheckerTest {
  
  @Test 
  public void appHasAGreeting() {
      RouteChecker doesItWork = new RouteChecker();
      ArrayList<String> routetesting = new ArrayList<>(Arrays.asList("w", "s", "e", "e", "n", "n", "e", "s", "w", "w"));
      assertTrue(doesItWork.routeCheck(routetesting));
      ArrayList<String> routetesting2 = new ArrayList<>(Arrays.asList("w", "s", "e", "n", "n", "e", "s", "w", "w", "w"));
      assertFalse(doesItWork.routeCheck(routetesting2));
      ArrayList<String> routetesting3 = new ArrayList<>(Arrays.asList("w", "s", "e", "s", "s", "e", "s", "w", "n", "n"));
      assertFalse(doesItWork.routeCheck(routetesting3));
      ArrayList<String> routetesting4 = new ArrayList<>(Arrays.asList("w", "s"));
      assertFalse(doesItWork.routeCheck(routetesting4));
      // assertNotNull("app should have a greeting", classUnderTest.getGreeting());
  }

}

