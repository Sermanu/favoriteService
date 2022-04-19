package com.bootcamp.favoriteservice.repository;

import com.bootcamp.favoriteservice.entity.Favorite;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface FavoriteRepository extends ReactiveMongoRepository<Favorite, String> {
}
