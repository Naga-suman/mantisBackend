package com.mantis.template.scheme;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class SchemeService {

    @Autowired
    private SchemeRepository schemeRepository;

    public SchemeEntity createScheme(SchemeEntity scheme){
        SchemeEntity response =  null;
        try{
            response = schemeRepository.save(scheme);
        }catch (Exception ex){
            log.error(ex.getLocalizedMessage());
        }
        return response;
    }

    public List<SchemeEntity> financerScheme(Integer financerId){

        List<SchemeEntity> response =  null;
        try{
            response = schemeRepository.findAllSchemeByFinancer(financerId);
        }catch (Exception ex){
            log.error(ex.getLocalizedMessage());
        }
        return response;
    }

}
