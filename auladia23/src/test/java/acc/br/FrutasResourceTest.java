package acc.br;

import static io.restassured.RestAssured.given;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import acc.br.model.Fruta;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;



@QuarkusTest
public class FrutasResourceTest {
   
	//fazer depois com Mockito
//    @Test
//    public void novaFrutaEndpointTest() {
//    	Fruta fruta = new Fruta();
//        given().contentType(ContentType.JSON).body(fruta)
//          .when().post("/frutas")
//          .then()
//             .statusCode(204);
//             
//    }
//    @Test
//    public void apagaFrutaEndpointTest() {
//    	Fruta fruta = new Fruta();
//    	Long id = 1L;
//        given().contentType(ContentType.JSON).body(fruta)
//          .when().delete("/frutas/{id});"
//          .then()
//             .statusCode(204);
//             
//    }

}