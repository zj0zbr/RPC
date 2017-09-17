package com.framework;

public class EateggService implements EatService{
    @Override
    public String eat(String some) {
        return "欢迎光临，吃个"+some;
    }
}
