package pojo.methodPut;

import pojo.methodPostText.Args;
import pojo.methodPostText.Form;
import pojo.methodPostText.Headers;

import java.nio.file.Files;

public class PutRoot {
    private PutArgs args;
    private String data;
    private PutFiles files;
    private PutForm form;
    private PutHeaders headers;
    private Object json;
    private String url;

    public PutRoot(PutArgs args, String data, PutFiles files, PutForm form, PutHeaders headers, Object json, String url) {
        this.args = args;
        this.data = data;
        this.files = files;
        this.form = form;
        this.headers = headers;
        this.json = json;
        this.url = url;
    }

    public PutRoot() {
    }

    public PutArgs getArgs() {
        return args;
    }

    public String getData() {
        return data;
    }

    public PutFiles getFiles() {
        return files;
    }

    public PutForm getForm() {
        return form;
    }

    public PutHeaders getHeaders() {
        return headers;
    }

    public Object getJson() {
        return json;
    }

    public String getUrl() {
        return url;
    }
}
