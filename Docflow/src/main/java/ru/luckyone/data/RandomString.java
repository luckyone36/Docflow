package ru.luckyone.data;

import java.io.IOException;
import java.util.Random; 

public class RandomString {
	public static String randomStringGeneration() throws IOException {
	    Random r = new Random();
	    String s = r.ints(48, 123)
	                .filter(num -> (num < 58 || num > 64) && (num < 91 || num > 96))
	                .limit(10)
	                .mapToObj(c -> (char) c).collect(StringBuffer::new, StringBuffer::append, StringBuffer::append)
	                .toString();
	    return s;
	}
}