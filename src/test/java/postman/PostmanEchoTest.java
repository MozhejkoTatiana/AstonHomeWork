package postman;

import org.junit.jupiter.api.Test;
import pojo.methodDelete.DeleteRoot;
import pojo.methodGet.GetRoot;
import pojo.methodPatch.PatchRoot;
import pojo.methodPostData.PostDataRoot;
import pojo.methodPostText.PostTextRoot;
import pojo.methodPut.PutRoot;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.*;

public class PostmanEchoTest {
    private final static String URL = "https://postman-echo.com/";

    @Test
    public void methodGetTest() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpec(200));
        String expectedFoo1 = "bar1";
        String expectedFoo2 = "bar2";
        String expectedHost = "postman-echo.com";
        String expectedCookie = "sails.sid=s%3A02z-GFLwraCXxTMxYAZRmq2890hs7iT2.Ws3Yi%2FCTTqkNb0X28vNIYsn%2BTVmMEer0OA99Kbs8P94";
        String expectedXForwardedProto = "https";
        String expectedXForwardedPort = "443";
        String expectedUserAgent = "Apache-HttpClient/4.5.13 (Java/11.0.14)";
        String expectedAccept = "*/*";
        String expectedAcceptEncoding = "gzip,deflate";
        String expectedUrl = "https://postman-echo.com/get?foo1=bar1&foo2=bar2";

        GetRoot result = given()
                .when()
                .header("Cookie", expectedCookie)
                .get("get?foo1=bar1&foo2=bar2")
                .then().log().all()
                .extract().as(GetRoot.class);
        assertEquals(expectedFoo1, result.getArgs().getFoo1(), "Значение foo1 не соответствует ожидаемому результату");
        assertEquals(expectedFoo2, result.getArgs().getFoo2(), "Значение foo2 не соответствует ожидаемому результату");
        assertEquals(expectedHost, result.getHeaders().getHost(), "Значение host не соответствует ожидаемому результату");
        assertNotNull(result.getHeaders().getxRequestStart(), "Значение поля не должно быть пустым");
        assertEquals(expectedXForwardedProto, result.getHeaders().getxForwardedProto(), "Значение xForwardedProto не соответствует ожидаемому результату");
        assertEquals(expectedXForwardedPort, result.getHeaders().getxForwardedPort(), "Значение xForwardedPort не соответствует ожидаемому результату");
        assertNotNull(result.getHeaders().getxAmznTraceId(), "Значение поля не должно быть пустым");
        assertEquals(expectedUserAgent, result.getHeaders().getUserAgent(), "Значение userAgent не соответствует ожидаемому результату");
        assertEquals(expectedAccept, result.getHeaders().getAccept(), "Значение accept не соответствует ожидаемому результату");
        assertNull(result.getHeaders().getCacheControl(), "Значение поля должно быть пустым");
        assertNull(result.getHeaders().getPostmanToken(), "Значение поля должно быть пустым");
        assertEquals(expectedAcceptEncoding, result.getHeaders().getAcceptEncoding(), "Значение acceptEncoding не соответствует ожидаемому результату");
        assertEquals(expectedCookie, result.getHeaders().getCookie(), "Значение Cookie не соответствует ожидаемому результату");
        assertEquals(expectedUrl, result.getUrl(), "Значение url не соответствует ожидаемому результату");
    }

    @Test
    public void methodPostTextTest() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpec(200));
        String expectedData = "This is expected to be sent back as part of response body.";
        String expectedHost = "postman-echo.com";
        String expectedContentLength = "58";
        String expectedXForwardedProto = "https";
        String expectedXForwardedPort = "443";
        String expectedContentType = "application/json";
        String expectedUserAgent = "Apache-HttpClient/4.5.13 (Java/11.0.14)";
        String expectedAccept = "*/*";
        String expectedAcceptEncoding = "gzip,deflate";
        String expectedCookie = "sails.sid=s%3AoNzcj42tNPWIpCyKtMWai0kGfYRLzba9.tIGNUoZ0bhjST1GxkF4GxCwqwRj0TDlbmswtaMFbKzU";
        String expectedUrl = "https://postman-echo.com/post";

        PostTextRoot result = given()
                .body("This is expected to be sent back as part of response body.")
                .when()
                .header("Cookie", expectedCookie)
                .post("post")
                .then().log().all()
                .extract().as(PostTextRoot.class);
        assertEquals(expectedData, result.getData(), "Значение data не соответствует ожидаемому результату");
        assertEquals(expectedHost, result.getHeaders().getHost(), "Значение host не соответствует ожидаемому результату");
        assertNotNull(result.getHeaders().getxRequestStart(), "Значение поля не должно быть пустым");
        assertEquals(expectedContentLength, result.getHeaders().getContentLength(), "Значение contentLength не соответствует ожидаемому результату");
        assertEquals(expectedXForwardedProto, result.getHeaders().getxForwardedProto(), "Значение xForwardedProto не соответствует ожидаемому результату");
        assertEquals(expectedXForwardedPort, result.getHeaders().getxForwardedPort(), "Значение xForwardedPort не соответствует ожидаемому результату");
        assertNotNull(result.getHeaders().getxAmznTraceId(), "Значение поля не должно быть пустым");
        assertEquals(expectedContentType, result.getHeaders().getContentType(), "Значение contentType не соответствует ожидаемому результату");
        assertEquals(expectedUserAgent, result.getHeaders().getUserAgent(), "Значение userAgent не соответствует ожидаемому результату");
        assertNull(result.getHeaders().getCacheControl(), "Значение поля должно быть пустым");
        assertNull(result.getHeaders().getPostmanToken(), "Значение поля должно быть пустым");
        assertEquals(expectedAcceptEncoding, result.getHeaders().getAcceptEncoding(), "Значение acceptEncoding не соответствует ожидаемому результату");
        assertEquals(expectedCookie, result.getHeaders().getCookie(), "Значение Cookie не соответствует ожидаемому результату");
        assertNull(result.getJson(), "Значение поля должно быть пустым");
        assertEquals(expectedUrl, result.getUrl(), "Значение url не соответствует ожидаемому результату");
    }

    @Test
    public void methodPostDataTest() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpec(200));
        String expectedHost = "postman-echo.com";
        String expectedContentLength = "0";
        String expectedXForwardedProto = "https";
        String expectedXForwardedPort = "443";
        String expectedUserAgent = "Apache-HttpClient/4.5.13 (Java/11.0.14)";
        String expectedAccept = "*/*";
        String expectedAcceptEncoding = "gzip,deflate";
        String expectedCookie = "sails.sid=s%3ASpPfiZSv2nT0BTPumYHVOEh7viAobo27.kJFCiYvVB054S84nqtNLthZOlCfgGkkklNAeqHUtp9Q";
        String expectedUrl = "https://postman-echo.com/post";

        PostDataRoot result = given()
                .when()
                .header("Cookie", expectedCookie)
                .post("post")
                .then().log().all()
                .extract().as(PostDataRoot.class);
        assertEquals(expectedHost, result.getHeaders().getHost(), "Значение host не соответствует ожидаемому результату");
        assertNotNull(result.getHeaders().getxRequestStart(), "Значение поля не должно быть пустым");
        assertEquals(expectedContentLength, result.getHeaders().getContentLength(), "Значение contentLength не соответствует ожидаемому результату");
        assertEquals(expectedXForwardedProto, result.getHeaders().getxForwardedProto(), "Значение xForwardedProto не соответствует ожидаемому результату");
        assertEquals(expectedXForwardedPort, result.getHeaders().getxForwardedPort(), "Значение xForwardedPort не соответствует ожидаемому результату");
        assertNotNull(result.getHeaders().getxAmznTraceId(), "Значение поля не должно быть пустым");
        assertEquals(expectedUserAgent, result.getHeaders().getUserAgent(), "Значение userAgent не соответствует ожидаемому результату");
        assertEquals(expectedAccept, result.getHeaders().getAccept(), "Значение accept не соответствует ожидаемому результату");
        assertNull(result.getHeaders().getCacheControl(), "Значение поля должно быть пустым");
        assertNull(result.getHeaders().getPostmanToken(), "Значение поля должно быть пустым");
        assertEquals(expectedAcceptEncoding, result.getHeaders().getAcceptEncoding(), "Значение acceptEncoding не соответствует ожидаемому результату");
        assertEquals(expectedCookie, result.getHeaders().getCookie(), "Значение Cookie не соответствует ожидаемому результату");
        assertNull(result.getJson(), "Значение поля должно быть пустым");
        assertEquals(expectedUrl, result.getUrl(), "Значение url не соответствует ожидаемому результату");
    }

    @Test
    public void methodPutTest() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpec(200));
        String expectedData = "This is expected to be sent back as part of response body.";
        String expectedHost = "postman-echo.com";
        String expectedContentLength = "58";
        String expectedXForwardedProto = "https";
        String expectedXForwardedPort = "443";
        String expectedContentType = "application/json";
        String expectedUserAgent = "Apache-HttpClient/4.5.13 (Java/11.0.14)";
        String expectedAccept = "*/*";
        String expectedAcceptEncoding = "gzip,deflate";
        String expectedCookie = "sails.sid=s%3A1C9W7uuv7wVQOYrQuLHl2XBrbT5zkXYn.j3ZM30nHvxeF2RHbQyYBBEC55kWJ0Jw90hcQZQz49ic";
        String expectedUrl = "https://postman-echo.com/put";

        PutRoot result = given()
                .body("This is expected to be sent back as part of response body.")
                .when()
                .header("Cookie", expectedCookie)
                .put("put")
                .then().log().all()
                .extract().as(PutRoot.class);
        assertEquals(expectedData, result.getData(), "Значение data не соответствует ожидаемому результату");
        assertEquals(expectedHost, result.getHeaders().getHost(), "Значение host не соответствует ожидаемому результату");
        assertNotNull(result.getHeaders().getxRequestStart(), "Значение поля не должно быть пустым");
        assertEquals(expectedContentLength, result.getHeaders().getContentLength(), "Значение contentLength не соответствует ожидаемому результату");
        assertEquals(expectedXForwardedProto, result.getHeaders().getxForwardedProto(), "Значение xForwardedProto не соответствует ожидаемому результату");
        assertEquals(expectedXForwardedPort, result.getHeaders().getxForwardedPort(), "Значение xForwardedPort не соответствует ожидаемому результату");
        assertNotNull(result.getHeaders().getxAmznTraceId(), "Значение поля не должно быть пустым");
        assertEquals(expectedContentType, result.getHeaders().getContentType(), "Значение contentType не соответствует ожидаемому результату");
        assertEquals(expectedUserAgent, result.getHeaders().getUserAgent(), "Значение userAgent не соответствует ожидаемому результату");
        assertEquals(expectedAccept, result.getHeaders().getAccept(), "Значение accept не соответствует ожидаемому результату");
        assertNull(result.getHeaders().getCacheControl(), "Значение поля должно быть пустым");
        assertNull(result.getHeaders().getPostmanToken(), "Значение поля должно быть пустым");
        assertEquals(expectedAcceptEncoding, result.getHeaders().getAcceptEncoding(), "Значение acceptEncoding не соответствует ожидаемому результату");
        assertEquals(expectedCookie, result.getHeaders().getCookie(), "Значение Cookie не соответствует ожидаемому результату");
        assertNull(result.getJson(), "Значение поля должно быть пустым");
        assertEquals(expectedUrl, result.getUrl(), "Значение url не соответствует ожидаемому результату");
    }

    @Test
    public void methodPatchTest() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpec(200));
        String expectedData = "This is expected to be sent back as part of response body.";
        String expectedHost = "postman-echo.com";
        String expectedContentLength = "58";
        String expectedXForwardedProto = "https";
        String expectedXForwardedPort = "443";
        String expectedContentType = "application/json";
        String expectedUserAgent = "Apache-HttpClient/4.5.13 (Java/11.0.14)";
        String expectedAccept = "*/*";
        String expectedAcceptEncoding = "gzip,deflate";
        String expectedCookie = "sails.sid=s%3AKxDuw1MQbcDxIOnEJopKuHuTfaazDZCL.Pz7oqCpvvyKDipubYyI2IDfsc4%2F2R3oix3B0SzFJny4";
        String expectedUrl = "https://postman-echo.com/patch";
        PatchRoot result = given()
                .body("This is expected to be sent back as part of response body.")
                .when()
                .header("Cookie", expectedCookie)
                .patch("patch")
                .then().log().all()
                .extract().as(PatchRoot.class);
        assertEquals(expectedData, result.getData(), "Значение data не соответствует ожидаемому результату");
        assertEquals(expectedHost, result.getHeaders().getHost(), "Значение host не соответствует ожидаемому результату");
        assertNotNull(result.getHeaders().getxRequestStart(), "Значение поля не должно быть пустым");
        assertEquals(expectedContentLength, result.getHeaders().getContentLength(), "Значение contentLength не соответствует ожидаемому результату");
        assertEquals(expectedXForwardedProto, result.getHeaders().getxForwardedProto(), "Значение xForwardedProto не соответствует ожидаемому результату");
        assertEquals(expectedXForwardedPort, result.getHeaders().getxForwardedPort(), "Значение xForwardedPort не соответствует ожидаемому результату");
        assertNotNull(result.getHeaders().getxAmznTraceId(), "Значение поля не должно быть пустым");
        assertEquals(expectedContentType, result.getHeaders().getContentType(), "Значение contentType не соответствует ожидаемому результату");
        assertEquals(expectedUserAgent, result.getHeaders().getUserAgent(), "Значение userAgent не соответствует ожидаемому результату");
        assertEquals(expectedAccept, result.getHeaders().getAccept(), "Значение accept не соответствует ожидаемому результату");
        assertNull(result.getHeaders().getCacheControl(), "Значение поля должно быть пустым");
        assertNull(result.getHeaders().getPostmanToken(), "Значение поля должно быть пустым");
        assertEquals(expectedAcceptEncoding, result.getHeaders().getAcceptEncoding(), "Значение acceptEncoding не соответствует ожидаемому результату");
        assertEquals(expectedCookie, result.getHeaders().getCookie(), "Значение Cookie не соответствует ожидаемому результату");
        assertNull(result.getJson(), "Значение поля должно быть пустым");
        assertEquals(expectedUrl, result.getUrl(), "Значение url не соответствует ожидаемому результату");
    }
    @Test
    public void methodDeleteTest() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpec(200));
        String expectedData = "This is expected to be sent back as part of response body.";
        String expectedHost = "postman-echo.com";
        String expectedContentLength = "58";
        String expectedXForwardedProto = "https";
        String expectedXForwardedPort = "443";
        String expectedContentType = "application/json";
        String expectedUserAgent = "Apache-HttpClient/4.5.13 (Java/11.0.14)";
        String expectedAccept = "*/*";
        String expectedAcceptEncoding = "gzip,deflate";
        String expectedCookie = "sails.sid=s%3AHtozrGjlMEI8m16QFxUrp0eLCK6Mr-Bl.ojKFOFNdAeIC9cw4FdEw6w3VZ0CvMSn1%2F%2ByPEFsKTSY";
        String expectedUrl = "https://postman-echo.com/delete";

        DeleteRoot result = given()
                .body("This is expected to be sent back as part of response body.")
                .when()
                .header("Cookie", expectedCookie)
                .delete("delete")
                .then().log().all()
                .extract().as(DeleteRoot.class);
        assertEquals(expectedData, result.getData(), "Значение data не соответствует ожидаемому результату");
        assertEquals(expectedHost, result.getHeaders().getHost(), "Значение host не соответствует ожидаемому результату");
        assertNotNull(result.getHeaders().getxRequestStart(), "Значение поля не должно быть пустым");
        assertEquals(expectedContentLength, result.getHeaders().getContentLength(), "Значение contentLength не соответствует ожидаемому результату");
        assertEquals(expectedXForwardedProto, result.getHeaders().getxForwardedProto(), "Значение xForwardedProto не соответствует ожидаемому результату");
        assertEquals(expectedXForwardedPort, result.getHeaders().getxForwardedPort(), "Значение xForwardedPort не соответствует ожидаемому результату");
        assertNotNull(result.getHeaders().getxAmznTraceId(), "Значение поля не должно быть пустым");
        assertEquals(expectedContentType, result.getHeaders().getContentType(), "Значение contentType не соответствует ожидаемому результату");
        assertEquals(expectedUserAgent, result.getHeaders().getUserAgent(), "Значение userAgent не соответствует ожидаемому результату");
        assertEquals(expectedAccept, result.getHeaders().getAccept(),"Значение accept не соответствует ожидаемому результату");
        assertNull(result.getHeaders().getCacheControl(), "Значение поля должно быть пустым");
        assertNull(result.getHeaders().getPostmanToken(), "Значение поля должно быть пустым");
        assertEquals(expectedAcceptEncoding, result.getHeaders().getAcceptEncoding(), "Значение acceptEncoding не соответствует ожидаемому результату");
        assertEquals(expectedCookie, result.getHeaders().getCookie(), "Значение Cookie не соответствует ожидаемому результату");
        assertNull(result.getJson(), "Значение поля должно быть пустым");
        assertEquals(expectedUrl, result.getUrl(), "Значение url не соответствует ожидаемому результату");
    }
}
