package slowcity.com.controller;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import slowcity.com.entity.UserEntity;
import slowcity.com.mapper.UserMapper;

@RestController
public class UserController {

    @Resource
    private UserMapper userMapper;


    @GetMapping(value = "/users")
    public List<UserEntity> getUsers() {
        List<UserEntity> users=userMapper.getAll();
        return users;
    }



    @GetMapping(value = "/users/{id}")
    public UserEntity getUser(@PathVariable(value = "id") Long id) {
        UserEntity user=userMapper.getOne(id);
        return user;
    }

    @PostMapping("/users")
    public void save(UserEntity user) {
        userMapper.insert(user);
    }

    @PutMapping("/users")
    public void update(UserEntity user) {
        userMapper.update(user);
    }

    @DeleteMapping(value="/users/{id}")
    public void delete(@PathVariable("id") Long id) {
        userMapper.delete(id);
    }


}