package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@WebMvcTest(properties = "levelNumber = 0",value = LevelController.class)
class DemoSpringConfigApplicationTests {
	@Autowired
	private MockMvc mockMvc;

	@Test
	void should_return_basic_when_levelNumber_is_less_than_1() throws Exception {
		mockMvc.perform(get("/level"))
				.andExpect(MockMvcResultMatchers.content().string("basic"));
	}

}
