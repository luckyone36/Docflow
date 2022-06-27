package ru.luckyone.entities.staff;

public class Organization extends Staff {
	private String fullOrgName; // полное наименование
	private String orgName; // краткое наименование
	private Person orgBoss; // руководитель
	private String orgPhone; // контактный номер
	
	public String getFullOrgName() {
		return fullOrgName;
	}
	public void setFullOrgName(String fullOrgName) {
		this.fullOrgName = fullOrgName;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public Person getOrgBoss() {
		return orgBoss;
	}
	public void setOrgBoss(Person orgBoss) {
		this.orgBoss = orgBoss;
	}
	public String getOrgPhone() {
		return orgPhone;
	}
	public void setOrgPhone(String orgPhone) {
		this.orgPhone = orgPhone;
	}
	
	
}
