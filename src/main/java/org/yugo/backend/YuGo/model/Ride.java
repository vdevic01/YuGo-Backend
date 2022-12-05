package org.yugo.backend.YuGo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.yugo.backend.YuGo.dto.LocationInOut;
import org.yugo.backend.YuGo.dto.RideIn;
import org.yugo.backend.YuGo.dto.UserSimplifiedOut;
import org.yugo.backend.YuGo.mapper.LocationMapper;
import org.yugo.backend.YuGo.mapper.UserSimplifiedMapper;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@Table(name = "Rides")
public class Ride {
    @Getter @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Getter @Setter
    @Column(name = "start_time")
    private LocalDateTime startTime;

    @Getter @Setter
    @Column(name = "end_time")
    private LocalDateTime endTime;

    @Getter @Setter
    @Column(name = "price", nullable = false)
    private double price;

    @Getter @Setter
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "driver_id")
    private Driver driver;

    @Getter @Setter
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH})
    @JoinTable(name = "passenger_ride", joinColumns = @JoinColumn(name = "ride_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "passenger_id", referencedColumnName = "id"))
    private Set<Passenger> passengers = new HashSet<Passenger>();

    @Getter @Setter
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
    private Set<Location> paths;

    @Getter @Setter
    @Column(name = "estimated_time")
    private int estimatedTime;

    @Getter @Setter
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH,mappedBy = "ride")
    private Set<RideReview> rideReviews = new HashSet<RideReview>();

    @Getter @Setter
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH,mappedBy = "ride")
    private Set<VehicleReview> vehicleReviews = new HashSet<VehicleReview>();

    @Enumerated(EnumType.STRING)
    @Getter @Setter
    @Column(name = "status")
    private RideStatus status;

    @Getter @Setter
    @JoinColumn(name = "rejection_id")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
    private Rejection rejection;

    @Getter @Setter
    @Column(name = "is_panic_pressed")
    private Boolean isPanicPressed;

    @Getter @Setter
    @Column(name = "includes_babies")
    private Boolean includesBabies;

    @Getter @Setter
    @Column(name = "includes_pets")
    private Boolean includesPets;

    @Getter @Setter
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "vehicle_type_id")
    private VehicleCategoryPrice vehicleCategoryPrice;

    public Ride(RideIn ride){
        Set<Location> locations= (Set<Location>) ride.getLocations().stream().map(LocationMapper::fromDTOtoLocation).toList();
        this.startTime = LocalDateTime.now();
        this.endTime = LocalDateTime.now();
        this.price = 1000;
        this.driver = new Driver();
        this.passengers = (Set<Passenger>) ride.getPassengers().stream().map(UserSimplifiedMapper::fromDTOtoUser);
        this.estimatedTime = 2;
        this.vehicleCategoryPrice =new VehicleCategoryPrice(VehicleCategory.STANDARD,100);
        this.includesBabies = ride.isBabyTransport();
        this.includesPets = ride.isPetTransport();
        this.paths = locations;
        this.status = RideStatus.PENDING;

    }

}
