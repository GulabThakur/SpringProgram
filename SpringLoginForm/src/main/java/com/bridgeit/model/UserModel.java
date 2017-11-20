package com.bridgeit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="user")
public class UserModel {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String fName;
		private String lName;
		private String Email;
		private String password;
		@Transient
		private String conformPassword;
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
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getConformPassword() {
			return conformPassword;
		}
		public void setConformPassword(String conformPassword) {
			this.conformPassword = conformPassword;
		}
}
