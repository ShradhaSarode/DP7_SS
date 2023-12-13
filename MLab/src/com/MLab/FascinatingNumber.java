package com.MLab;

public class FascinatingNumber
{
    public static boolean isFascinating(int num)
    {
        String numStr = Integer.toString(num);
        String concatenated = numStr + (num * 2) + (num * 3);

        for (char digit = '1'; digit <= '9'; digit++) {
            if (concatenated.indexOf(digit) == concatenated.lastIndexOf(digit) && numStr.indexOf(digit) != -1) {
                continue;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int num = 192; // Change this to the number you want to check for fascination
        if (isFascinating(num)) {
            System.out.println(num + " is a fascinating number.");
        } else {
            System.out.println(num + " is not a fascinating number.");
        }
    }
}
