package com.frs.weezzplayer.model;

import com.frs.weezzplayer.entity.Campaign;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DeviceUpdate {
    private String identifier;
    private Campaign campaign;
	
	public DeviceUpdate(String identifier, Campaign campaign) {
		super();
		this.identifier = identifier;
		this.campaign = campaign;
	}
	public String getIdentifier() {
		
		return identifier;
	}
	public Campaign getCampaign() {
		return campaign;
	}
	
}
