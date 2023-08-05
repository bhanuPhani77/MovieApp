package com.movieapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieapp.entities.Theatre;
import com.movieapp.repository.TheatreRepo;
@Service
public class TheatreService {
	@Autowired
	private TheatreRepo theatreRepo;
	public Theatre postThetreDetails(Theatre theatre){
		Theatre saveDetails = theatreRepo.save(theatre);
		return saveDetails;
	}
	public List<Theatre> getAllThetres(){
		List<Theatre> findAll = theatreRepo.findAll();
		return findAll;
	}
	public Theatre getTheatre(Integer id) {
		Theatre theatre = null;
		try {
			theatre = theatreRepo.findById(id).orElseThrow(() -> new Exception("Details not found"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return theatre;
	}
	public String deleteDetailsById(Integer id) {
		theatreRepo.deleteById(id);
		return "detils deleted successfully";
	}
	
}
