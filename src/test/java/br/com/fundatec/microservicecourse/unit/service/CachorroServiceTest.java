package br.com.fundatec.microservicecourse.unit.service;

import br.com.fundatec.microservicecourse.domain.Cachorro;
import br.com.fundatec.microservicecourse.gateway.ClinicaGateway;
import br.com.fundatec.microservicecourse.gateway.resources.Consulta;
import br.com.fundatec.microservicecourse.gateway.resources.ConsultaRequest;
import br.com.fundatec.microservicecourse.repository.CachorroRepository;
import br.com.fundatec.microservicecourse.repository.TutorRepository;
import br.com.fundatec.microservicecourse.service.CachorroService;
import java.time.LocalDate;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@AutoConfigureMockMvc
class CachorroServiceTest {



}