package screenRecorder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class JsonReading {
	
public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
	JSONParser parser = new JSONParser();
	 Object obj = parser.parse(new FileReader("D:\\Practice\\VideosExample\\src\\main\\java\\API\\Platform_Masking_DonotDelete.json"));
     JSONObject jsonObject = (JSONObject)obj;
     JSONArray subjects = (JSONArray)jsonObject.get("ColumnHeaders");
     System.out.println(subjects.size());
     for(int i = 0; i < subjects.size(); i++){
    	 JsonObject thisChartData = ((JsonElement) subjects.get(i)).getAsJsonObject();
    	 System.out.println(thisChartData.getAsJsonObject("Label"));
     }
     
     JSONObject json = new JSONObject(); 
     JSONObject jsonobj = new JSONObject(); 
     JSONObject jsonobj1 = new JSONObject(); 
     json.put("Username", "TestUser");
     json.put("Password", "Password1");
     
     jsonobj1.put("ApiUsername", "TestUserApi");
     jsonobj1.put("ApiPassword", "Password1Api");
     
     json.put("APICred", jsonobj1);
     
     jsonobj.put("credentails", json);
     
  
  
   
     
	System.out.println("###########"+jsonobj.toJSONString());
}
}
