package com.assignment.serviceimpl;

import com.assignment.service.AssignmentService;
import org.springframework.stereotype.Service;

@Service
public class AssignmentServiceImpl implements AssignmentService {
    private static Double REWARD_POINTS= 2.0;
    private static Double CUT_OFF_AMOUNT= 100.0;

    @Override
    public Double byOrder(Double amount) {
        Double rewardPoints=0.0;
        if(amount>CUT_OFF_AMOUNT){
            Double eligiblePoints = amount-CUT_OFF_AMOUNT;

            rewardPoints=eligiblePoints * REWARD_POINTS;

        }
        return rewardPoints;

    }
}
