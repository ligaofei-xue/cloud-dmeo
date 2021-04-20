package ligaofei.mapper;

import com.ligaofei.pojo.Video;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

//@Repository
public interface OrderMapper {

    @Select("select * from video where id=#{video_id}")
    public Video findByid(@Param("video_id") int video_id);
}
