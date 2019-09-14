package mju.hyj326.service.impl;
import mju.hyj326.dao.UserMapper;
import mju.hyj326.domain.User;
import mju.hyj326.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    //依赖注入
    @Autowired
    UserMapper userMapper;

    @Override
    public User getUser(String username) {
        return userMapper.findByUsername(username);
    }

}
