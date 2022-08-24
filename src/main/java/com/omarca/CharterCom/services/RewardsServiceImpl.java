package com.omarca.CharterCom.services;

import com.omarca.CharterCom.contracts.RewardsService;
import com.omarca.CharterCom.models.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RewardsServiceImpl implements RewardsService {
    @Override
    public RewardsResponse getRewardsMonthly(ArrayList<MonthlyTransaction> monthlyTransactions) {
        ArrayList<MonthlyReward> monthlyRewards = new ArrayList<>();
        long totalRewards = 0;
        for (MonthlyTransaction monthlyTransaction:monthlyTransactions){
            long total = 0;
            for (Reward reward : getRewards(monthlyTransaction.getTransactions())) {
                total += reward.getRewardedPoints();
            }
            monthlyRewards.add(new MonthlyReward(monthlyTransaction.getMonth(), total));
            totalRewards+=total;
        }
        return new RewardsResponse(monthlyRewards,totalRewards);
    }

    private ArrayList<Reward> getRewards(ArrayList<Transaction> transactions) {
        ArrayList<Reward> rewards = new ArrayList<>();
        for (Transaction transaction:transactions) {
            Reward reward = new Reward(transaction.getTransactionId());
            long currentRewards = 0;
            if(transaction.getAmount() > 100) {
                currentRewards += 50 + Math.abs(100 - transaction.getAmount()) * 2;
            }else if(transaction.getAmount()>50){
                currentRewards+= Math.abs(50-transaction.getAmount());
            }
            reward.setRewardedPoints(currentRewards);
            rewards.add(reward);
        }
        return rewards;
    }
}
