package com.omarca.CharterCom.models;

import java.util.ArrayList;

public class MonthlyTransaction {
    String month;
    ArrayList<Transaction> transactions;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setRewards(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }
}
