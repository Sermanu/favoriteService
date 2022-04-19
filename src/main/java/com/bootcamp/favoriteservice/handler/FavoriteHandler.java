package com.bootcamp.favoriteservice.handler;

import com.bootcamp.favoriteservice.entity.Favorite;
import com.bootcamp.favoriteservice.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class FavoriteHandler {

    @Autowired
    private FavoriteService favoriteService;

    public Mono<ServerResponse> saveFavorite(ServerRequest request) {
        return request.bodyToMono(Favorite.class)
                .flatMap(favorite -> favoriteService.save(favorite))
                .flatMap(favorite -> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(Mono.just(favorite), Favorite.class))
                .switchIfEmpty(ServerResponse.badRequest().build());
    }

}
