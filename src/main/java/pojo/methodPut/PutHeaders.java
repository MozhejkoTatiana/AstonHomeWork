package pojo.methodPut;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PutHeaders {
    @JsonProperty("host")
    private String host;
    @JsonProperty("x-request-start")
    private String xRequestStart;
    @JsonProperty("content-length")
    private String contentLength;
    @JsonProperty("x-forwarded-proto")
    private String xForwardedProto;
    @JsonProperty("x-forwarded-port")
    private String xForwardedPort;
    @JsonProperty("x-amzn-trace-id")
    private String xAmznTraceId;
    @JsonProperty("content-type")
    private String contentType;
    @JsonProperty("user-agent")
    private String userAgent;
    @JsonProperty("accept")
    private String accept;
    @JsonProperty("cache-control")
    private String cacheControl;
    @JsonProperty("postman-token")
    private String postmanToken;
    @JsonProperty("accept-encoding")
    private String acceptEncoding;
    @JsonProperty("cookie")
    private String cookie;

    public PutHeaders(String host, String xRequestStart, String contentLength, String xForwardedProto, String xForwardedPort, String xAmznTraceId, String contentType, String userAgent, String accept, String cacheControl, String postmanToken, String acceptEncoding, String cookie) {
        this.host = host;
        this.xRequestStart = xRequestStart;
        this.contentLength = contentLength;
        this.xForwardedProto = xForwardedProto;
        this.xForwardedPort = xForwardedPort;
        this.xAmznTraceId = xAmznTraceId;
        this.contentType = contentType;
        this.userAgent = userAgent;
        this.accept = accept;
        this.cacheControl = cacheControl;
        this.postmanToken = postmanToken;
        this.acceptEncoding = acceptEncoding;
        this.cookie = cookie;
    }

    public PutHeaders() {
    }

    public String getHost() {
        return host;
    }

    public String getxRequestStart() {
        return xRequestStart;
    }

    public String getContentLength() {
        return contentLength;
    }

    public String getxForwardedProto() {
        return xForwardedProto;
    }

    public String getxForwardedPort() {
        return xForwardedPort;
    }

    public String getxAmznTraceId() {
        return xAmznTraceId;
    }

    public String getContentType() {
        return contentType;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public String getAccept() {
        return accept;
    }

    public String getCacheControl() {
        return cacheControl;
    }

    public String getPostmanToken() {
        return postmanToken;
    }

    public String getAcceptEncoding() {
        return acceptEncoding;
    }

    public String getCookie() {
        return cookie;
    }
}

