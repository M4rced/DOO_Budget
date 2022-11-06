package edu.udo.budget.domain;

import static edu.uco.budget.crosscutting.helper.NumberHelper.isLessThan;
import static edu.uco.budget.crosscutting.helper.NumberHelper.ZERO;
import static edu.uco.budget.crosscutting.helper.UUIDHelper.getDefaultUUID;
import static edu.uco.budget.crosscutting.helper.UUIDHelper.getNewUUID;

import java.util.UUID;

public final class YearDTO {
	
	private UUID id;
	private short yearNumber;
	
	public YearDTO() {
		setId(getNewUUID());
		setYearNumber(ZERO);
	}

	public YearDTO(final UUID id, final short yearNumber) {
		setId(id);
		setYearNumber(yearNumber);
	}
	
	public static final YearDTO create(final UUID id, final short yearNumber) {
		return new YearDTO(id, yearNumber);
	}

	public UUID getId() {
		return id;
	}

	public final void setId(final UUID id) {
		this.id = getDefaultUUID(id);
	}

	public short getYearNumber() {
		return yearNumber;
	}

	public void setYearNumber(short yearNumber) {
	}
}
