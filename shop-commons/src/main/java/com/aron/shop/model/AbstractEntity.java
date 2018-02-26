package com.aron.shop.model;

import javax.persistence.*;

/**
 * Created by aron.gherasim on 2/26/2018.
 */
@MappedSuperclass
public class AbstractEntity {

    @Id
    @Column(updatable = false, nullable = false)
    private Long id;

    @Version
    @Column(nullable = false)
    private long version = 0L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setVersion(long version) {
        this.version = version;
    }
}
