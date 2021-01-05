package com.vega.springit.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
@Entity
public class Link extends Auditable {
    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String url;

    @OneToMany(mappedBy = "link")
    private List<Comment> comments = new ArrayList<>();

}
