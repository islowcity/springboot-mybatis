package slowcity.com.mapper;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import slowcity.com.entity.AreaTreeEntity;
@Service
@Transactional
public interface AreaTreeMapper {

    List<AreaTreeEntity> getAreaTree();

}