package warmup2;

import java.sql.PreparedStatement;

public class Warmup {
  public String stringTimes(String str, int n) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < n; i++) {
      result.append(str);
    }
    return result.toString();
  }

  public String frontTimes(String str, int n) {
    StringBuilder result = new StringBuilder();
    String sub;
    if (str.length() > 3) {
      sub = str.substring(0, 3);
    } else {
      sub = str;
    }
    for (int i = 0; i < n; i++) {
      result.append(sub);
    }
    return result.toString();
  }

  int countXX(String str) {
    int count = 0;
    for (int i = 0; i < str.length() - 1; i++) {
      if (str.substring(i, i + 2).equals("xx")) {
        count++;
      }
    }
    return count;
  }

  boolean doubleX(String str) {
    int idx = str.indexOf('x');
    return idx > 0 && idx < str.length() - 1 && str.charAt(idx + 1) == 'x';
  }

  public String stringBits(String str) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < str.length(); i += 2) {
      result.append(str.charAt(i));
    }
    return result.toString();
  }

  public String stringSplosion(String str) {
    StringBuilder result = new StringBuilder();
    for (int i = 1; i <= str.length(); i++) {
      result.append(str.substring(0, i));
    }
    return result.toString();
  }

  public int last2(String str) {
    int count = 0, i = 0;
    if (str.length() < 2) {
      return 0;
    }
    String substring = str.substring(str.length() - 2);
    while (i < str.length() - 2) {
      if (str.substring(i, i + 2).equals(substring)) {
        count++;
      }
      i++;
    }
    return count;
  }

  public int arrayCount9(int[] nums) {
    int countOfNines = 0;
    for (int num : nums) {
      if (num == 9) {
        countOfNines++;
      }
    }
    return countOfNines;
  }

  public boolean arrayFront9(int[] nums) {
    int i = 0;
    for (int num : nums) {
      if (i == 4) {
        break;
      }
      if (num == 9) {
        return true;
      }
      i++;
    }
    return false;
  }

  public boolean array123(int[] nums) {
    for (int i = 0; i < nums.length - 2; i++) {
      if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
        return true;
      }
    }
    return false;
  }

  public int stringMatch(String a, String b) {
    int countOfSameSubstrings = 0, n = Math.min(a.length(), b.length());
    for (int i = 0; i < n - 1; i++) {
      if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
        countOfSameSubstrings++;
      }

    }
    return countOfSameSubstrings;
  }

  public String stringX(String str) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      if ((i == 0 || i == str.length() - 1) && str.charAt(i) == 'x') {
        stringBuilder.append(str.charAt(i));
      } else if (str.charAt(i) != 'x') {
        stringBuilder.append(str.charAt(i));
      }

    }
    return stringBuilder.toString();
  }

  public String altPairs(String str) {
    int n = str.length();
    StringBuilder result = new StringBuilder("");
    for (int i = 0; i < n; i += 4) {
      result.append(str.charAt(i));
      if (i + 1 < n) {
        result.append(str.charAt(i + 1));
      }
    }

    return result.toString();
  }

  public String stringYak(String str) {
    int idx;
    while (str.contains("yak")) {
      idx = str.indexOf("yak");
      str = str.substring(0, idx) + str.substring(idx + 3);
    }
    return str;
  }

  public int array667(int[] nums) {
    int count = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
        count++;
      }
    }
    return count;
  }

  public boolean noTriples(int[] nums) {
    for (int i = 0; i < nums.length - 2; i++) {
      if (nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2]) {
        return false;
      }
    }
    return true;
  }

  public boolean has271(int[] nums) {
    for (int i = 0; i < nums.length - 2; i++) {
      if (nums[i + 1] == nums[i] + 5 && Math.abs(nums[i + 2] - nums[i] + 1) <= 2 ){
        return true;
      }
    }
    return false;
  }


  public static void main(String[] args) {
    Warmup warmup = new Warmup();
  }

}
