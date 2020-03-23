package com.techelevator.campground.model;

import java.time.LocalDate;
import java.util.List;

public interface SiteDAO {
	public List<Site> getAvailableSites(Campground campgroundChoice, LocalDate arrivalDate, LocalDate departureDate);
}
