package ru.luckyone.entities.staff;

import java.util.UUID;

public abstract class Staff {
	private UUID uuidStaf; // идентификатор 

	public UUID getUuidStaf() {
		return uuidStaf;
	}

	public void setUuidStaf() {
		UUID uuidStaf = UUID.randomUUID();
		this.uuidStaf = uuidStaf;
	}

}
