package com.ccyw.scrapyweb.handler;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * @author luocong
 * @version 1.0.0
 * @date 2018/6/8 12:42
 */
@Component
public class UserHandler {

    public Mono<ServerResponse> helloUser(ServerRequest request) {
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
                .body(BodyInserters.fromObject("Hello, User!"));
    }
}
