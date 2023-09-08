package com.example.profiles;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Alien {
@Id
private int id;
private String alienname;
private String alienplanet;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAlienname() {
	return alienname;
}
public void setAlienname(String alienname) {
	this.alienname = alienname;
}
public String getAlienplanet() {
	return alienplanet;
}
public void setAlienplanet(String alienplanet) {
	this.alienplanet = alienplanet;
}
}
