package com.example.project_login.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.project_login.response.ApiResponse;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class HolaController {
    
    @GetMapping("/hola")
    public ApiResponse hola() {
        return new ApiResponse("Hola Mundo");
    }
    
    @GetMapping("/segundohola")
    public ApiResponse segundoHola() {
        return new ApiResponse("Segundo Hola Mundo");
    }
    
    @GetMapping("/funcionando")
    public ApiResponse funcionando() {
        return new ApiResponse("api funcionando");
    }
    
    @GetMapping("/endpoints-otras-ramas")
    public Map<String, Object> endpointsOtrasRamas() {
        Map<String, Object> response = new HashMap<>();
        
        Map<String, List<String>> endpointsPorRama = new HashMap<>();
        
        // Endpoints de la rama master/main
        endpointsPorRama.put("master", Arrays.asList(
            "GET /api/hola",
            "GET /api/segundohola"
        ));
        
        // Endpoints de la rama develop (si existe)
        endpointsPorRama.put("develop", Arrays.asList(
            "GET /api/hola",
            "GET /api/segundohola"
        ));
        
        response.put("ramas", endpointsPorRama);
        response.put("rama_actual", "feature/api-test");
        response.put("endpoints_rama_actual", Arrays.asList(
            "GET /api/hola",
            "GET /api/segundohola",
            "GET /api/funcionando",
            "GET /api/endpoints-otras-ramas"
        ));
        
        return response;
    }
}
