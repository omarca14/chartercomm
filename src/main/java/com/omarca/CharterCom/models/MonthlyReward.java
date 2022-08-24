package com.omarca.CharterCom.models;

public class MonthlyReward {
    String month;
    long totalRewards;

    public MonthlyReward(String month, long totalRewards) {
        this.month = month;
        this.totalRewards = totalRewards;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public long getTotalRewards() {
        return totalRewards;
    }

    public void setTotalRewards(long totalRewards) {
        this.totalRewards = totalRewards;
    }
}
