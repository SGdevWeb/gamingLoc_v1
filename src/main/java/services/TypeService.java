package services;

import dto.TypeDto;
import dao.repositories.*;
import dao.entities.*;

public class TypeService {

	private TypeRepository typeRepository = new TypeRepository();

	public void createType(TypeDto typeDto) {
		Type type = new Type(0,
				typeDto.getType());

		typeRepository.insert(type);
	}
}
