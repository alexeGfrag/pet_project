package com.smart.home.fridgemanager.db;

import com.smart.home.fridgemanager.constants.GoodStatus;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@Table
@RequiredArgsConstructor

public class GoodState extends BaseEntityWithId{

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS")
    private GoodStatus status;

    @Column(name = "STATE_DATE")
    private LocalDateTime stateDate;

    @ManyToOne
    @JoinColumn(name = "GOOD_REF")
    private Good goodRef;

}
