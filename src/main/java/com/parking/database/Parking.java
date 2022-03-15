package com.parking.database;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;


@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
public class Parking {
    @Id
    private String address;
    private String name;
    private int slots;
    private int chargers;
    private boolean lpgAllowed;
    private double width;
}
