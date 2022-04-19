package com.bootcamp.favoriteservice.service.impl;

import com.bootcamp.favoriteservice.entity.Favorite;
import com.bootcamp.favoriteservice.repository.FavoriteRepository;
import com.bootcamp.favoriteservice.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class FavoriteServiceImpl implements FavoriteService {

     @Autowired
     private FavoriteRepository favoriteRepository;

    @Override
    public Mono<Favorite> save(Favorite request) {
        return favoriteRepository.save(request);
    }
}
