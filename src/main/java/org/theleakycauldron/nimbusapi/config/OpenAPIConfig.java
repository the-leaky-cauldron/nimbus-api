package org.theleakycauldron.nimbusapi.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenAPIConfig {

    @Value("${server.port}")
    private String serverPort;

    @Bean
    public OpenAPI myOpenAPI() {
        Server localServer = new Server()
                .url("http://localhost:" + serverPort)
                .description("Local Development Server");

        Contact contact = new Contact()
                .name("The Leaky Cauldron")
                .email("support@theleakycauldron.org");

        License mitLicense = new License()
                .name("MIT License")
                .url("https://opensource.org/licenses/MIT");

        Info info = new Info()
                .title("Nimbus API Gateway Documentation")
                .version("1.0")
                .contact(contact)
                .description("This API exposes endpoints for the Nimbus API Gateway")
                .license(mitLicense);

        return new OpenAPI()
                .info(info)
                .servers(List.of(localServer));
    }
}
