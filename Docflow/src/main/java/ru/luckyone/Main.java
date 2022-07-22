package ru.luckyone;

import java.io.IOException;
import java.util.List;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import ru.luckyone.console.DocQuantity;
import ru.luckyone.entities.documents.Document;
import ru.luckyone.exception.DocumentExistsException;
import ru.luckyone.utils.DocumentsPrinter;
/**
 *Программа по документообороту 20-00
 *
 * @author altair
 *
 */
@Path("/Docflow")
@ApplicationPath("/resources")
public class Main {
	
	// http://localhost:8080/Docflow/resources/Hello
	@GET
	@Path("/Hello")
	public static void main(String[] args) throws IOException, DocumentExistsException, Exception {
		
		System.out.println("Hello!");
//		// Приветствие и запрос кол-ва документов
//		DocQuantity begin = new DocQuantity();
//		int docQuantity = begin.start();
//		
//		// Создание списка документов
//		DocumentsGenerator generation = new DocumentsGenerator();
//		List<Document> docList = generation.generate(docQuantity);
//		
//		// Сортировка документов по фамилии
//		docList.sort((o1, o2) -> o1.getAuthor().toString().compareTo(o2.getAuthor().toString()));
//		
////		for (Document doc : docList) { 		
////		System.out.println(doc.getAuthor().toString() + doc.getUuid().toString()); 	
////		} 
//		
//		// Печать списка полученных документов
//		DocumentsPrinter print = new DocumentsPrinter();
//		print.printer(docList);
	}
	
}
