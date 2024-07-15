package pojo.methodDelete;

public class DeleteRoot {
    private DeleteArgs args;
    private String data;
    private DeleteFiles files;
    private DeleteForm form;
    private DeleteHeaders headers;
    private Object json;
    private String url;

    public DeleteRoot(DeleteArgs args, String data, DeleteFiles files, DeleteForm form, DeleteHeaders headers, Object json, String url) {
        this.args = args;
        this.data = data;
        this.files = files;
        this.form = form;
        this.headers = headers;
        this.json = json;
        this.url = url;
    }

    public DeleteRoot() {
    }

    public DeleteArgs getArgs() {
        return args;
    }

    public String getData() {
        return data;
    }

    public DeleteFiles getFiles() {
        return files;
    }

    public DeleteForm getForm() {
        return form;
    }

    public DeleteHeaders getHeaders() {
        return headers;
    }

    public Object getJson() {
        return json;
    }

    public String getUrl() {
        return url;
    }
}
