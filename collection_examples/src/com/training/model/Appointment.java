package com.training.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Appointment {

	 int id;
	 LocalDate date;
	 
	 Map<Doctor,List<Patient>> appointments;
}

