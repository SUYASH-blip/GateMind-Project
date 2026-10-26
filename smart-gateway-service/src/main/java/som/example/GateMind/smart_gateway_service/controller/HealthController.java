package som.example.GateMind.smart_gateway_service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {


    public HealthController(@Value("${info.app.name}")String name,
                            @Value("${info.app.description}")String description){


    }
}
