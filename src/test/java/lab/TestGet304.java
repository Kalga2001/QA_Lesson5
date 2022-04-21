package lab;

import entities.BaseClass;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.AssertJUnit.assertEquals;
public class TestGet304 extends BaseClass {
    CloseableHttpClient client;
    CloseableHttpResponse response;

    @BeforeTest
    public void setup() {
        client = HttpClientBuilder.create().build();

    }

    @AfterTest
    public void teardown() throws IOException {
        client.close();
        response.close();
    }

    @Test(dataProvider = "endpoints")
    public static void return_base_url_401(String endpoint) throws IOException {
        HttpGet get = new HttpGet("uri:BASE_URL" + endpoint);
        CloseableHttpClient client = HttpClientBuilder.create().build();

        HttpResponse response = client.execute(get);
        int actualStatus = response.getStatusLine().getStatusCode();
        assertEquals("expected:404", actualStatus);
    }

    @DataProvider
    private Object[][] endpoints() {
        return new Object[][]{
                {"/gits/public"},
                {"/gits/public/followers"},
                {"/notifications"}
        };
    }
}
