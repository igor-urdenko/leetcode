package com.ingvar.leetcode.p0.p00.p000;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class P0009PalindromeNumberTest {
  private P0009_PalindromeNumber subject;

  @BeforeEach
  void init() {
    subject = new P0009_PalindromeNumber();
  }

  @Test
  void palindromeNumberTest() {
    assertTrue(subject.isPalindromeNumber(121));
    assertTrue(subject.isPalindromeNumber(123454321));
    assertTrue(subject.isPalindromeNumber(1001));
    assertTrue(subject.isPalindromeNumber(9898989));

    assertFalse(subject.isPalindromeNumber(100));
    assertFalse(subject.isPalindromeNumber(-1));
    assertFalse(subject.isPalindromeNumber(1234565432));
    assertFalse(subject.isPalindromeNumber(239));
  }
}
