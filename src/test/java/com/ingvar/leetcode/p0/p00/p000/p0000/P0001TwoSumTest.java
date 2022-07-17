package com.ingvar.leetcode.p0.p00.p000.p0000;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class P0001TwoSumTest {

  private P0001_TwoSum subject;

  @BeforeEach
  void init() {
    subject = new P0001_TwoSum();
  }

  @Test
  void twoSum_Test1() {
    int [] nums = { 2, 7, 11, 15 };
    int target = 9;

    int [] testResult = subject.twoSum(nums, target);

    assertNotNull(testResult);
    assertEquals(2, testResult.length);
    assertEquals(0, testResult[0]);
    assertEquals(1, testResult[1]);
  }

  @Test
  void twoSum_Test2() {
    int [] nums = { 3, 2, 4 };
    int target = 6;

    int [] testResult = subject.twoSum(nums, target);

    assertNotNull(testResult);
    assertEquals(2, testResult.length);
    assertEquals(1, testResult[0]);
    assertEquals(2, testResult[1]);
  }

  @Test
  void twoSum_Test3() {
    int [] nums = { 3, 3 };
    int target = 6;

    int [] testResult = subject.twoSum(nums, target);

    assertNotNull(testResult);
    assertEquals(2, testResult.length);
    assertEquals(0, testResult[0]);
    assertEquals(1, testResult[1]);
  }

  @Test
  void twoSum_Test4() {
    int [] nums = { 95, 22, 17, 35, 48, 23, 51, 29, 73, 50 };
    int target = 123;

    int [] testResult = subject.twoSum(nums, target);

    assertNotNull(testResult);
    assertEquals(2, testResult.length);
    assertEquals(8, testResult[0]);
    assertEquals(9, testResult[1]);
  }
}
