package com.assignment.controlller;

import com.assignment.service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("order")
public class AssignmentController {

    @Autowired
    AssignmentService assignmentService;

    @PostMapping(value = "/purchase")
    public ResponseEntity<Double> purchaseOrders(@RequestParam Double amount){

        Double points = assignmentService.byOrder(amount);
        return new ResponseEntity<Double>(points,HttpStatus.OK);

    }

}
