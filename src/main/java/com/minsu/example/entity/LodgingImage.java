package com.minsu.example.entity;

import lombok.*;
import org.hibernate.envers.Audited;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "lodging_image")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@EntityListeners({AuditingEntityListener.class})
@Audited
public class LodgingImage extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String LodgingImageId;

    @Column(name = "exposure_order")
    private int exposureOrder;

    @Column(name = "url")
    private String url;

    @ManyToOne
    @JoinColumn(name = "lodging_id")
    private Lodging lodging;

    public void setLodging(Lodging lodging) {
        this.lodging = lodging;
        if (!lodging.getImages().contains(this)) {
            lodging.getImages().add(this);
        }
    }
}
