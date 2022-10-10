package com.ingvar.leetcode.p0.p00.p000;

public class P0013_RomanToInteger {
  int romanToInteger(String roman) {
    int result = 0;

    char [] chars = roman.toCharArray();
    for (int i = chars.length - 1; i >= 0; --i) {
      if (chars[i] == 'I') {
        result += 1;
      } else if (chars[i] == 'V') {
        if (i > 0 && chars[i-1] == 'I') {
          result += 4;
          --i;
        } else {
          result += 5;
        }
      } else if (chars[i] == 'X') {
        if (i > 0 && chars[i-1] == 'I') {
          result += 9;
          --i;
        } else {
          result += 10;
        }
      } else if (chars[i] == 'L') {
        if (i > 0 && chars[i-1] == 'X') {
          result += 40;
          --i;
        } else {
          result += 50;
        }
      } else if (chars[i] == 'C') {
        if (i > 0 && chars[i-1] == 'X') {
          result += 90;
          --i;
        } else {
          result += 100;
        }
      } else if (chars[i] == 'D') {
        if (i > 0 && chars[i-1] == 'C') {
          result += 400;
          --i;
        } else {
          result += 500;
        }
      } else if (chars[i] == 'M') {
        if (i > 0 && chars[i-1] == 'C') {
          result += 900;
          --i;
        } else {
          result += 1000;
        }
      }
    }
    return result;
  }
}
