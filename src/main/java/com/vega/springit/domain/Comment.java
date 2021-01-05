package com.vega.springit.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@NoArgsConstructor
@Data
@Entity
public class Comment extends Auditable {
    @Id
    @GeneratedValue
    private long id;
    private String body;

    @ManyToOne
    private Link link;



}
