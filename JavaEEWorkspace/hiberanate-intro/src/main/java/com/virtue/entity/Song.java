package com.virtue.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "songs")			
public class Song {
	@Id
	@Column(name = "song_id", length = 3)
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	
	@Column(name = "song_name", length = 20)
	private String songName;
	
	@Column(name = "artist_name", length = 20)
	private String artist;
	
	public Song() {
		/* default constructor */
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	@Override
	public String toString() {
		return "Song [id=" + id + ", songName=" + songName + ", artist=" + artist + "]";
	}
}
