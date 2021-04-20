package com.ligaofei.service.impl;

import com.ligaofei.mapper.VideoMapper;
import com.ligaofei.pojo.Video;
import com.ligaofei.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoMapper videoMapper;
    @Override
    public Video findByid(int video_id) {
        return videoMapper.findByid(video_id);
    }
}
