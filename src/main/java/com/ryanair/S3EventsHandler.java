package com.ryanair;

import com.amazonaws.services.lambda.runtime.events.S3Event;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.function.aws.MicronautRequestHandler;
import lombok.extern.slf4j.Slf4j;

@Introspected
@Slf4j
public class S3EventsHandler extends MicronautRequestHandler<S3Event, Void> {

    @Override
    public Void execute(final S3Event input) {
        log.info(input.toString());
        return null;
    }
}
