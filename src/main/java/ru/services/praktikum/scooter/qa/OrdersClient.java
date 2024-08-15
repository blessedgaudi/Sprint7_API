package ru.services.praktikum.scooter.qa;

import io.qameta.allure.Step;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class OrdersClient {
    private static final String ORDERS_ENDPOINT = "/api/v1/orders";

    @Step("Создание заказа")
    public Response createOrder(Object body) {
        return given()
                .header("Content-type", "application/json")
                .and()
                .body(body)
                .when()
                .post(ORDERS_ENDPOINT);
    }
}
