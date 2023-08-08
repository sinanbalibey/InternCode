package com.apachePdfBox61.pdfToken61.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "documents")
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String documentName;

    private Double documentSize;

    @ManyToOne
    @JoinColumn(name="owner_id")
    private User documentOwner;

    private Long documentWordSize;

}
