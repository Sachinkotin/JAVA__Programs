package com.xworkz.daodtocombine.runner;

import com.xworkz.daodtocombine.dao.MovieDAO;
import com.xworkz.daodtocombine.dao.MovieDAOImplementor;
import com.xworkz.daodtocombine.dto.MovieDTO;
public class MovieRunner {

	public static void main(String[] args) {

		MovieDTO dto=new MovieDTO();
		dto.setMovieName("Yajamana");
		dto.setReleaseYear(2000);
		dto.setDirector("R Sheshadri");
		dto.setWrittenBy("Ravi Srivatsa");
		dto.setScreenPlayBy("R Sheshadri");
		String[] producerNames= {"K Mustafa ","Meharunnisa"," Rehman"};
		dto.setProducerNames(producerNames);
		String[] actors= {"Vishnuvardhan","Prema","Shashikumar","Abhijeeth"};
		dto.setActors(actors);
		String[] comedians= {"Sadhu kokila ", " Mukhyamantri Chandru"};
		dto.setComedians(comedians);
		dto.setMovieDuration(2.5);
		dto.setEditedBy("P R Soundar Raj");
		dto.setProductionCompany("Oscar Films");
		dto.setMusicBy("Rajesh Ramanath");
		dto.setLanguage("Kannada");
		dto.setIndustryHit(true);
		dto.setNoOfSongs(5);
		
		MovieDAO dao=new MovieDAOImplementor();
		dao.create(dto);
		
		
		
		
		
		
		
		
		
	}

}
