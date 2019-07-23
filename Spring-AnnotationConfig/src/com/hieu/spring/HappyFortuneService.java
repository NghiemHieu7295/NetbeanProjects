package com.hieu.spring;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune(){
        return "Hôm nay là 1 ngày may mắn.";
    }
}