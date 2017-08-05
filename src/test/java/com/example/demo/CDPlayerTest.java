package com.example.demo;

import com.example.demo.bean.CDPlayer;
import com.example.demo.bean.CompactDisc;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;

@RunWith(SpringRunner.class)
public class CDPlayerTest {
    @MockBean
    private CompactDisc cd;
    
    private CDPlayer cdPlayer; 

    @Before
    public void setUp() throws Exception {
        cdPlayer = new CDPlayer(cd);

    }

    @Test
    public void test_cdPlayer_playCD_method() throws Exception {
        doNothing().when(cd).play();
        cdPlayer.playCD();
        Mockito.verify(cd,times(1)).play();
    }

}
