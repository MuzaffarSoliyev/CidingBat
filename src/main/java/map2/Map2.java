package map2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Map2 {
  public Map<String, Integer> word0(String[] strings) {
    Map<String, Integer> map = new HashMap<String, Integer>();
    for (String s : strings) {
      map.put(s, map.getOrDefault(s, 0));
    }
    return map;
  }

  public Map<String, Integer> wordLen(String[] strings) {
    Map<String, Integer> map = new HashMap<>();
    for (String s : strings) {
      map.put(s, s.length());
    }
    return map;
  }

  public Map<String, String> pairs(String[] strings) {
    Map<String, String> map = new HashMap<>();
    for (String s : strings) {
      map.put(s.substring(0, 1), s.substring(s.length() - 1));
    }
    return map;
  }

  public Map<String, Integer> wordCount(String[] strings) {
    Map<String, Integer> map = new HashMap<>();
    for (String s : strings) {
      map.put(s, map.getOrDefault(s, 0) + 1);
    }
    return map;
  }

  public Map<String, String> firstChar(String[] strings) {
    Map<String, String> map = new HashMap<>();
    for (String s : strings) {
      map.put(s.substring(0, 1), map.getOrDefault(s.substring(0, 1), "") + s);
    }
    return map;
  }

  public String wordAppend(String[] strings) {
    StringBuilder result = new StringBuilder();
    Map<String, Integer> map = new HashMap<>();
    for (String s : strings) {
      map.put(s, map.getOrDefault(s, 0) + 1);
      if (map.get(s) % 2 == 0) {
        result.append(s);
      }
    }
    return result.toString();
  }

  public Map<String, Boolean> wordMultiple(String[] strings) {
    Map<String, Boolean> map = new HashMap<>();
    for (String s : strings) {
      if (map.containsKey(s)) {
        map.put(s, Boolean.TRUE);
      } else {
        map.put(s, Boolean.FALSE);
      }
    }
    return map;
  }

  public String[] allSwap(String[] strings) {
    Map<String, Integer> map = new HashMap<>();
    String tmp;
    for (int i = 0; i < strings.length; i++) {
      if (map.containsKey(strings[i].substring(0, 1))) {
        tmp = strings[i];
        strings[i] = strings[map.get(strings[i].substring(0, 1))];
        strings[map.get(strings[i].substring(0, 1))] = tmp;
        map.remove(strings[i].substring(0, 1));
      } else {
        map.put(strings[i].substring(0, 1), i);
      }
    }
    return strings;
  }

  public String[] firstSwap(String[] strings) {
    Map<String, Integer> map = new HashMap<>();
    String tmp;
    for (int i = 0; i < strings.length; i++) {
      if (map.containsKey(strings[i].substring(0, 1)) && map.get(strings[i].substring(0, 1)) >= 0) {
        tmp = strings[i];
        strings[i] = strings[map.get(strings[i].substring(0, 1))];
        strings[map.get(strings[i].substring(0, 1))] = tmp;
        map.put(strings[i].substring(0, 1), -1);
      } else if (!map.containsKey(strings[i].substring(0, 1))) {
        map.put(strings[i].substring(0, 1), i);
      }
    }
    return strings;
  }


  public static void main(String[] args) {
    Map2 map2 = new Map2();
    System.out.println(Arrays.asList(map2.firstSwap(new String[]{"ab", "ac"})));
    System.out.println(Arrays.asList(map2.firstSwap(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"})));
    System.out.println(Arrays.asList(map2.firstSwap(new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"})));

  }

}
