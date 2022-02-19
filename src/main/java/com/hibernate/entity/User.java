package com.hibernate.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users",  schema = "public")

public class User {

    @Id
    private String username;
    private String firstname;
    private String lastname;
    @Column(name = "birth_day")
    private LocalDate birthDate;
    private Integer age;
    @Enumerated(EnumType.STRING)
    private Role role;


}
