package ru.luckyone.factory;

import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBException;

import ru.luckyone.data.RandomString;
import ru.luckyone.entities.documents.Document;
import ru.luckyone.entities.documents.Incoming;
import ru.luckyone.entities.staff.PersonFactory;
import ru.luckyone.exception.DocumentExistsException;
/**
 * Фабрика создающая объекты класса Incoming
 * @author altair
 *
 */
public class IncomingFactory {
	/**
	 * Создает экземпляр класса Incoming
	 * @param docList Массив документов
	 * @return Объект класса Incoming
	 * @throws DocumentExistsException
	 * @throws IOException
	 * @throws JAXBException
	 */
	public Incoming createIncoming(List<Document> docList) throws DocumentExistsException, IOException, JAXBException {
		Incoming incoming = new Incoming();
		incoming.setUuid();
		incoming.setAuthor(PersonFactory.createPerson());
		incoming.setName(RandomString.randomStringGeneration());
		incoming.setText(RandomString.randomStringGeneration());
		incoming.setRegDate();
		incoming.setRegNum(1);
		incoming.setSender(RandomString.randomStringGeneration());
		incoming.setAddressee(RandomString.randomStringGeneration());
		incoming.setOutgoingNumber(RandomString.randomStringGeneration());
		incoming.setOutgoingRegDate(RandomString.randomStringGeneration());
		for (Document doc : docList) {
			if (incoming.getUuid().toString().equals(doc.getUuid().toString())) {
				throw new DocumentExistsException ("Документ с таким номером существует.");
			}
		}
		return incoming;
	}
}
