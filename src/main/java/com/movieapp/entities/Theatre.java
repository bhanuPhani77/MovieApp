package com.movieapp.entities;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Theatre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer theatreId;
	@Nonnull
	private String name;
	@Nonnull
	private String location;
	@ManyToMany(mappedBy = "theatres")
	private List<Movie> movies = new ArrayList<Movie>();
}
