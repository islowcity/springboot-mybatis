package slowcity.com.controller;
import java.util.List;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	/**
	 * 
	 * 注解风格接口测试
	 */
    @GetMapping(value = "/userOne/{id}")
    public UserEntity getOneUser(@PathVariable(value = "id") Long id) {
        return userMapper.findOne(id);
    }

    @GetMapping(value = "/users/{id}")
    public UserEntity getUser(@PathVariable(value = "id") Long id) {
        return userMapper.getOne(id);
    }

    @PostMapping("/users")
    public void save(@RequestBody UserEntity user) {
        userMapper.insert(user);
    }

    @PutMapping("/users")
    public void update(@RequestBody UserEntity user) {
        userMapper.update(user);
    }

    @DeleteMapping(value="/users/{id}")
    public void delete(@PathVariable("id") Long id) {
        userMapper.delete(id);
    }


}