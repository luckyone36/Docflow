package ru.luckyone.utils;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import ru.luckyone.entities.documents.Document;
import ru.luckyone.entities.staff.Person;
import ru.luckyone.entities.staff.Staff;
/**
 * Вывод результатов генерации документов
 * @author altair
 *
 */
public class DocumentsPrinter {

	public DocumentsPrinter() {
	}
	/**
	 * Метод выводящий результат генерации документов
	 * @param docList Массив документов
	 * @return
	 * @throws Exception
	 */
	public ArrayList<Document> printer (ArrayList<Document> docList) throws Exception {

		Stream<Document> stream = docList.stream(); // создаем поток из листа
		//stream.forEach(s -> System.out.println(s)); // вывод содержимомго потока
		
		Map<Staff, List<Document>>  docGroup = 
				stream.collect(Collectors.groupingBy(Document::getAuthor));
		
		for (Map.Entry<Staff, List<Document>> item : docGroup.entrySet()) {
//			System.out.println("\n" + item.getKey()); //вывод автора по которому идет группировка
			Staff name = item.getKey();
			String surname = ((Person) name).getSurName();
//			System.out.println("\n" + name); //вывод фио автора
//			System.out.println("\n" + surname); //вывод только фамилии, для проверки группировки по фамилии
			
	        for(Document doc : item.getValue()) {
	        	GsonBuilder gsonBuilder = new GsonBuilder();
	    		gsonBuilder.registerTypeAdapter(LocalDate.class, new FileManager.LocalDateSerializer());
	    		gsonBuilder.setPrettyPrinting();
	    		Gson gson = new Gson();
	    		gson = gsonBuilder.create();
	    		String json = gson.toJson(doc);
//	        	createJsonFile(surname, doc.toString()); //вывод без json
	    		createJsonFile(surname, json);
//	        	System.out.println(doc.toString()); //вывод документа
	        }       
	    }
		System.out.println("Создание документов завершено.");
	    return null;
	}
	/**
	 * Метод создающий файл с фамилией автора документа в названии файла и самого документа в формате json внутри
	 * @param filename
	 * @param json
	 * @throws Exception
	 */
	public static void createJsonFile (String filename, String json) throws Exception {
		Files.write(Paths.get(filename), json.toString().getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
//		System.out.println("file created"); // для проверки создания записей по каждому документу
	}
}


//for (Document doc : docList) { 		
//System.out.println(doc.getAuthor().toString() + doc.getUuid().toString()); 	
//} 

//Person art = new Person("Gil", "Art", "Rav");
