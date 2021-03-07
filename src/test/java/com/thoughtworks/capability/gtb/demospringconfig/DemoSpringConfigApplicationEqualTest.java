package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@WebMvcTest(properties = "levelNumber = 1",value = LevelController.class)
public class DemoSpringConfigApplicationEqualTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void should_return_advanced_when_levelNumber_equals_to_1() throws Exception {
        mockMvc.perform(get("/level"))
                .andExpect(MockMvcResultMatchers.content().string("advanced"));
    }
}
