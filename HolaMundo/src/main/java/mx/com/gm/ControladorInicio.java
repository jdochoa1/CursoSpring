package mx.com.gm;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class ControladorInicio {
    
    @GetMapping("/")
    public String inicio(){
        log.info("ejecuntando el controlador rest");
        log.debug("mas detalles del controlador");
        return "Hola Mundo con Spring Boot";
    }
}
