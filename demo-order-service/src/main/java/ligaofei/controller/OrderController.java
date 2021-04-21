package ligaofei.controller;

import com.ligaofei.pojo.Video;
import com.ligaofei.pojo.VideoOrder;
import ligaofei.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("order")
public class OrderController {


    @Autowired
    private VideoService videoService;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("list")
    public Object list(@RequestParam int id){

        VideoOrder videoOrder = new VideoOrder();

//        Video video = restTemplate.getForObject("http://localhost:8000/video/list?id=40", Video.class);


//        List<ServiceInstance> list = discoveryClient.getInstances("xdclass-video-service");
//        ServiceInstance serviceInstance = list.get(0);
//        Video video = restTemplate.getForObject("http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+
//                "/video/list?id="+id,Video.class);

//        Video video = restTemplate.getForObject("http://xdclass-video-service/video/list?id=" + id, Video.class);


        Video video = videoService.findByid(id);

        System.out.println(video.toString());


        videoOrder.setVideoTitle(video.getTitle());
        videoOrder.setVideoId(video.getId());
        videoOrder.setServer_id(video.getServer_ip());
        return videoOrder;
    }

    /**
     * 测试 feign 调用 使用post方式传输对象
     * @param video
     * @return
     */
    @RequestMapping("save")
    public Object save(@RequestBody Video video) {
        Integer rows = videoService.save(video);
        Map<String, Object> map = new HashMap<>();
        map.put("rows", rows);

        return map;
    }
}
