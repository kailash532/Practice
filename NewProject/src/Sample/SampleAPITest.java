package Sample;

import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampleAPITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 RestAssured.baseURI = "http://api.openweathermap.org/data/2.5/weather?q=Tirupati,Andhra%20Pradesh&appid=7fe67bf08c80ded756e598d6f8fedaea";
		 RequestSpecification httpRequest = RestAssured.given();
		 Response response = httpRequest.request(Method.GET, RestAssured.baseURI);
		 String responseBody = response.getBody().asString();
		 System.out.println("Response Body is =>  " + responseBody);
		 System.out.println(response.getStatusCode());
		 System.out.println(response.getStatusLine());
		 Map<Object, Object> company = response.jsonPath().getMap("main");
		 System.out.println(company.get("temp").toString());
		 System.out.println(company.get("humidity").toString());
		 System.out.println(Math.round(Double.parseDouble(company.get("temp").toString())));
		 System.out.println(Double.parseDouble(company.get("temp").toString())-273.15);
		 
		 double tempInFh=(Double.parseDouble(company.get("temp").toString())-273.15);
		 tempInFh=(tempInFh*9)/5+32;
		 System.out.println(tempInFh);
	}

}
