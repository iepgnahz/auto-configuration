package com.example.demo.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer {
    @Autowired
    private CD cd;

    public void playCD(){
        cd.play();
    }
}
