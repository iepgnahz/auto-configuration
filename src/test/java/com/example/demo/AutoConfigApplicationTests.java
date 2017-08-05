package com.example.demo;

import com.example.demo.bean.CDPlayer;
import com.example.demo.bean.CDPlayerConfig;
import com.example.demo.bean.CompactDisc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
//@SpringBootTest  //你会发现使用这个注解不需要上面那个注解也可以成功运行，我认为是这个注解自动去扫描了@Component类并且为你创建了Bean
public class AutoConfigApplicationTests {
	@Autowired
	private CompactDisc cd;

	@Autowired
    private CDPlayer cdPlayer;

	@Test
	public void play_should_print_CD_info() throws Exception {
		assertThat(cd).isNotNull();
	}   //这测试仅仅是用来确定cd 可以自动扫描并创建bean（仅仅使用两个注解）

    @Test
    public void test_auto_DI() throws Exception {
	    assertThat(cdPlayer).isNotNull();
    }

}
