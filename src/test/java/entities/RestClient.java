package entities;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RestClient {
    private static final String END_POINT_USERS = "/api/v1/Users/";


    public Response getEntityById(int id) {
        return given()
                .contentType(ContentType.JSON)
                .when()
                .get( END_POINT_USERS + id);
    }

    public Response getEntity() {
        return given()
                .contentType(ContentType.JSON)
                .when()
                .get(END_POINT_USERS);
    }

    public Response deleteEntity(int id) {
        return given()
                .contentType(ContentType.JSON)
                .when()
                .delete(END_POINT_USERS+ id);
    }

    public Response postEntity(User user) {
        return given()
                .contentType(ContentType.JSON)
                .body(user)
                .when()
                .post(END_POINT_USERS);
    }
}
