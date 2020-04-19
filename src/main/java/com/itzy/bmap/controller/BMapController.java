package com.itzy.bmap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BMapController {

    @GetMapping("index")
    public String BMap(){
        return "index";
    }

//    @GetMapping("map")
//    public String Map(){
//        return "map";
//    }
}
