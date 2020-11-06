package br.com.fundatec.microservicecourse.unit.service;

import br.com.fundatec.microservicecourse.domain.Tutor;
import br.com.fundatec.microservicecourse.exception.NotFoundException;
import br.com.fundatec.microservicecourse.repository.TutorRepository;
import br.com.fundatec.microservicecourse.service.TutorService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
@AutoConfigureMockMvc
class TutorServiceTest {

    @Autowired
    private TutorService tutorService;

    @MockBean
    private TutorRepository tutorRepository;



}