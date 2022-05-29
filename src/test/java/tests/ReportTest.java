package tests;

import static org.assertj.core.api.Assertions.assertThat;

import entities.BaseTest;
import entities.MyAnnotationTest;
import entities.RestClient;
import entities.User;
import io.restassured.response.Response;

import java.util.List;
import org.junit.Test;
import com.google.gson.reflect.TypeToken;

public class ReportTest extends BaseTest {

    RestClient restClient = new RestClient();
    private static final int ID = 5;
    private static final String NAME = "Kate";
    private static final String PASSWORD = "Kate_pass";

    @MyAnnotationTest(message = "BE test")
    @Test
    public void getAllUsers() {
        Response response = restClient.getEntity();
        assertThat(response.statusCode()).as("Status code").isEqualTo(200);
        List<User> users = response.as(((new TypeToken<List<User>>() {
        }).getType()));
        int i = 0;
        for (User user : users) {
            i++;
            assertThat(user.getUserName()).as("User name").isEqualTo("User " + i);
            assertThat(user.getPassword()).as("User name").isEqualTo("Password" + i);
        }
    }

    @MyAnnotationTest(message = "BE test")
    @Test
    public void getUserById() {
        Response response = restClient.getEntityById(ID);
        assertThat(response.statusCode()).as("Status code").isEqualTo(200);
        assertThat(response.as(User.class).getId()).isEqualTo(ID);
    }

    @MyAnnotationTest(message = "BE test")
    @Test
    public void deleteUserById() {
        Response response = restClient.deleteEntity(ID);
        assertThat(response.statusCode()).as("Status code").isEqualTo(200);
    }

    @MyAnnotationTest(message = "BE test")
    @Test
    public void postUser() {
        User user = new User(ID, NAME, PASSWORD);
        Response response = restClient.postEntity(user);
        assertThat(response.statusCode()).as("Status code").isEqualTo(200);
        assertThat(response.as(User.class).getId()).isEqualTo(ID);
        assertThat(response.as(User.class).getUserName()).isEqualTo(NAME);
        assertThat(response.as(User.class).getPassword()).isEqualTo(PASSWORD);
    }
}
