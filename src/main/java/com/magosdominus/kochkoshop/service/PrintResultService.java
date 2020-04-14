package com.magosdominus.kochkoshop.service;

import com.magosdominus.kochkoshop.entity.PayOrder;
import com.magosdominus.kochkoshop.repositoty.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class PrintResultService  implements ResultService {
    @Autowired
    OrderRepository orderRepository;

    @Override
    public void sendFoodResult(String recipient, String age) {
        System.out.println("food rescipient "+recipient+" is age "+age);
    }
    @Override
    public void sendTrainResult(String recipient) {
        System.out.println("train rescipient "+recipient);
    }
    @Override
    public void saveOrder(PayOrder payOrder) {
        orderRepository.save(payOrder);
    }
}
