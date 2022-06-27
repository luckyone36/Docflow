package ru.luckyone;

import java.io.IOException;
import java.util.ArrayList;

import javax.xml.bind.JAXBException;

import ru.luckyone.entities.documents.Document;
import ru.luckyone.exception.DocumentExistsException;
import ru.luckyone.factory.IncomingFactory;
import ru.luckyone.factory.OutgoingFactory;
import ru.luckyone.factory.TaskFactory;
/**
 * Генератор документов, распределяющий заданное количество документов равномерно по фабрикам создающим объекты
 * @author altair
 *
 */
public class DocumentsGenerator {
	
	public DocumentsGenerator () {
		}
	/**
	 * Метод равномерного распределения заданного числа документов по фабрикам
	 * @param docQuantity Заданное количество документов
	 * @return Массив документов
	 * @throws DocumentExistsException
	 * @throws IOException
	 * @throws JAXBException
	 */
	public ArrayList<Document> generate (int docQuantity) throws DocumentExistsException, IOException, JAXBException {
		ArrayList<Document> docList = new ArrayList<Document>();
		for (int i = 0; i < docQuantity; i++) {
	    	if (i%3 == 0) {
	    		TaskFactory docTask = new TaskFactory();
	    		docList.add(docTask.createTask(docList));
	    	} 
	    	if (i%3 == 1) {
	    		IncomingFactory docIncoming = new IncomingFactory();
	    		docList.add(docIncoming.createIncoming(docList));
	    	} 
	    	if (i%3 == 2) {
	    		OutgoingFactory docOutgoing = new OutgoingFactory();
	    		docList.add(docOutgoing.createOutgoing(docList));
	    	}
		}
		return docList;
	} 
	 
 
}

