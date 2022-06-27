package ru.luckyone.entities.documents;

import com.google.gson.annotations.SerializedName;

public class Outgoing extends Document {
	@SerializedName("адресат")
	private String addressee; // Адресат
	@SerializedName("способ доставки")
    private String deliverMethod; // Способ доставки
    
	public String getAddressee() {
		return addressee;
	}
	public void setAddressee(String addressee) {
		this.addressee = addressee;
	}
	public String getDeliverMethod() {
		return deliverMethod;
	}
	public void setDeliverMethod(String deliverMethod) {
		this.deliverMethod = deliverMethod;
	}
	@Override
	public String toString() {
		return "Исходящий документ "
				+ " №" + getRegNum()
				+ " от " + getRegDate()
				+ ", название:" + getName() 
				+ ", идентификатор:" + getUuid()
				+ ", текст:" + getText() 
				
				+ ", адресат:" + addressee 
				+ ", способ доставки:" + deliverMethod;
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
