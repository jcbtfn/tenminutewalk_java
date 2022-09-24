package tenminutewalk_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class RouteChecker {

  public Integer routelength = 10;
  public static HashMap <String, Integer> orientationCounter = new HashMap<String, Integer>();

  public RouteChecker(){
    orientationCounter.put("n", 0);
    orientationCounter.put("s", 0);
    orientationCounter.put("e", 0);
    orientationCounter.put("w", 0);
  }

  public Boolean routeCheck(ArrayList<String> suggestedRoute){
    if (suggestedRoute.size() != routelength){
      return false;
    }
    for (String index : suggestedRoute) {
      orientationCounter.put(index, (orientationCounter.get(index)+1));
    }
    if (orientationCounter.get("n") != orientationCounter.get("s")){
      return false;
    }
    if (orientationCounter.get("e") != orientationCounter.get("w")){
      return false;
    }
    return true;
  }

  public static void main(String[] args) {
    // System.out.println(orientationCounter);
    // ArrayList<String> routetesting = new ArrayList<>(Arrays.asList("w", "s", "e", "e", "n", "n", "e", "s", "w", "w"));
    // RouteChecker routeCheck = new RouteChecker();
    // routeCheck.routeCheck(routetesting);
    // System.out.println(orientationCounter);
  }
  
}
