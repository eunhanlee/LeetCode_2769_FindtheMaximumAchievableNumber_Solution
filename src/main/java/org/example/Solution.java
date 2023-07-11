package org.example;

public class Solution {

    /**
     * Calculates the maximum achievable value of 'x' by adding 'num' to the double of 't'.
     *
     * @param num the initial value of 'x'
     * @param t the value used to calculate the maximum achievable value
     * @return the maximum achievable value of 'x'
     */
    public int theMaximumAchievableX(int num, int t) {
        return num + t * 2;
    }
}
