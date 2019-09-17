package life.hzy.community.mapper;

import life.hzy.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface QuestionMapper {

    @Insert("inser into question(title,description,tag,gmt_create,gmt_modified) values(#{title},#{description}," +
            "#{tag},#{gmtCreate},#{gmtModified})")
    void publishQuestion(Question question);


}
