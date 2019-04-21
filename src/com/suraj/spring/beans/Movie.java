package com.suraj.spring.beans;

import java.util.List;

public class Movie {

	private String movieName;
	private Song song;
	private List<String> movieNames;
	
	public Movie(String movieName, Song song, List<String> movieNames) {
		super();
		this.movieName = movieName;
		this.song = song;
		this.movieNames = movieNames;
	}

	public String getMovieName() {
		return movieName;
	}

	public Song getSong() {
		return song;
	}

	public List<String> getMovieNames() {
		return movieNames;
	}
}
