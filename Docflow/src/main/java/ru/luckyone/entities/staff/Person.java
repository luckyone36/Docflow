package ru.luckyone.entities.staff;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.google.gson.annotations.SerializedName;

@XmlRootElement(name="person")
@XmlAccessorType(XmlAccessType.FIELD)
public class Person extends Staff {
	
	@SerializedName("фамилия")
	private String surName;
	@SerializedName("имя")
	private String givName;
	@SerializedName("отчество")
	private String patronymic;
	@SerializedName("должность")
	private String position; //должность
//	@SerializedName("дата рождения")
//	private LocalDate dateOfBirth; // дата рождения
	@SerializedName("номер телефона")
	private String phoneNumber; // номер телефона
	
	public Person() {
	}
	
	public Person(String surName, String givName, String patronymic) {
		this.surName = surName;
		this.givName = givName;
		this.patronymic = patronymic;
	}
	
	public Person(String surName, String givName, String patronymic, String position, LocalDate dateOfBirth,
			String phoneNumber) {
		this.surName = surName;
		this.givName = givName;
		this.patronymic = patronymic;
		this.position = position;
//		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
	}

	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getGivName() {
		return givName;
	}
	public void setGivName(String givName) {
		this.givName = givName;
	}
	public String getPatronymic() {
		return patronymic;
	}
	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}
	
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
//	@XmlElement(required=true)
//	public LocalDate getDateOfBirth() {
//		return dateOfBirth;
//	}
//	
//	@XmlJavaTypeAdapter(value = LocalDateAdapter.class)
//	public void setDateOfBirth(LocalDate dateOfBirth) {
//		this.dateOfBirth = dateOfBirth;
//	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return surName + " " + givName + " " + patronymic;
	}
	public class LocalDateAdapter extends XmlAdapter<String, LocalDate> {
	    
		public LocalDate unmarshal(String v) throws Exception {
	        return LocalDate.parse(v);
	    }

	    public String marshal(LocalDate v) throws Exception {
	        return v.toString();
	    }
	}

}
