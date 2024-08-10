package jsonfilereadconcept;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class JsonDemo3 {

	public static void main(String[] args) throws JsonIOException, JsonSyntaxException, FileNotFoundException   {
		JsonParser jo=new JsonParser();
		Object obj=jo.parse(new FileReader("E:\\Java FLM practice\\HybridFrameWork\\JsonFolder\\jsonpractice.json"));
		
		JsonArray je=(JsonArray) obj;
		Iterator<JsonElement> it=je.iterator();
		JsonElement js=null;
		while(it.hasNext())
		{
			js=it.next();
			JsonObject jobj=(JsonObject) js;
			System.out.println(jobj.get("name"));
			System.out.println(jobj.get("age"));
			System.out.println(jobj.get("phone"));
			System.out.println(jobj.get("hobbies"));
		}
		
		
		
		
	
	}

}