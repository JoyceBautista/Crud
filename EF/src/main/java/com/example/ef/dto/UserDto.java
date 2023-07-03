package com.example.ef.dto;

import com.example.ef.entity.Producto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private int idUser;
    private String name_User;
    private Producto producto;
}
