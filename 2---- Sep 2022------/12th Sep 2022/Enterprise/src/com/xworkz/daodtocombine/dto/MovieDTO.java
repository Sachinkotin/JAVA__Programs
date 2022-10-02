package com.xworkz.daodtocombine.dto;

import java.io.Serializable;
import java.util.Arrays;

public class MovieDTO implements Serializable {

	private String movieName;
	private int releaseYear;
	private String director;
	private String writtenBy;
	private String screenPlayBy;
	private String[] producerNames;
	private String[] actors;
	private String[] comedians;
	private double movieDuration;
	private String editedBy;
	private String productionCompany;
	private String musicBy;
	private String language;
	private boolean industryHit;
	private int noOfSongs;

	public MovieDTO() {
		super();
	}

	@Override
	public String toString() {

		return "MovieDTO[MovieName " + movieName + ", ReleaseYear " + releaseYear + ",Director is  " + director
				+ ",WrittenBy " + writtenBy + ",ScreenPlayBy " + screenPlayBy + ",Produced By : "
				+ Arrays.toString(producerNames) + ", Actors " + Arrays.toString(actors) + ", Comedians "
				+ Arrays.toString(comedians) + ", MovieDuration " + movieDuration + " , EditedBy " + editedBy
				+ ", ProductionCompany " + productionCompany + ", MusicBy " + musicBy + ", Language " + language
				+ ", IndustryHit" + industryHit + " , NoOfSongs" + noOfSongs + "]";
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getWrittenBy() {
		return writtenBy;
	}

	public void setWrittenBy(String writtenBy) {
		this.writtenBy = writtenBy;
	}

	public String getScreenPlayBy() {
		return screenPlayBy;
	}

	public void setScreenPlayBy(String screenPlayBy) {
		this.screenPlayBy = screenPlayBy;
	}

	public String[] getProducerNames() {
		return producerNames;
	}

	public void setProducerNames(String[] producerNames) {
		this.producerNames = producerNames;
	}

	public String[] getActors() {
		return actors;
	}

	public void setActors(String[] actors) {
		this.actors = actors;
	}

	public String[] getComedians() {
		return comedians;
	}

	public void setComedians(String[] comedians) {
		this.comedians = comedians;
	}

	public double getMovieDuration() {
		return movieDuration;
	}

	public void setMovieDuration(double movieDuration) {
		this.movieDuration = movieDuration;
	}

	public String getEditedBy() {
		return editedBy;
	}

	public void setEditedBy(String editedBy) {
		this.editedBy = editedBy;
	}

	public String getProductionCompany() {
		return productionCompany;
	}

	public void setProductionCompany(String productionCompany) {
		this.productionCompany = productionCompany;
	}

	public String getMusicBy() {
		return musicBy;
	}

	public void setMusicBy(String musicBy) {
		this.musicBy = musicBy;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public boolean isIndustryHit() {
		return industryHit;
	}

	public void setIndustryHit(boolean industryHit) {
		this.industryHit = industryHit;
	}

	public int getNoOfSongs() {
		return noOfSongs;
	}

	public void setNoOfSongs(int noOfSongs) {
		this.noOfSongs = noOfSongs;
	}
	
	
	
	

}
