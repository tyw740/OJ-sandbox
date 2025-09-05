package com.tyw.ojcodesandbox;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组元素，用空格分隔：");
        String input = sc.nextLine();
        String[] s = input.split(" ");

        int[] nums = new int[s.length];
        for (int i = 0; i < nums.length ; i++) {
            nums[i] = Integer.parseInt(s[i]);
        }

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if(x != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        System.out.println("移动零后的数组为：" + Arrays.toString(nums));
    }
}


