package slowcity.com.mapper;
import java.util.List;

import org.springframework.stereotype.Service;

import slowcity.com.entity.AreaTreeEntity;
@Service
public interface AreaTreeMapper {

    List<AreaTreeEntity> getAreaTree();

}