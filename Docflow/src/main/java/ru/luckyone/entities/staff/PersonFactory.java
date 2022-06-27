package ru.luckyone.entities.staff;

import java.io.File;
import java.util.Random;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import ru.luckyone.data.PersonDB;
/**
 * Генерирует объект класса Person
 * @author altair
 *
 */
public class PersonFactory {
	/**
	 * Метод читает xml файл и случайным образом выбирает объект класса Person
	 * @return Возвращает экземпляр класса Person
	 * @throws JAXBException
	 */
	public static Staff createPerson() throws JAXBException {
		
		File xml = new File("src/main/resources/personDB.xml");
		JAXBContext jc = JAXBContext.newInstance(PersonDB.class);
		Unmarshaller unmarshaller = jc.createUnmarshaller();
		PersonDB persons = (PersonDB) unmarshaller.unmarshal(xml);
		
		Random rand = new Random();
		Person randomPerson = persons.getPersonDB().get( rand.nextInt(persons.getPersonDB().size()) );
		return randomPerson;
	}

}
