package com.omarca.CharterCom.contracts;

import com.omarca.CharterCom.models.MonthlyTransaction;
import com.omarca.CharterCom.models.MonthlyReward;
import com.omarca.CharterCom.models.RewardsResponse;

import java.util.ArrayList;

public interface RewardsService {
    public RewardsResponse getRewardsMonthly(ArrayList<MonthlyTransaction> monthlyTransactions);
}
