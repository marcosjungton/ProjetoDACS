package br.univille.ProjDACS2018;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.univille.ProjDACS2018.ProjDACS2018.controller.HomeController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjDacs2018ApplicationTests {

	@Autowired
	private HomeController controller;
	
	@Test
	public void contextLoads() { 
	assertThat(controller).isNotNull();
	

	}
}
