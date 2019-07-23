package com.hieu.spring;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService{
    @Override
    public String getFortune(){
        return "Hôm nay là 1 ngày tồi tệ.";
    }
}