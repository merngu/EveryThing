package com.example.leet;

import java.util.HashMap;

public class sum {

    public int[] twoSum(int[] nums,int target){
        HashMap<Integer, Integer> objectObjectHashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            objectObjectHashMap.put(nums[i],i);
            if (objectObjectHashMap.containsKey(target - nums[i])){
                return new int[]{objectObjectHashMap.get(target - nums[i]),i};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        sum sum = new sum();

        int[] nums = new int[] {2,7,11,15};

        int[] ints = sum.twoSum(nums, 9);

        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }


    }
}
