package com.example.trv13.jdbc;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.trv13.entity.Person;

@Repository
public class PersonJdbcDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	//Custom RowMapper
	class PersonRowMapper implements RowMapper<Person>{
		
		@Override
		public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
			Person person = new Person();
			
			person.setId(rs.getInt("id"));
			person.setName(rs.getString("name"));
			person.setDob(rs.getTimestamp("dob"));
			person.setAge(rs.getInt("age"));
			return person;
		}
		
	}
	
	// Find All
	public List<Person> findAll(){
		return jdbcTemplate.query("SELECT * FROM PERSON", 
				new PersonRowMapper());
	}
	
	// Find By ID
	public Person findById(int id){
		return jdbcTemplate.queryForObject(
				"SELECT * FROM PERSON where id=?", 
				new PersonRowMapper(),
				new Object[] {id}
			);
	}
	
	// DELETE /id
	public int deleteById(int id){
		return jdbcTemplate.update("delete from PERSON where id=?", new Object[] {id});
	}
	
	//INSERT 
	public int insert(Person person){
		return jdbcTemplate.update("insert into person (id , name , age , dob) " + 
				"values(?,?,?,?)", 
				new Object[] {
						person.getId(),
						person.getName(),
						person.getAge(),
						new Timestamp(person.getDob().getTime())
				});
	}
	
	//UPDATE
	
	public int update(Person person){
		return jdbcTemplate.update("update person set name=? , age=? , dob=? " + 
				"where id=?", 
				new Object[] {
						person.getName(),
						person.getAge(),
						new Timestamp(person.getDob().getTime()),
						person.getId()
				});
	}	
}
