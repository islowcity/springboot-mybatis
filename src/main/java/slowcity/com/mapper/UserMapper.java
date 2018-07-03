package slowcity.com.mapper;
import java.util.List;

import org.springframework.stereotype.Service;

import slowcity.com.entity.UserEntity;
@Service
public interface UserMapper {

    List<UserEntity> getAll();

    UserEntity getOne(Long id);

    void insert(UserEntity user);

    void update(UserEntity user);

    void delete(Long id);
}	