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
@Table(name = "tb_publisher")
@EntityListeners(org.springframework.data.jpa.domain.support.AuditingEntityListener.class)
public class Publisher {
    @Id
    @Column(length = 36, name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "cnpj")
    private String cnpj;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;
    @Column(name = "phone")
    private String phone;
    @CreatedDate
    private LocalDateTime createdAt;
    @LastModifiedDate
    private Instant updatedAt;
}
