package com.bridgeit.loginAndRagistation.model;

import javax.persistence.ColumnResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


@Entity(name="Restuser")
public class UserModel {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
	    private int id;
		@NotEmpty
		@Size(min=4,max=8,message="please insert name between {min} and {max}")
		private String fName;
		@NotEmpty
		@Size(min=4,max=8,message="please insert name between {min} and {max}")
		private String lName;
		@Email(message="Please Enter the correct Email")
		private String email;
		@NotEmpty
		@Size(min=4,max=8,message="password between {min} and {max}")
		private String password;
		@Transient
		@NotEmpty
		@Size(min=4,max=8,message="password between {min} and {max}")
		private String conformPsd;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getfName() {
			return fName;
		}
		public void setfName(String fName) {
			this.fName = fName;
		}
		public String getlName() {
			return lName;
		}
		public void setlName(String lName) {
			this.lName = lName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getConformPsd() {
			return conformPsd;
		}
		public void setConformPsd(String conformPsd) {
			this.conformPsd = conformPsd;
		}
		
}
