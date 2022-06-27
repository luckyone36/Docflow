package ru.luckyone.entities.documents;

import com.google.gson.annotations.SerializedName;

public class Incoming extends Document {
	
	@SerializedName("отправитель")
	private String sender; // Отправитель
	@SerializedName("адресат")
    private String addressee; // Адресат
	@SerializedName("исходящий номер")
    private String outgoingNumber; // Исходящий номер
	@SerializedName("исходящая дата регистрации")
    private String outgoingRegDate; // Исходящая дата регистрации
    
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getAddressee() {
		return addressee;
	}
	public void setAddressee(String addressee) {
		this.addressee = addressee;
	}
	public String getOutgoingNumber() {
		return outgoingNumber;
	}
	public void setOutgoingNumber(String outgoingNumber) {
		this.outgoingNumber = outgoingNumber;
	}
	public String getOutgoingRegDate() {
		return outgoingRegDate;
	}
	public void setOutgoingRegDate(String outgoingRegDate) {
		this.outgoingRegDate = outgoingRegDate;
	}
	@Override
	public String toString() {
		return "Входящий документ "
				+ " №" + getRegNum()
				+ " от " + getRegDate()
				+ ", название:" + getName() 
				+ ", идентификатор:" + getUuid()
				+ ", текст:" + getText() 
				
				+ ", отправитель:" + sender 
				+ ", адресат:" + addressee 
				+ ", исходящий номер:" + outgoingNumber
				+ ", исходящая дата регистрации:" + outgoingRegDate;
	}
	@Override
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
