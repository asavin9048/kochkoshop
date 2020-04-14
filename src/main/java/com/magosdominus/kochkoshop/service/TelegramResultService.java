package com.magosdominus.kochkoshop.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.magosdominus.kochkoshop.entity.PayOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TelegramResultService implements ResultService {
    @Autowired
    RestTemplate restTemplate;
    @Override
    public void sendFoodResult(String recipient, String age) {
        String text = "a"+recipient+age;

        restTemplate.postForLocation("https://api.telegram.org/bot913555098:AAFo6u65L_IIBR0JLYhxJEQNf3k1yZvkRCA/" +
                        "sendMessage?chat_id=378303459&text="+text,"");
    }

    @Override
    public void sendTrainResult(String recipient) {

    }

    @Override
    public void saveOrder(PayOrder payOrder) {

    }
}
