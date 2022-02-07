package com.movieticketbookingmodel;

import java.io.Serializable;

public class Movie implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String moviename;
	private int movieid;
	private String movietype;
	private int movieratings;
	private int movieduration;
	private String director;
	private String musicdirector;
	private String heroname;
	private String images;
	private String movielink;

	public Movie(String moviename, int movieid, String movietype, int movieduration, String director,
			String musicdirector, String heroname, String images) {
		super();
		this.moviename = moviename;
		this.movieid = movieid;
		this.movietype = movietype;
		this.movieduration = movieduration;
		this.director = director;
		this.musicdirector = musicdirector;
		this.heroname = heroname;
		this.images = images;

	}

	public String getMovielink() {
		return movielink;
	}

	public void setMovielink(String movielink) {
		this.movielink = movielink;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public int getMovieid() {
		return movieid;
	}

	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}

	public String getMovietype() {
		return movietype;
	}

	public void setMovietype(String movietype) {
		this.movietype = movietype;
	}

	public int getMovieratings() {
		return movieratings;
	}

	public void setMovieratings(int movieratings) {
		this.movieratings = movieratings;
	}

	public int getMovieduration() {
		return movieduration;
	}

	public void setMovieduration(int movieduration) {
		this.movieduration = movieduration;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getMusicdirector() {
		return musicdirector;
	}

	public void setMusicdirector(String musicdirector) {
		this.musicdirector = musicdirector;
	}

	public String getHeroname() {
		return heroname;
	}

	public void setHeroname(String heroname) {
		this.heroname = heroname;
	}

	public Movie(String moviename, int movieid, String movietype, int movieratings, int movieduration, String director,
			String musicdirector, String heroname, String images, String movielink) {
		super();
		this.moviename = moviename;
		this.movieid = movieid;
		this.movietype = movietype;
		this.movieratings = movieratings;
		this.movieduration = movieduration;
		this.director = director;
		this.musicdirector = musicdirector;
		this.heroname = heroname;
		this.images = images;
		this.movielink = movielink;
	}

	public Movie(String movietype, int movieid) {
		this.movietype = movietype;
		this.movieid = movieid;
	}

	public Movie(int movieid1) {
		this.movieid = movieid1;
	}

	public Movie(int id1, String name) {
		this.movieid = id1;
		this.moviename = name;
	}

	public Movie(String moviename, int movieid, String movietype, int movieratings, int movieduration, String director2,
			String musicdirector, String heroname, String images2) {

		this.moviename = moviename;
		this.movieid = movieid;
		this.movietype = movietype;
		this.movieratings = movieratings;
		this.movieduration = movieduration;
		this.director = director2;
		this.musicdirector = musicdirector;
		this.heroname = heroname;
		this.images = images2;
	}

	public Movie(String moviename, String movietype, int movieduration, int movieid) {

		this.moviename = moviename;
		this.movietype = movietype;
		this.movieduration = movieduration;
		this.movieid = movieid;
	}

	@Override
	public String toString() {
		return "Movie \nMoviename=" + moviename + "\n Movieid=" + movieid + "\n Movietype=" + movietype
				+ "\n movieratings=" + movieratings + "\n movieduration=" + movieduration + "\n director=" + director
				+ "\n musicdirector=" + musicdirector + "\n heroname=" + heroname + "]";
	}

}
