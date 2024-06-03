package com.casestudy.busmetadataservice.controller;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
class MetadataControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void test_should_return_metadata_list_when_get_all() throws Exception {
        mockMvc.perform(get(String.format("/metadata")))
                .andExpect(status().isOk())
                .andExpect(content()
                        .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$[0].licensePlate", is("BUS1")))
                .andExpect(jsonPath("$[1].licensePlate", is("BUS2")))
                .andExpect(jsonPath("$[2].licensePlate", is("BUS3")))
                .andExpect(jsonPath("$[3].licensePlate", is("BUS4")))
                .andExpect(jsonPath("$[4].licensePlate", is("BUS5")))
                .andExpect(jsonPath("$[5].licensePlate", is("BUS6")))
                .andExpect(jsonPath("$[6].licensePlate", is("BUS7")))
                .andExpect(jsonPath("$[7].licensePlate", is("BUS8")))
                .andExpect(jsonPath("$[8].licensePlate", is("BUS9")));


    }

}
