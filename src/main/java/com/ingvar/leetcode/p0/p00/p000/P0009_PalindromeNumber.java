package com.ingvar.leetcode.p0.p00.p000;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class P0009_PalindromeNumber {
  public boolean isPalindromeNumber(int number) {
    if (number < 0 || (number % 10 == 0 && number != 0)) {
      return false;
    }

    int revertedNumber = 0;

    while (number > revertedNumber) {
      log.info("number: {} | reverted: {}", number, revertedNumber);
      revertedNumber = revertedNumber * 10 + number % 10;
      number /= 10;
    }
    return number == revertedNumber || number == revertedNumber / 10;
  }
}
