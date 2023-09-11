package com.mantis.template.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/services/login")
public class LoginController {

//    @Autowired
//    private LoginService loginService;
//    @PostMapping()
//    public ResponseEntity<LoginResp> login(@RequestBody LoginReq req){
//        LoginResp response= loginService.loginVeriy(req);
//
//        return ResponseEntity.ok().body(response);
//    }
    @Autowired
    private LoginService loginService;
    @PostMapping()
    public ResponseEntity<LoginResp> login(@RequestBody LoginReq req){
        LoginResp response= new LoginResp("success",102l,"Naga Suman");

        return ResponseEntity.ok().body(response);
    }


}
