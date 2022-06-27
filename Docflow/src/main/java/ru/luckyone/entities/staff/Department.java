package ru.luckyone.entities.staff;

public class Department extends Staff {
	private String fullDepName; // полное наименование
	private String depName; // краткое наименование
	private Person depBoss; // руководитель
	private String depPhone; // контактный номер
	
	public String getFullDepName() {
		return fullDepName;
	}
	public void setFullDepName(String fullDepName) {
		this.fullDepName = fullDepName;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public Person getDepBoss() {
		return depBoss;
	}
	public void setDepBoss(Person depBoss) {
		this.depBoss = depBoss;
	}
	public String getDepPhone() {
		return depPhone;
	}
	public void setDepPhone(String depPhone) {
		this.depPhone = depPhone;
	}
	
}
