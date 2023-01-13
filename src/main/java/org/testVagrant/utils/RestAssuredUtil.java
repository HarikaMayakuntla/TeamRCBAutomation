package org.testVagrant.utils;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class RestAssuredUtil {
        //to set base URI
        public static void setBaseURI() {
            RestAssured.baseURI = "https://run.mocky.io/";
        }

        //to set end point
        public static void setBasePath(String basePath) {
            RestAssured.basePath = basePath;
        }


        //to set ContentType header
        public static void setContentType(ContentType Type) {
            given().contentType(Type);
        }

        //to return response
        public static Response getResponse(String path) {
            return given().get(path);
        }


        //return json object
        public static JsonPath getJsonPath(Response res) {
            String json = res.asString();
            return new JsonPath(json);
        }
    }
