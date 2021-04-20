package ligaofei.service.impl;

import com.ligaofei.pojo.Video;
import ligaofei.mapper.OrderMapper;
import ligaofei.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {


    @Override
    public Video findByid(int video_id) {
        return null;
    }
}
