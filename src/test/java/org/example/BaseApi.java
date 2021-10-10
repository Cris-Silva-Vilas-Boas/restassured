package org.example;

import org.junit.BeforeClass;
import static io.restassured.RestAssured.*;

public class BaseApi {

    @BeforeClass
    public static void preCondition(){
        baseURI = "https://pokeapi.co";
        basePath = "/api/v2";
    }
}
