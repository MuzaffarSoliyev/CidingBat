package string1;

public class String1 {
  public String helloName(String name) {
    return "Hello " + name + "!";
  }

  public String makeAbba(String a, String b) {
    return a + b + b + a;
  }

  public String makeTags(String tag, String word) {
    return String.format("<%s>%s</%s>", tag, word, tag);
  }

  public String makeOutWord(String out, String word) {
    return String.format("%s%s%s", out.substring(0, out.length() / 2), word, out.substring(out.length() / 2));
  }

  public String extraEnd(String str) {
    String sub = str.substring(str.length() - 2);
    return sub + sub + sub;
  }

  public String firstTwo(String str) {
    if (str.length() < 2) {
      return str;
    }
    return str.substring(0, 2);
  }

  public String firstHalf(String str) {
    return str.substring(0, str.length() / 2);
  }

  public String withoutEnd(String str) {
    return str.substring(1, str.length() - 1);
  }

  public String comboString(String a, String b) {
    if (a.length() < b.length()) {
      return a + b + a;
    } else {
      return b + a + b;
    }
  }

  public String nonStart(String a, String b) {
    return a.substring(1) + b.substring(1);
  }

  public String left2(String str) {
    return str.substring(2) + str.substring(0, 2);
  }

  public String right2(String str) {
    return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
  }

  public String theEnd(String str, boolean front) {
    return front ? str.substring(0, 1) : str.substring(str.length() - 1);
  }

  public String withouEnd2(String str) {
    if (str.length() < 3) {
      return "";
    }
    return str.substring(1, str.length() - 1);
  }

  public String middleTwo(String str) {
    return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
  }

  public boolean endsLy(String str) {
    return str.endsWith("ly");
  }

  public String nTwice(String str, int n) {
    return str.substring(0, n) + str.substring(str.length() - n);
  }

  public String twoChar(String str, int index) {
    if (index > 0 && index < str.length() - 1) {
      return str.substring(index, index + 2);
    }
    return str.substring(0, 2);
  }


}
