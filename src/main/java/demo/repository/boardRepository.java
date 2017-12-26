package demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import demo.domain.boardVO;

@Mapper
@Repository
public interface boardRepository {
    List<boardVO> getUserList();
}