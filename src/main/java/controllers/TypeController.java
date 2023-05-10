package Controllers;

import dto.TypeDto;
import services.TypeService;

public class TypeController {

	private TypeService typeService = new TypeService();

	public void createType(TypeDto typeDto) {
		// verify DTO
		typeService.createType(typeDto);
	}
}
