package com.example.demo.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name="dataset")
@NoArgsConstructor
@AllArgsConstructor
public class CRUD {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String Email;
    private String role;
}
