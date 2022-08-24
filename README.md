How to use:
Server will start on port 8080

Endpoint: http://localhost:8080/rewards/getRewards

Contract:
[
{
"month":"May",
"transactions":[
{
"transactionId":123455,
"amount":10
},
{
"transactionId":123456,
"amount":50
},
{
"transactionId":123457,
"amount":70
},
{
"transactionId":123458,
"amount":100
},
{
"transactionId":123459,
"amount":120
}
]
}
]

Response:
{
"totalRewardsInPeriod": 160,
"rewards": [
{
"month": "May",
"totalRewards": 160
}
]
}

Dataset used for testing:
[
{
"month":"May",
"transactions":[
{
"transactionId":123455,
"amount":10
},
{
"transactionId":123456,
"amount":50
},
{
"transactionId":123457,
"amount":70
},
{
"transactionId":123458,
"amount":100
},
{
"transactionId":123459,
"amount":120
}
]
},
{
"month":"June",
"transactions":[
{
"transactionId":123455,
"amount":10
},
{
"transactionId":123456,
"amount":50
},
{
"transactionId":123457,
"amount":70
},
{
"transactionId":123458,
"amount":100
},
{
"transactionId":123459,
"amount":120
}
]
},
{
"month":"July",
"transactions":[
{
"transactionId":123455,
"amount":10
},
{
"transactionId":123456,
"amount":50
},
{
"transactionId":123457,
"amount":70
},
{
"transactionId":123458,
"amount":100
},
{
"transactionId":123459,
"amount":120
},
{
"transactionId":123460,
"amount":1120
}
]
}
]
Results:
{
"totalRewardsInPeriod": 2570,
"rewards": [
{
"month": "May",
"totalRewards": 160
},
{
"month": "June",
"totalRewards": 160
},
{
"month": "July",
"totalRewards": 2250
}
]
}

The reason why I used this dataset is that this tests
transactions below $50,at $50 , above $50 then below $100 and above $100.