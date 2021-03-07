package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource(properties = "levelNumber = 10")
public class DemoSpringConfigApplicationGreaterTest {
    @Autowired
    MockMvc mockMvc;

    @Autowired
    LevelController levelController;

    @Test
    void should_return_advanced_when_levelNumber_is_greater_than_1() throws Exception {
        mockMvc.perform(get("/level"))
                .andExpect(MockMvcResultMatchers.content().string("advanced"));
    }
}
