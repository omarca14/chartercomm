package com.omarca.CharterCom.models;

import java.util.ArrayList;

public class RewardsResponse {
    long totalRewardsInPeriod;
    ArrayList<MonthlyReward> rewards;

    public RewardsResponse(ArrayList<MonthlyReward> rewards, long totalRewards) {
        this.rewards = rewards;
        this.totalRewardsInPeriod = totalRewards;
    }

    public ArrayList<MonthlyReward> getRewards() {
        return rewards;
    }

    public void setRewards(ArrayList<MonthlyReward> rewards) {
        this.rewards = rewards;
    }

    public long getTotalRewardsInPeriod() {
        return totalRewardsInPeriod;
    }

    public void setTotalRewardsInPeriod(long totalRewardsInPeriod) {
        this.totalRewardsInPeriod = totalRewardsInPeriod;
    }
}
