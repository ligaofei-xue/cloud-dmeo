package ligaofei.service;

import com.ligaofei.pojo.Video;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="xdclass-video-service")
public interface VideoService {

    @GetMapping("/video/list")
    Video findByid(@RequestParam("id") int video_id);

    @PostMapping("/video/save")
    Integer save(@RequestBody Video video);
}
