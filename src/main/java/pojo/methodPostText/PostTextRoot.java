package pojo.methodPostText;

public class PostTextRoot {
    private Args args;
    private String data;
    private Files files;
    private Form form;
    private Headers headers;
    private Object json;
    private String url;

    public PostTextRoot(Args args, String data, Files files, Form form, Headers headers, Object json, String url) {
        this.args = args;
        this.data = data;
        this.files = files;
        this.form = form;
        this.headers = headers;
        this.json = json;
        this.url = url;
    }
    public PostTextRoot() {
    }
    public Args getArgs() {
        return args;
    }

    public String getData() {
        return data;
    }

    public Files getFiles() {
        return files;
    }

    public Form getForm() {
        return form;
    }

    public Headers getHeaders() {
        return headers;
    }

    public Object getJson() {
        return json;
    }

    public String getUrl() {
        return url;
    }
}
