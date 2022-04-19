package com.bootcamp.favoriteservice.route;

import com.bootcamp.favoriteservice.handler.FavoriteHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class RouterConfiguration {

    @Bean
    public RouterFunction<ServerResponse> favoriteRoute (FavoriteHandler favoriteHandler) {
        return RouterFunctions.nest(RequestPredicates.path("/favoriteService"),
                RouterFunctions
                        .route(RequestPredicates.POST(""), favoriteHandler::saveFavorite)
                );
    }
}
