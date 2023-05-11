package services;

import dto.TypeDto;
import dao.repositories.*;
import dao.entities.*;

import java.sql.SQLException;

public class TypeService {

	private TypeRepository typeRepository = new TypeRepository();

	public void createType(TypeDto typeDto) throws SQLException {
		Type type = new Type(typeDto.getName());

		typeRepository.create(type);
	}
}
