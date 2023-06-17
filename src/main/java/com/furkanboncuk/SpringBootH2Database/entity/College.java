package com.furkanboncuk.SpringBootH2Database.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="college")
public class College {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long collegeId;
    @JsonProperty
    @Column
    private String collegeName;
    @JsonProperty
    @Column
    private String collegeAddress;
    @JsonProperty
    @Column
    private String collegeGrade;




}
