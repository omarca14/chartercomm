package com.omarca.CharterCom.controllers;

import com.omarca.CharterCom.contracts.RewardsService;
import com.omarca.CharterCom.models.MonthlyTransaction;
import com.omarca.CharterCom.models.MonthlyReward;
import com.omarca.CharterCom.models.RewardsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/rewards")
public class Rewards {

    @Autowired
    RewardsService rewardsService;


    @GetMapping(value = "/getRewards",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RewardsResponse> getRewards(@RequestBody ArrayList<MonthlyTransaction> monthlyTransactions){
        return new ResponseEntity<>(rewardsService.getRewardsMonthly(monthlyTransactions), HttpStatus.OK);
    }
}
