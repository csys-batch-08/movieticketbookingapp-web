package com.pojo;

public class Movie {
	private String Movie_name;
	private int Movie_id;
	private String Movie_type;
	private int movie_ratings;
	private int price;
	private int movie_duration;
	private String director;
	private String music_director;
	private String hero_name;
	public String getMovie_name() {
		return Movie_name;
	}
	public void setMovie_name(String movie_name) {
		Movie_name = movie_name;
	}
	public int getMovie_id() {
		return Movie_id;
	}
	public void setMovie_id(int movie_id) {
		Movie_id = movie_id;
	}
	public String getMovie_type() {
		return Movie_type;
	}
	public void setMovie_type(String movie_type) {
		Movie_type = movie_type;
	}
	public int getMovie_ratings() {
		return movie_ratings;
	}
	public void setMovie_ratings(int movie_ratings) {
		this.movie_ratings = movie_ratings;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getMovie_duration() {
		return movie_duration;
	}
	public void setMovie_duration(int movie_duration) {
		this.movie_duration = movie_duration;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getMusic_director() {
		return music_director;
	}
	public void setMusic_director(String music_director) {
		this.music_director = music_director;
	}
	public String getHero_name() {
		return hero_name;
	}
	public void setHero_name(String hero_name) {
		this.hero_name = hero_name;
	}
	@Override
	public String toString() {
		return "Mvproject [Movie_name=" + Movie_name + ", Movie_id=" + Movie_id + ", Movie_type=" + Movie_type
				+ ", movie_ratings=" + movie_ratings + ", price=" + price + ", movie_duration=" + movie_duration
				+ ", director=" + director + ", music_director=" + music_director + ", hero_name=" + hero_name + "]";
	}
	public Movie(String movie_name, int movie_id, String movie_type, int movie_ratings, int price,
			int movie_duration, String director, String music_director, String hero_name) {
		super();
		Movie_name = movie_name;
		Movie_id = movie_id;
		Movie_type = movie_type;
		this.movie_ratings = movie_ratings;
		this.price = price;
		this.movie_duration = movie_duration;
		this.director = director;
		this.music_director = music_director;
		this.hero_name = hero_name;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}


