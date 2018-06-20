package slowcity.com.entity;
import java.util.List;

public class AreaTreeEntity {

    private String id;

    private  String name;

    private String pid;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    private List<AreaTreeEntity> children;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AreaTreeEntity> getChildren() {
        return children;
    }

    public void setChildren(List<AreaTreeEntity> children) {
        this.children = children;
    }
}