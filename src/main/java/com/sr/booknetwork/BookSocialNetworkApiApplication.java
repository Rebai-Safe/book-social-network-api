package com.sr.booknetwork;

import com.sr.booknetwork.role.Role;
import com.sr.booknetwork.role.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableAsync;


@EnableAsync
@EnableJpaAuditing

@SpringBootApplication
public class BookSocialNetworkApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookSocialNetworkApiApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(RoleRepository roleRepository) {
        return args -> {
            if (roleRepository.findByName("USER").isEmpty()) {
                roleRepository.save(Role.builder()
                        .name("USER")
                        .build()
                );
            }
        };
    }

}
