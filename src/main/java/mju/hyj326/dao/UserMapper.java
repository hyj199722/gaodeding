package mju.hyj326.dao;
import mju.hyj326.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper	//声明是一个Mapper,与springbootApplication中的@MapperScan二选一写上即可
@Repository
public interface UserMapper {
    User findByUsername(String username);
}
