package com.coforge.traning.mockitodemo;

public class RecordService {

	DataBaseDao database;
	
	NetworkDao network;

	public DataBaseDao getDatabase() {
		return database;
	}

	public void setDatabase(DataBaseDao database) {
		this.database = database;
	}

	public NetworkDao getNetwork() {
		return network;
	}

	public void setNetwork(NetworkDao network) {
		this.network = network;
	}
	
	
	public boolean save(String fileName)
	{
		database.save(fileName);
		System.out.println("Saved in database in Main class");
	
		network.save(fileName);
		System.out.println("Saved in network in Main class");
	
		return true;
	}
	
	
}
