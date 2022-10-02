package com.xworkz.daodtocombine.dao;

import com.xworkz.daodtocombine.dto.MovieDTO;
public class MovieDAOImplementor implements MovieDAO {

	
	private MovieDTO [] movies = new MovieDTO[5];
	
	private int index=0;
	
	@Override
	public boolean create(MovieDTO dto) {
        
		this.movies[index]=dto;
		
		System.out.println("Movie is saved as "+ dto+ " into Index "+this.index);
		this.index ++;
		return true;
	}
	
}
