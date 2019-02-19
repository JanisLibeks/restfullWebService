package hello;

public class Greeting {
    private String content;
    private Long id;

    Greeting(Long id, String content) {
        this.content = content;
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public Long getId() {
        return id;
    }
}
