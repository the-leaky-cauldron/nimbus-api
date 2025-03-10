package org.theleakycauldron.nimbusapi.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@Tag(name = "Gateway API", description = "Gateway API endpoints")
public class GatewayController {

    @GetMapping("/")
    @Operation(summary = "Gateway root endpoint", description = "Returns a welcome message from the API Gateway")
    public Mono<String> index() {
        return Mono.just("Welcome to Nimbus API Gateway");
    }
}
