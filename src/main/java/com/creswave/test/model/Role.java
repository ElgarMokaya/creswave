package com.creswave.test.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Role {
    @Id

    private Integer roleId;

	private String roleName;
}
