package com.company;

public class Four_pack_problem {

    public static void main(String[] args) {
        canPack(1, 0, 4);
    }

    public static final int BIG = 5;
    public static final int SMALL = 1;

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int sum = 0;
        if (bigCount < 0 || smallCount < 0) {
            System.out.println("i am here at 14");
            return false;
        }

        while (bigCount > 0) {

            if (sum + BIG > goal) {
                break;
            }
            sum += BIG;
            bigCount--;
            if (sum == goal) {
                return (true);
            }
        }

        while (smallCount > 0) {

            if (sum + SMALL > goal) {
                break;
            }
            sum += SMALL;
            smallCount--;
            if (sum == goal) {
                return (true);
            }
        }
        return (false);
    }
}