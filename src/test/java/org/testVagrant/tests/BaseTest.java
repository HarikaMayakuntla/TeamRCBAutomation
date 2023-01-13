    package org.testVagrant.tests;

    import io.restassured.builder.RequestSpecBuilder;
    import io.restassured.filter.log.LogDetail;
    import io.restassured.http.ContentType;
    import io.restassured.response.Response;
    import org.slf4j.Logger;
    import org.slf4j.LoggerFactory;
    import org.testng.annotations.AfterMethod;
    import org.testng.annotations.BeforeClass;
    import org.testng.asserts.SoftAssert;

    public class BaseTest {

        public Response response;
        public RequestSpecBuilder requestSpecBuilder;
        public SoftAssert softAssert =new SoftAssert();
        public Logger BASE_LOGGER = LoggerFactory.getLogger(this.getClass());

        @BeforeClass
        public void setUp(){
            requestSpecBuilder = new RequestSpecBuilder().setBaseUri("https://run.mocky.io")
                    .setContentType(ContentType.JSON).log(LogDetail.ALL);

        }

        @AfterMethod
        public void clearData(){

        }
    }
