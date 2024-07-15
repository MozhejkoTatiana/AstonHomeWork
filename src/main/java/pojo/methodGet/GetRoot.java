package pojo.methodGet;

public class GetRoot {
    private Args args;
    private Headers headers;
    private String url;

    public Args getArgs() {
        return args;
    }

    public GetRoot() {
    }

    public Headers getHeaders() {
        return headers;
    }

    public String getUrl() {
        return url;
    }

    public GetRoot(Args args, Headers headers, String url) {
        this.args = args;
        this.headers = headers;
        this.url = url;
    }
}
