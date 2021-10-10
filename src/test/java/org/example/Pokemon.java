package org.example;

import org.junit.Test;
import static io.restassured.RestAssured.*;

public class Pokemon extends BaseApi{

    @Test
    public void buscarPorId(){
        given().header("Content-Type","application/json").get("/pokemon/1").then().statusCode(200);
    }

    @Test
    public void buscarPorNome(){
        given().header("Content-Type","application/json").when().get("/pokemon/butterfree").then().statusCode(200);
    }
}
