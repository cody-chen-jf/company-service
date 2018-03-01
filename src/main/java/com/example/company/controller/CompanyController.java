package com.example.company.controller;

import com.example.company.common.RestResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
    @RequestMapping("/getCompanyName")
    public RestResponse<String> getCompanyName(){
        return RestResponse.success("test-company");
    }
}
