package pojo.methodPostData;

public class PostDataRoot {
    private PostDataArgs args;
    private Data data;
    private PostDataFiles files;
    private PostDataForm form;
    private PostDataHeaders headers;
    private Object json;
    private String url;

    public PostDataRoot(PostDataArgs args, Data data, PostDataFiles files, PostDataForm form, PostDataHeaders headers, Object json, String url) {
        this.args = args;
        this.data = data;
        this.files = files;
        this.form = form;
        this.headers = headers;
        this.json = json;
        this.url = url;
    }

    public PostDataRoot() {
    }

    public PostDataArgs getArgs() {
        return args;
    }

    public Data getData() {
        return data;
    }

    public PostDataFiles getFiles() {
        return files;
    }

    public PostDataForm getForm() {
        return form;
    }

    public PostDataHeaders getHeaders() {
        return headers;
    }

    public Object getJson() {
        return json;
    }

    public String getUrl() {
        return url;
    }
}
