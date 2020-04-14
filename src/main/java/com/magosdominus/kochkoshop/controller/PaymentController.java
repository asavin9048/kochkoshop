package com.magosdominus.kochkoshop.controller;

import com.magosdominus.kochkoshop.entity.PayOrder;
import com.magosdominus.kochkoshop.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {
    @Autowired
    ResultService resultService;

    @PostMapping("/statusChangeFood")
    public void statusChangeFood(String age, String orderReference,
                                  String email, String phone, String reasonCode) {
        System.out.println(age);
        switch (reasonCode){
            case "1100":
                resultService.sendFoodResult(email,age);
                break;
        }
//        if(reasonCode.equals("1100")) {
//            resultService.sendFoodResult(email,age);
//        }else{
//
//        }
    }
    @PostMapping("/statusChangeTrain")
    public void statusChangeTrain( String email) {
        System.out.println(email);
//        if(reasonCodse == "1100") {
//            resultService.sendTrainResult(email);
//        }else{
//
//        }
    }

//    @PostMapping("/createRequest")
//    public void createRequest()
}
