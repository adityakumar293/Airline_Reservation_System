package com.example.demo.dto;


import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Aircraft;
import com.example.demo.entity.Airlines;
import com.example.demo.entity.Airport;
import com.example.demo.entity.UserRole;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class FlightDTO 
{

	private Long airline;
	
	private Long aircraftId;

	private Long origineAirport;
	
	private Long destinationAirport;
	
	private boolean isDirect; // make it defalut as true

	private LocalDate duration;

	private float distance;

}
