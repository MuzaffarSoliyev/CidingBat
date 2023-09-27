package warmup1;

public class Warmup {
  public boolean sleepIn(boolean weekday, boolean vacation) {
    return !weekday || vacation;
  }

  public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    return aSmile == bSmile;
  }

  public int sumDouble(int a, int b) {
    return a == b ? 2 * (a + b) : a + b;
  }

  public int diff21(int n) {
    return n > 21 ? 2 * Math.abs(n - 21) : Math.abs(n - 21);
  }

  public boolean parrotTrouble(boolean talking, int hour) {
    return talking && (hour < 7 || hour > 20);
  }

  public boolean makes10(int a, int b) {
    return a == 10 || b == 10 || a + b == 10;
  }

  public boolean nearHundred(int n) {
    return (n >= 90 && n <= 110) || (n >= 190 && n <= 210);
  }

  public boolean posNeg(int a, int b, boolean negative) {
    return (!negative && a * b < 0) || (negative && a < 0 && b < 0);
  }

  public String notString(String str) {
    return str.startsWith("not") ? str : "not " + str;
  }

  public String missingChar(String str, int n) {
    return str.substring(0, n) + str.substring(n + 1);
  }

  public String frontBack(String str) {
    if (str.length() <= 1) {
      return str;
    }
    return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
  }

  public String front3(String str) {
    String result;
    if (str.length() < 3) {
      return str + str + str;
    }
    result = str.substring(0, 3);
    return result + result + result;
  }

  public String backAround(String str) {
    char lastChar = str.charAt(str.length() - 1);
    return lastChar + str + lastChar;
  }

  public boolean or35(int n) {
    return n % 3 == 0 || n % 5 == 0;
  }

  public String front22(String str) {
    if (str.length() < 2) {
      return str + str + str;
    }
    return str.substring(0, 2) + str + str.substring(0, 2);
  }

  public boolean startHi(String str) {
    return str.startsWith("hi");
  }

  public boolean icyHot(int temp1, int temp2) {
    if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
      return true;
    }
    return false;
  }

  public boolean in1020(int a, int b) {
    return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
  }

  public boolean hasTeen(int a, int b, int c) {
    return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
  }

  public boolean loneTeen(int a, int b) {
    return (a >= 13 && a <= 19) ^ (b >= 13 && b <= 19);
  }

  public String delDel(String str) {
    if (str.length() < 4) {
      return str;
    }
    return str.substring(1, 4).equals("del") ? str.substring(0, 1) + str.substring(4) : str;
  }

  public boolean mixStart(String str) {
    return str.length() >= 3 && str.substring(1, 3).equals("ix");
  }

  public String startOz(String str) {
    String result = "";
    if (str.length() > 0 && str.charAt(0) == 'o')
      result = "o";
    if (str.length() > 1 && str.charAt(1) == 'z')
      result += "z";
    return result;
  }

  public int intMax(int a, int b, int c) {
    if (a >= b && a >= c) {
      return a;
    } else if (b >= a && b >= c) {
      return b;
    } else {
      return c;
    }
  }

  public int close10(int a, int b) {
    if (Math.abs(a - 10) > Math.abs(b - 10)) {
      return b;
    } else if (Math.abs(a - 10) < Math.abs(b - 10)) {
      return a;
    } else {
      return 0;
    }
  }

  public boolean in3050(int a, int b) {
    return (a >= 30 && a <= 40 && b >= 30 && b <= 40) || (a >= 40 && a <= 50 && b >= 40 && b <= 50);
  }

  public int max1020(int a, int b) {
    int result = 0;
    if (a >= 10 && a <= 20 && b >= 10 && b <= 20) {
      result = Math.max(a, b);
    } else if (a >= 10 && a <= 20) {
      result = a;
    } else if (b >= 10 && b <= 20) {
      result = b;
    }
    return result;
  }

  public boolean stringE(String str) {
    int countOfE = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'e') {
        countOfE++;
      }
    }
    return countOfE >= 1 && countOfE <= 3;
  }

  public boolean lastDigit(int a, int b) {
    return a % 10 == b % 10;
  }

  public String endUp(String str) {
    if (str.length() < 3) {
      return str.toUpperCase();
    } else {
      return str.substring(0, str.length() - 3) + str.substring(str.length() - 3).toUpperCase();
    }
  }

  public String everyNth(String str, int n) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < str.length(); i += n) {
      result.append(str.charAt(i));
    }
    return result.toString();
  }


  public static void main(String[] args) {
    Warmup warmup = new Warmup();
    System.out.println(warmup.delDel("kitten"));
    System.out.println(warmup.delDel("kitten"));
    System.out.println(warmup.delDel("kitten"));

  }
}
