package com.mantis.template.login;


import com.mantis.template.user.UserDirectory;
import com.mantis.template.user.UserDirectoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {

    @Autowired
    private UserDirectoryRepo userRepo;

    public LoginResp loginVeriy(LoginReq creds){
        Optional<UserDirectory> user= null;
        try{
            user= userRepo.findByEmailIdAndPassword(creds.getUserId(),creds.getPassword());
            if(user.isPresent() && user.get().getEmailId().equals(creds.getUserId())){
                return LoginResp.builder().status("success").userId(user.get().getUserId()).build();
            }else{
                return LoginResp.builder().status("failed").userId(null).build();
            }
        }catch (Exception ex){
            throw ex;
        }
    }
}
