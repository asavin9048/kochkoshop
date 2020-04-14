package com.magosdominus.kochkoshop.service;

import com.magosdominus.kochkoshop.entity.PayOrder;

public interface ResultService {
    void sendFoodResult(String recipient,String age);
    void sendTrainResult(String recipient);
    void saveOrder(PayOrder payOrder);
}
