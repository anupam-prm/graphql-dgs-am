package com.tmobile.graphql.dsg.datafetcher;

import java.util.ArrayList;
import java.util.List;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.tmobile.graphql.dsg.model.Device;
import com.tmobile.graphql.dsg.model.Status;

@DgsComponent
public class DsgDataFetcher {

	private List<Device> allDevices = List.of(new Device("S01", new Status("Status ok"), "Desc1", "Make1", "Note8", "Red", "512GB", "Galaxy"), 
			new Device("S01", new Status("Status ok"), "Desc1", "Make1", "Note8", "Red", "512GB", "Galaxy"), 
			new Device("S01", new Status("Status ok"), "Desc1", "Make1", "Note8", "Red", "512GB", "Galaxy"), 
			new Device("S01", new Status("Status ok"), "Desc1", "Make1", "Note8", "Red", "512GB", "Galaxy"), 
			new Device("S01", new Status("Status ok"), "Desc1", "Make1", "Note8", "Red", "512GB", "Galaxy"), 
			new Device("S01", new Status("Status ok"), "Desc1", "Make1", "Note8", "Red", "512GB", "Galaxy"), 
			new Device("S01", new Status("Status ok"), "Desc1", "Make1", "Note8", "Red", "512GB", "Galaxy"), 
			new Device("S01", new Status("Status ok"), "Desc1", "Make1", "Note8", "Red", "512GB", "Galaxy"),
			new Device("S01", new Status("Status ok"), "Desc1", "Make1", "Note8", "Red", "512GB", "Galaxy"), 
			new Device("S01", new Status("Status ok"), "Desc1", "Make1", "Note8", "Red", "512GB", "Galaxy"));
	
	
	@DgsData(parentType = "Query", field = "getDeviceDetails")
	public List<Device> getDeviceDetails(){
		
		
		
		return allDevices;
		
		
	}
}
