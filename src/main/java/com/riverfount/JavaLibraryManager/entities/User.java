package com.riverfount.JavaLibraryManager.entities;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.Instant;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tb_user")
@EntityListeners(org.springframework.data.jpa.domain.support.AuditingEntityListener.class)
public class User {
    @Id
    @Column(length = 36, name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @CreatedDate
    private LocalDateTime createdAt;
    @Column(name = "cpf")
    private String CPF;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;
    @Column(name = "phone")
    private String phone;
    @LastModifiedDate
    private Instant updatedAt;
    @Column(name = "activeLoans")
    private Integer activeLoans;
}
