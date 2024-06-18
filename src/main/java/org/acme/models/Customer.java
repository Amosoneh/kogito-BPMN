package org.acme.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Builder

@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private String name;
    private String email;
    private String age;
    private String phoneNumber;
}
