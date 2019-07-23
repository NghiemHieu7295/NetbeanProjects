package com.hieu.spring;

public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune(){
        return "Hôm nay là 1 ngày may mắn.";
    }
}