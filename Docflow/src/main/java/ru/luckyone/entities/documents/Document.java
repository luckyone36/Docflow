package ru.luckyone.entities.documents;

import java.time.LocalDate;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

import com.google.gson.annotations.SerializedName;

import ru.luckyone.data.Storable;
import ru.luckyone.entities.staff.Staff;

public abstract class Document implements Comparable<Document>, Storable{
	
//	private String docType; //Тип документа
	@SerializedName("идентификатор документа")
	private UUID uuid; // Идентификатор документа
	@SerializedName("название документа")
    private String name; // Название документа
	@SerializedName("текст документа")
    private String text; // Текст документа
	@SerializedName("регистрационный номер документа")
    private int regNum; // Регистрационный номер документа
	@SerializedName("дата регистрации документа")
    private LocalDate regDate; // Дата регистрации документа
	@SerializedName("автор документа")
	private Staff author; // Автор документа
	
	public Document() {
		setUuid();
	}
	
	public UUID getUuid() {
		return uuid;
	}

	public void setUuid() {
		UUID uuid = UUID.randomUUID();
		this.uuid = uuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getRegNum() {
		return regNum;
	}

	public void setRegNum(int regNum) {
		this.regNum = regNum;
	}

	public LocalDate getRegDate() {
		return regDate;
	}

	public void setRegDate() {
		long minDay = LocalDate.of(1988, 06, 28).toEpochDay();
	    long maxDay = LocalDate.of(2022, 05, 12).toEpochDay();
	    long randomDay = ThreadLocalRandom.current().nextLong(minDay, maxDay);
	    LocalDate regDate = LocalDate.ofEpochDay(randomDay);
		this.regDate = regDate;
	}

	public Staff getAuthor() {
		return author;
	}

	public void setAuthor(Staff author) {
		this.author = author;
	}

	public Staff getKey() {
		return author;
	}
	
}