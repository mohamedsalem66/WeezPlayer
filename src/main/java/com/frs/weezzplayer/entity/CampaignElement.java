package com.frs.weezzplayer.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CampaignElement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String uri;

    private Boolean isArchived;
    @CreationTimestamp
    private Instant createdAt;
    @UpdateTimestamp
    private Instant updatedAt;


    @ManyToOne
    @JsonBackReference
    private Campaign campaign;


	public CampaignElement(Long id, String uri, Boolean isArchived, Instant createdAt, Instant updatedAt,
			Campaign campaign) {
		super();
		this.id = id;
		this.uri = uri;
		this.isArchived = isArchived;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.campaign = campaign;
	}
    
    
}
