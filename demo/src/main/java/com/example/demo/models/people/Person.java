package com.example.demo.models.people;


import com.example.demo.models.BaseEntity;
import com.example.demo.models.auxilarytypes.Address;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.PreUpdate;
import java.util.Date;

@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
public class Person extends BaseEntity {


    @Column(name = "first_name")
    private  String firstName;
    @Column(name = "last_name")
    private  String lastName;
    @Column(name = "birth_date")
    private  Date birthDate;
    @OneToOne
    private Address address;


}
