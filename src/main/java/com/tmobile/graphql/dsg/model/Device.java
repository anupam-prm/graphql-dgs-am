package com.tmobile.graphql.dsg.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Device {

	String serialNumber;
	Status  status;
	String  description ; 
	String  make ; 
	String model ; 
	String  color ;
	String capacity ; 
	String  category ;
}
