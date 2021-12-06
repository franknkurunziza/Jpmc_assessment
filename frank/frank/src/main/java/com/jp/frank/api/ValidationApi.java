package com.jp.frank.api;



import com.jp.frank.model.AccountDetails;
import com.jp.frank.model.AccountInfo;
import com.jp.frank.service.ValidateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ValidationApi {

    private Logger logger = LoggerFactory.getLogger(ValidationApi.class);

    @Autowired
    private ValidateService validateService;

    @PostMapping("/validate")
    public List<AccountDetails> getAccountValidations(@RequestBody AccountInfo accountInfo){
        try {
            this.logger.trace("checking validation [{}]",accountInfo);
            return validateService.getAccountDetails(accountInfo);
        }catch (Exception e){
            this.logger.error("Exception while validating account {}", accountInfo,e);
            throw e;
        }
    }

    @GetMapping("/test")
    public String testApi(){
        return "weclome to my test api";
    }
}
