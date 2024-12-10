package com.rock.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * FileName: MessageController
 * Author: bai
 * Date:   20242024/5/21下午4:41
 * Description:test
 * <author> maziyu
 */

@Controller
public class MessageController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
