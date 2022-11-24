package acc.br;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;

import acc.br.model.Fruta;

import static io.restassured.RestAssured.given;

import java.util.List;

@QuarkusTest
public class FrutasResourceTest {

    @Test
    public void testFrutasEndpoint() {
        given().contentType(ContentType.JSON).param("nome", "qtd")
          .when().get("/fruta")
          .then()
             .statusCode(200)
             .body("nome", hasItem("x"))
             .body("qtd", 1);
    }

}