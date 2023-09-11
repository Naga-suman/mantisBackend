package com.mantis.template.scheme;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/scheme")
public class SchemeController {

    @Autowired
    private  SchemeService schemeService;

    @PostMapping
    public ResponseEntity<SchemeEntity> createScheme(@RequestBody SchemeEntity scheme){
        SchemeEntity response = schemeService.createScheme(scheme);
        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/{financerId}")
    public ResponseEntity<List<SchemeEntity>> getfinancerSchemes(@PathVariable Integer financerId){
        List<SchemeEntity> response = schemeService.financerScheme(financerId);
        return ResponseEntity.ok().body(response);
    }
}
