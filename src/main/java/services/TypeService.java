package services;

import dto.TypeDto;
import dao.repositories.*;
import dao.entities.*;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TypeService {

	private TypeRepository typeRepository = new TypeRepository();

	public void createType(TypeDto typeDto) throws SQLException {
		Type type = new Type(typeDto.getName());

		typeRepository.create(type);
	}

	public void updateType(TypeDto typeDto) throws SQLException {
		Type type = new Type(typeDto.getId(), typeDto.getName());

		typeRepository.update(type);
	}

	public void deleteType(int typeId) throws SQLException {
		Type type = new Type(typeId);

		typeRepository.delete(type);
	}

	public TypeDto readType(int typeId) throws SQLException {
		Type type = new Type(typeId);
		ResultSet resultSet = typeRepository.read(type);
		resultSet.next();
		return new TypeDto(resultSet.getString("name"), resultSet.getInt("type_id"));
	}
}
