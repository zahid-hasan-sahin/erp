package com.brainstation23.erp.config;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;

public class AuditorAwareImpl implements AuditorAware<String>{

        @Override
    public Optional<String> getCurrentAuditor() {

        return Optional.of("Zahid Hasan");
    }

}