package com.example.demo.entity;

import java.sql.Time;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Flights")
public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FlightId", length = 50)
	private Long flightId;

	@ManyToOne
	@JoinColumn(name = "AirlineId", referencedColumnName = "AirlineId")
	private Airlines airline;

	@ManyToOne
	@JoinColumn(name = "AircraftId", referencedColumnName = "AircraftId")
	private Aircraft aircraftId;
	
	@OneToOne
	@JoinColumn(name = "OringineAirport", referencedColumnName = "AirportId")
	private Airport origineAirport;
	
	@OneToOne
	@JoinColumn(name = "DestinationAirport", referencedColumnName = "AirportId")
	private Airport destinationAirport;
	
	@Column(name = "isDirect")
	private boolean isDirect = true;

	@Column(name = "Duration")
	private Long duration;

	@Column(name = "Distance")
	private float distance;

}
