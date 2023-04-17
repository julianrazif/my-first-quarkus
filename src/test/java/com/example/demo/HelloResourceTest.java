package com.example.demo;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class HelloResourceTest {

    @Test
    public void testHelloEndpoint() {
        RestAssured
                .given()
                .when()
                .get("/api/hello")
                .then()
                .statusCode(200)
                .body(Is.is("My name is Julian Razif Figaro"));
    }
}
