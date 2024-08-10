package jsonfilereadconcept;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class JsonDemo1 {

	public static void main(String[] args) throws JsonIOException, JsonSyntaxException, FileNotFoundException  {
		
		JsonParser jsonParser=new JsonParser();
		
		Object obj=jsonParser.parse(new FileReader("E:\\Java FLM practice\\HybridFrameWork\\JsonFolder\\Sample.json"));
		
		JsonObject jo=(JsonObject) obj;
		
		
		JsonElement name1=jo.get("firstname");
		JsonElement age1=jo.get("age");
		
		System.out.println(jo.get("firstname"));
		System.out.println(jo.get("age"));
		System.out.println(jo.get("phone"));
		
		
	
	}

}