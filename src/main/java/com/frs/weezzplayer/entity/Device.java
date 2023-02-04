package com.frs.weezzplayer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(unique = true)
    private String identifier;

    @ManyToOne
    Campaign campaign;

	public String getIdentifier() {
		return identifier;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	

	
	}

