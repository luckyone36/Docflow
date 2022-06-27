package ru.luckyone;

import java.io.IOException;
import java.util.ArrayList;

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
public class Main {
	
	public static void main(String[] args) throws IOException, DocumentExistsException, Exception {
		
		// Приветствие и запрос кол-ва документов
		DocQuantity begin = new DocQuantity();
		int docQuantity = begin.start();
		
		// Создание списка документов
		DocumentsGenerator generation = new DocumentsGenerator();
		ArrayList<Document> docList = generation.generate(docQuantity);
		
		// Сортировка документов по фамилии
		docList.sort((o1, o2) -> o1.getAuthor().toString().compareTo(o2.getAuthor().toString()));
		
//		for (Document doc : docList) { 		
//		System.out.println(doc.getAuthor().toString() + doc.getUuid().toString()); 	
//		} 
		
		// Печать списка полученных документов
		DocumentsPrinter print = new DocumentsPrinter();
		print.printer(docList);
	}
	
}
