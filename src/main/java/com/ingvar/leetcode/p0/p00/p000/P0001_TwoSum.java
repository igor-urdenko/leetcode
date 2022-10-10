package com.ingvar.leetcode.p0.p00.p000;

import java.util.HashMap;
import java.util.Map;

public class P0001_TwoSum {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> hash = new HashMap<>();

    for (int i = 0; i < nums.length; ++i) {
      int delta = target - nums[i];
      if (hash.containsKey(delta)) {
        return new int [] { hash.get(delta), i };
      }
      hash.put(nums[i], i);
    }
    return null;
  }
}
