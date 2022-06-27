package ru.luckyone.factory;

import java.io.IOException;
import java.util.ArrayList;

import javax.xml.bind.JAXBException;

import ru.luckyone.data.RandomString;
import ru.luckyone.entities.documents.Document;
import ru.luckyone.entities.documents.Outgoing;
import ru.luckyone.entities.staff.PersonFactory;
import ru.luckyone.exception.DocumentExistsException;
/**
 * Фабрика создающая объекты класса Outgoing
 * @author altair
 *
 */
public class OutgoingFactory {
	/**
	 * Создает экземпляр класса Outgoing
	 * @param docList Массив документов
	 * @return Объект класса Outgoing
	 * @throws DocumentExistsException
	 * @throws IOException
	 * @throws JAXBException
	 */
	public Outgoing createOutgoing(ArrayList<Document> docList) throws DocumentExistsException, IOException, JAXBException {
		Outgoing outgoing = new Outgoing();
		outgoing.setUuid();
		outgoing.setAuthor(PersonFactory.createPerson());
		outgoing.setName(RandomString.randomStringGeneration());
		outgoing.setText(RandomString.randomStringGeneration());
		outgoing.setRegDate();
		outgoing.setRegNum(1);
		outgoing.setAddressee(RandomString.randomStringGeneration());
		outgoing.setDeliverMethod(RandomString.randomStringGeneration());
		for (Document doc : docList) {
			if (outgoing.getUuid().toString().equals(doc.getUuid().toString())) {
				throw new DocumentExistsException ("Документ с таким номером существует.");
			}
		}
		return outgoing;
		
	}
}
