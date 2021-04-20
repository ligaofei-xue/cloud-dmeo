package ligaofei.controller;

import com.ligaofei.pojo.Video;
import ligaofei.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("order")
public class OrderController {


    @Autowired
    private OrderService orderService;

    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("list")
    public Object list(@RequestParam int id){
        Video video = restTemplate.getForObject("http://localhost:8000/video/list?id=40", Video.class);
        System.out.println(video.toString());
        return orderService.findByid(id);
    }
}
