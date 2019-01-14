package com.example.hcode2.Models;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Preference {
	   @Id @GeneratedValue
	   @Column(name = "id")
		private int id;
	   	@OneToMany
		private User User;
		
		@OneToMany
		private ArrayList<Genre> Genre;
		@OneToMany
		private ArrayList<Type> Type;
		
		
		public Preference(int id, Models.User user, ArrayList<Models.Genre> genre, ArrayList<Models.Type> type) {
			super();
			this.id = id;
			User = user;
			Genre = genre;
			Type = type;
		}
		public User getUser() {
			return User;
		}
		public void setUser(User user) {
			User = user;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public ArrayList<Genre> getGenre() {
			return Genre;
		}
		public void setGenre(ArrayList<Genre> genre) {
			Genre = genre;
		}
		public ArrayList<Type> getType() {
			return Type;
		}
		public void setType(ArrayList<Type> type) {
			Type = type;
		}
		

}
