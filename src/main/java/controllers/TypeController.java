package controllers;

import dto.TypeDto;
import services.TypeService;

import java.sql.SQLException;

public class TypeController {

	private TypeService service = new TypeService();

	public void createType(TypeDto typeDto) {
		// verify DTO
		try {
			service.createType(typeDto);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void updateType(TypeDto typeDto) {
		// verify DTO
		try {
			service.updateType(typeDto);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void deleteType(int typeId) {
		// verify DTO
		try {
			service.deleteType(typeId);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public TypeDto readType(int typeId) {
		// verify DTO
		try {
			return service.readType(typeId);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
