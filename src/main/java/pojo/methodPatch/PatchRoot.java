package pojo.methodPatch;

import pojo.methodPostText.Args;
import pojo.methodPostText.Files;
import pojo.methodPostText.Form;
import pojo.methodPostText.Headers;

public class PatchRoot {
    private PatchArgs args;
    private String data;
    private PatchFiles files;
    private PatchForm form;
    private PatchHeaders headers;
    private Object json;
    private String url;

    public PatchRoot(PatchArgs args, String data, PatchFiles files, PatchForm form, PatchHeaders headers, Object json, String url) {
        this.args = args;
        this.data = data;
        this.files = files;
        this.form = form;
        this.headers = headers;
        this.json = json;
        this.url = url;
    }

    public PatchRoot() {
    }

    public PatchArgs getArgs() {
        return args;
    }

    public String getData() {
        return data;
    }

    public PatchFiles getFiles() {
        return files;
    }

    public PatchForm getForm() {
        return form;
    }

    public PatchHeaders getHeaders() {
        return headers;
    }

    public Object getJson() {
        return json;
    }

    public String getUrl() {
        return url;
    }
}
