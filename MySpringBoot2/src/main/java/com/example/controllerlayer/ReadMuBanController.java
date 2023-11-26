package com.example.controllerlayer;

import com.example.service.STGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
public class ReadMuBanController {

    @Autowired
    private STGeneratorService stGeneratorService;


    @ResponseBody
    @RequestMapping("/create")
    public void create() throws IOException {
        stGeneratorService.generateConf("test");
    }
}



