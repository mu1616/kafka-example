package com.minsu.example.entity;

import com.minsu.example.converter.*;
import com.minsu.example.model.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "lodging")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@EntityListeners({ AuditingEntityListener.class})
@Audited
public class Lodging extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lodging_id")
    private long lodgingId;

    @Column(name = "osp_id")
    private String ospId;

    @Column(name = "gds_id")
    private String gdsId;

    @Embedded
    @Builder.Default
    private Vendor vendor = Vendor.empty();

    @Column(name = "name")
    private String name;

    @Embedded
    @Builder.Default
    private Address address = Address.empty();

    @Embedded
    @Builder.Default
    private ReservationInfo reservationInfo = ReservationInfo.empty();

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "description")
    private String description;

    @Column(name = "star")
    private int star;

    @Column(name = "weight")
    private double weight;

    @Column(name = "biz_reg_code")
    private String bizRegCode;

    @Column(name = "dgm_coupon_applicable")
    private boolean dgmCouponApplicable;

    @Column(name = "price_guarantee")
    private boolean priceGuarantee;

    @Column(name = "give_rentacar_coupon")
    private boolean giveRentacarCoupon;

    @Column(name = "classifications")
    @Convert(converter = ClassificationConverter.class)
    @Builder.Default
    private List<Classification> classifications = new ArrayList<>();

    @Column(name = "properties")
    @Convert(converter = PropertyConverter.class)
    @Builder.Default
    private List<Property> properties = new ArrayList<>();

    @Column(name = "facilities")
    @Convert(converter = FacilityConverter.class)
    @Builder.Default
    private List<Facility> facilities = new ArrayList<>();

    @Column(name = "services")
    @Convert(converter = ServiceConverter.class)
    @Builder.Default
    private List<Service> services = new ArrayList<>();

    @Column(name = "attractions")
    @Convert(converter = AttractionConverter.class)
    @Builder.Default
    private List<Attraction> attractions = new ArrayList<>();

    @Column(name = "main_img_url")
    private String mainImgUrl;

    @Column(name = "status")
    private String status;

    @Column(name = "confirm_type")
    private String confirmType;

    @OneToMany(mappedBy = "lodging")
    @Builder.Default
    private List<LodgingImage> images = new ArrayList<>();

    public void addImage(LodgingImage image) {
        this.images.add(image);
        if (image.getLodging() != this) {
            image.setLodging(this);
        }
    }
}
