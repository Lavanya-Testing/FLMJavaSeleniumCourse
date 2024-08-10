package jsonfilereadconcept;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class JsonDemo2 {

	public static void main(String[] args) throws JsonIOException, JsonSyntaxException, FileNotFoundException   {
		JsonParser jo=new JsonParser();
		Object ob=jo.parse(new FileReader("E:\\Java FLM practice\\HybridFrameWork\\JsonFolder\\Sample.json"));
		
		JsonObject jb= (JsonObject)ob;
		System.out.println(jb.get("firstname"));
		System.out.println(jb.get("age"));
		System.out.println(jb.get("phone"));
		
		
		
		
	
	}

}