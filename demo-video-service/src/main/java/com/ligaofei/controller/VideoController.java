package com.ligaofei.controller;

import com.ligaofei.pojo.Video;
import com.ligaofei.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("video")
public class VideoController {


    @Autowired
    private VideoService videoService;
    @GetMapping("list")
    public Object list(@RequestParam int id, HttpServletRequest request){
        Video video = videoService.findByid(id);
        //方便发现请求是哪台机器
        video.setServer_ip(request.getServerName()+":"+request.getServerPort());
        return video;
    }

    @PostMapping("save")
    public int save(@RequestBody Video video){
        System.out.println(video.toString());
        return 1;
    }
}
