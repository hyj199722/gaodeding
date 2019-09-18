package mju.hyj326.controller;
import mju.hyj326.domain.User;
import mju.hyj326.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller	//声明这是Controller层
public class UserController {
    //依赖注入
    @Autowired
    UserService userService;
    @RequestMapping(value="/login",method = RequestMethod.POST)
    public String login(User user) {

        User u = userService.getUser(user.getUsername());

        if (u.getPassword().equals(user.getPassword())){
            return "success";
        }
        return "failed";
    }

        }
