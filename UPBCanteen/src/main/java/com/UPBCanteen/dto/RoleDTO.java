package com.UPBCanteen.dto;

import com.UPBCanteen.model.ERole;


public class RoleDTO {
    private Integer id;

    private ERole name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ERole getName() {
        return name;
    }

    public void setName(ERole name) {
        this.name = name;
    }
}
