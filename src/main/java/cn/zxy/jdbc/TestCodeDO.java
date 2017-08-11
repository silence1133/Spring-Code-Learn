package cn.zxy.jdbc;

/**
 * @author Silence 000996
 * @data 17/8/1
 */
public class TestCodeDO {
    private Long id;
    private String content;
    private String media;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public TestCodeDO() {
    }

    public TestCodeDO(String content, String media) {
        this.content = content;
        this.media = media;
    }

    public TestCodeDO(Long id, String content, String media) {
        this.id = id;
        this.content = content;
        this.media = media;
    }

    @Override
    public String toString() {
        return "TestCodeDO{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", media='" + media + '\'' +
                '}';
    }
}
