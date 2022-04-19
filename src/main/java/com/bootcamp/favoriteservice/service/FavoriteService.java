package com.bootcamp.favoriteservice.service;

import com.bootcamp.favoriteservice.entity.Favorite;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface FavoriteService {
    Mono<Favorite> save(Favorite request);
}
