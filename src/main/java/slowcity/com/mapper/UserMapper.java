package slowcity.com.mapper;
import java.util.List;

import slowcity.com.entity.UserEntity;

public interface UserMapper {

    List<UserEntity> getAll();

    UserEntity getOne(Long id);

    void insert(UserEntity user);

    void update(UserEntity user);

    void delete(Long id);
}	