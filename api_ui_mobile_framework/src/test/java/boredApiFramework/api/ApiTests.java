package boredApiFramework.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import ui.uiFramework.Constants.FrameworkConstants;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.BDDAssumptions.given;
import static org.hamcrest.Matchers.*;

public class ApiTests {

    @Test
    public void testResponseJsonSchema() {


        RestAssured.baseURI = "https://www.boredapi.com";
        Response response = given().log().all()
                .when().get("/api/activity")
                .then().log().all()
                .assertThat().statusCode(200)
                .extract().response();


        response.then().body("activity", not(isEmptyOrNullString()));
        response.then().body("participants", greaterThanOrEqualTo(1));

    }
}