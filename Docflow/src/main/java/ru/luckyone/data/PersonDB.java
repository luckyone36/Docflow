package ru.luckyone.data;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import ru.luckyone.entities.staff.Person;

@XmlRootElement(name="personDB")
@XmlAccessorType (XmlAccessType.FIELD)
public class PersonDB {
//	private final static Person person1 = new Person("Нестеров", "Александр", "Михайлович");
//	private final static Person person2 = new Person("Шестаков", "Всеволод", "Алексеевич");
//	private final static Person person3 = new Person("Иванов", "Ярослав", "Максимович");
//	private final static Person person4 = new Person("Жуков", "Никита", "Тимофеевич");
//	private final static Person person5 = new Person("Сергеев", "Артём", "Иванович");
//	private final static List<Person> personDB = (List<Person>) Arrays.asList(person1, person2, person3, person4, person5);
	
	@XmlElement(name = "person")
	private List<Person> personDB;
	
	public List<Person> getPersonDB() {
		return personDB;
	}

	public void setPersonDB(List<Person> personDB) {
		this.personDB = personDB;
	}

}