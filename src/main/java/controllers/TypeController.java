package controllers;

import dto.TypeDto;
import services.TypeService;

public class TypeController {

	private TypeService service = new TypeService();

	public void createType(TypeDto typeDto) {
		// verify DTO
		service.createType(typeDto);
	}
}
