package com.airline.controller;

import com.airline.dto.FlightDTO;
import com.airline.service.FlightService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(FlightController.class)
public class FlightControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private FlightService flightService;

    @Test
    public void shouldReturnFlightList() throws Exception {
        FlightDTO flight = new FlightDTO(1L, "AI101", "DEL", "NYC",
                "2025-03-21T10:00:00", "2025-03-21T18:00:00", "ON_TIME");

        when(flightService.getAllFlights("asc")).thenReturn(List.of(flight));

        mockMvc.perform(get("/flights?sort=asc"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].flightNumber").value("AI101"));
    }
}
