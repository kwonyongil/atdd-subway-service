package nextstep.subway.auth.acceptance;

import io.restassured.RestAssured;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import java.util.HashMap;
import java.util.Map;
import nextstep.subway.auth.dto.TokenResponse;
import org.springframework.http.MediaType;

public class AuthRestAssured {
    public static ExtractableResponse<Response> 로그인_요청(String email, String password) {
        Map<String,String> params = new HashMap<>();
        params.put("email",email);
        params.put("password",password);

        return RestAssured
                .given().log().all()
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .body(params)
                .when().post("/login/token")
                .then().log().all()
                .extract();
    }

    public static String 로그인_되어_있음(String email, String password) {
        return 로그인_요청(email, password).as(TokenResponse.class).getAccessToken();
    }
}