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
}
