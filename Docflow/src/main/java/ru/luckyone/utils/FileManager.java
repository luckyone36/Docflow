package ru.luckyone.utils;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class FileManager {
	
	 public static class LocalDateSerializer implements JsonSerializer<LocalDate> {
	        private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	        @Override
	        public JsonElement serialize(LocalDate localDate, Type srcType, JsonSerializationContext context) {
	            return new JsonPrimitive(formatter.format(localDate));
	        }
	    }
}
