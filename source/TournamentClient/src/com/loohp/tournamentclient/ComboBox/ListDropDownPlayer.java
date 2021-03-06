package com.loohp.tournamentclient.ComboBox;

import java.util.UUID;

public class ListDropDownPlayer {
	
	String name;
	UUID id;
	
	public ListDropDownPlayer(String name, UUID id) {
		this.name = name;
	}

    public UUID getId() {
        return id;
    }
    
    public void setId(UUID id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }

}
