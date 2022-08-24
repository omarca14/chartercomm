package com.omarca.CharterCom.models;

public class Reward {
    int transactionId;
    long rewardedPoints;

    public Reward(int dayOfMonth) {
        this.transactionId = dayOfMonth;
    }

    public Reward(int dayOfMonth, int rewardedAmount) {
        this.transactionId = dayOfMonth;
        this.rewardedPoints = rewardedAmount;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public long getRewardedPoints() {
        return rewardedPoints;
    }

    public void setRewardedPoints(long rewardedPoints) {
        this.rewardedPoints = rewardedPoints;
    }
}
