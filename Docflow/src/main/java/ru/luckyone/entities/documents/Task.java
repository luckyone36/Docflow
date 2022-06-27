package ru.luckyone.entities.documents;

import java.time.LocalDate;

import com.google.gson.annotations.SerializedName;

import ru.luckyone.entities.staff.Staff;

public class Task extends Document {
	@SerializedName("дата выдачи поручения")
	private LocalDate dateTask; //дата выдачи поручения
	@SerializedName("срок исполнения поручения")
	private String dateDoneTask; //срок исполнения поручения
	@SerializedName("ответственный исполнитель")
	private Staff responsiblePerson; //ответственный исполнитель
	@SerializedName("признак контрольности")
	private String attribute; //признак контрольности
	@SerializedName("контролер поручения")
	private Staff controlPerson; //контролер поручения
	
	public LocalDate getDateTask() {
		return dateTask;
	}
	public void setDateTask(LocalDate dateTask) {
		this.dateTask = dateTask;
	}
	public String getDateDoneTask() {
		return dateDoneTask;
	}
	public void setDateDoneTask(String dateDoneTask) {
		this.dateDoneTask = dateDoneTask;
	}
	public Staff getResponsiblePerson() {
		return responsiblePerson;
	}
	public void setResponsiblePerson(Staff responPerson) {
		this.responsiblePerson = responPerson;
	}
	public String getAttribute() {
		return attribute;
	}
	public void setAttribute(String priznac) {
		this.attribute = priznac;
	}
	public Staff getControlPerson() {
		return controlPerson;
	}
	public void setControlPerson(Staff controlPerson) {
		this.controlPerson = controlPerson;
	}
	@Override
	public String toString() {
		return "Поручение "
				+ " №" + getRegNum()
				+ " от " + getRegDate()
				+ ", название:" + getName() 
				+ ", идентификатор:" + getUuid()
				+ ", текст:" + getText() 
				
				+ ", дата выдачи:" + dateTask 
				+ ", срок исполнения:" + dateDoneTask 
				+ ", ответственный исполнитель:" + responsiblePerson 
				+ ", признак контрольности:" + attribute 
				+ ", контролер поручения:" + controlPerson;
	}
	public int compareTo (Document document) {
        if (this.getRegDate().compareTo(document.getRegDate()) > 0) {
            return 1;
        } else if (this.getRegDate().compareTo(document.getRegDate()) < 0) {
            return -1;
        } else {
            return 0;
        }
	}
}