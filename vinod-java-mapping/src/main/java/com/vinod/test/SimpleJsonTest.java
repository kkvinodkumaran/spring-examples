package com.vinod.test;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class SimpleJsonTest {

	public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        try {
               // use parser
              Object obj = parser.parse(new FileReader("jsontest.json"));
               // converting
               JSONObject jsonObject = (JSONObject) obj;
               String name = (String) jsonObject.get("name");
               System.out.println(name);
               long age = (Long) jsonObject.get("age");
               System.out.println(age);
               // loop array
               JSONArray msg = (JSONArray) jsonObject.get("phonenumbers");
               Iterator<String> iterator = msg.iterator();
               while (iterator.hasNext()) {
                     System.out.println(iterator.next());
               }

        } catch (Exception e) {

               e.printStackTrace();

        }
	}

}
