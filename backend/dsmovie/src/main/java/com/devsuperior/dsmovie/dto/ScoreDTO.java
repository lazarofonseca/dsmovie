package com.devsuperior.dsmovie.dto;

import com.devsuperior.dsmovie.entities.Score;

public class ScoreDTO {

	private Long movieId;
	private String email;
	private Double score;

	public ScoreDTO() {
	}
	
	public ScoreDTO(Score score) {
        this.movieId = score.getId().getMovie().getId();
        this.email = score.getId().getUser().getEmail();
        this.score = score.getValue();
    }


	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getValue() {
		return score;
	}

	public void setValue(Double value) {
		this.score = value;
	}

}
