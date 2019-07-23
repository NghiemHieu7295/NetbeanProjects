package com.hieu.spring;

public class SadFortuneService implements FortuneService{
    @Override
    public String getFortune(){
        return "Hôm nay là 1 ngày tồi tệ.";
    }
}