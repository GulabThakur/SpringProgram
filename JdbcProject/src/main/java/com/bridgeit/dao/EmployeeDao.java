package com.bridgeit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.bridgeit.model.Employee;


/**
 * @author GulabThakur
 * @all the operation
 */
public class EmployeeDao {
	JdbcTemplate template;  
	  
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  
	public int save(Employee p){  
	    String sql="insert into Employee1(name,salary,designation) values('"+p.getId()+"',"+p.getSalary()+",'"+p.getDesignation()+"')";  
	    return template.update(sql);  
	}  
	public int update(Employee p){  
	    String sql="update Employee1 set name='"+p.getName()+"', salary="+p.getSalary()+",designation='"+p.getDesignation()+"' where id="+p.getId()+"";  
	    return template.update(sql);  
	}  
	public int delete(int id){  
	    String sql="delete from Employee1 where id="+id+"";  
	    return template.update(sql);  
	}  
	public Employee getEmpById(int id){  
	    String sql="select * from Employee1 where id=?";  
	    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Employee>(Employee.class));  
	}  
	public List<Employee> getEmployees(){  
	    return template.query("select * from Employee1",new RowMapper<Employee>(){  
	        public Employee mapRow(ResultSet rs, int row) throws SQLException {  
	            Employee e=new Employee();  
	            e.setId(rs.getInt(1));  
	            e.setName(rs.getString(2));  
	            e.setSalary(rs.getFloat(3));  
	            e.setDesignation(rs.getString(4));  
	            return e;  
	        }  
	    });  
	}  
	}  

