package com.bootcamp.favoriteservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(value="favorite_service")
public class Favorite {
    @Id
    private String id;
    private String favoriteName;
    private String favoriteType;
    private String serviceCode;
}
