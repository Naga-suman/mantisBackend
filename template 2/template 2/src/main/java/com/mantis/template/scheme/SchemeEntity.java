package com.mantis.template.scheme;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "scheme")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SchemeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "scheme_scheme_id_seq")
    @SequenceGenerator(allocationSize = 1,  name = "scheme_scheme_id_seq", sequenceName = "scheme_scheme_id_seq")
    @JsonProperty("id")
    @Column(name = "scheme_id")
    private Long schemeId;

    @Column(name = "financer_id")
    private Long financerId;

    @Column(name = "shcema_name")
    private String schemeName;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "frequancy")
    private String frequancy;

    @Column(name = "one_time_premimum_amt")
    private Double oneTimePremimumAmt;

    @Column(name = "maturity_amt")
    private Double maturityAmt;
}
