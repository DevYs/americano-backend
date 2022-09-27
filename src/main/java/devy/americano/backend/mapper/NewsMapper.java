package devy.americano.backend.mapper;

import devy.americano.backend.domain.News;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/** 뉴스기사 Mapper */
@Mapper
public interface NewsMapper {

    List<News> selectAllNews();

    List<News> selectNews(@Param("limit") int limit, @Param("offset") int offset);

    int insertNews(News news);
}
