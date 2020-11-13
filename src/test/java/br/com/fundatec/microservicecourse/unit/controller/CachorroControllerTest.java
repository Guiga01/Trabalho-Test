package br.com.fundatec.microservicecourse.unit.controller;

import br.com.fundatec.microservicecourse.controller.CachorroController;
import br.com.fundatec.microservicecourse.domain.Cachorro;
import br.com.fundatec.microservicecourse.gateway.ClinicaGateway;
import br.com.fundatec.microservicecourse.repository.CachorroRepository;
import br.com.fundatec.microservicecourse.repository.TutorRepository;
import br.com.fundatec.microservicecourse.service.CachorroService;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
class CachorroControllerTest {

    @MockBean
    private CachorroService cachorroService;

    @MockBean
    private TutorRepository tutorRepository;

    @Autowired
    private CachorroController cachorroController;

}