package com.example.demo.bean;

import org.springframework.stereotype.Component;

@Component
public class CompactDisc implements CD{
    private String name = "zhangpei";
    public void play(){
        System.out.println(String.format("CD %s can be play now",name));
    }
}

