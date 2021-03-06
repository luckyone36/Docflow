package ru.luckyone.factory;

import java.io.IOException;
import java.util.ArrayList;

import javax.xml.bind.JAXBException;

import ru.luckyone.data.RandomString;
import ru.luckyone.entities.documents.Document;
import ru.luckyone.entities.documents.Task;
import ru.luckyone.entities.staff.CreatePerson;
import ru.luckyone.exception.DocumentExistsException;
/**
 * Фабрика создающая объекты класса Task
 * @author altair
 *
 */
public class TaskFactory {
	/**
	 * Создает экземпляр класса Task
	 * @param docList Массив документов
	 * @return Объект класса Task
	 * @throws DocumentExistsException
	 * @throws IOException
	 * @throws JAXBException
	 */
	public Task createTask(ArrayList<Document> docList) throws DocumentExistsException, IOException, JAXBException { 
		Task task = new Task();
		task.setUuid();
		task.setAuthor(CreatePerson.createPerson());
		task.setName(RandomString.randomStringGeneration());
		task.setText(RandomString.randomStringGeneration());
		task.setRegDate();
		task.setRegNum(1);
		task.setDateTask(task.getRegDate());
		task.setDateDoneTask(RandomString.randomStringGeneration());
		task.setResponsiblePerson(CreatePerson.createPerson());
		task.setAttribute(RandomString.randomStringGeneration());
		task.setControlPerson(CreatePerson.createPerson());
		for (Document doc : docList) {
			if (task.getUuid().toString().equals(doc.getUuid().toString())) {
				throw new DocumentExistsException ("Документ с таким номером существует.");
			}
		}
		return task;
	}

}
