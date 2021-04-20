package com.ligaofei.controller;

import com.ligaofei.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("video")
public class VideoController {


    @Autowired
    private VideoService videoService;
    @GetMapping("list")
    public Object list(@RequestParam int id){
        return videoService.findByid(id);
    }
}
