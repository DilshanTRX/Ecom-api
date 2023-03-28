package com.bootcamp.ecomapi.Ecomapi.entity;

import com.bootcamp.ecomapi.Ecomapi.entity.share.FilesResource;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;

@Entity(name="product_image")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductImages {
    @Id
    @Column(name = "property_id")
    private String property_id;
    @Embedded
    private FilesResource resource;
    @ManyToOne
    private Product product;
}
