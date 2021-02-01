package com.ryanair;

import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.S3Event;
import edu.umd.cs.findbugs.annotations.Nullable;
import io.micronaut.function.aws.runtime.AbstractMicronautLambdaRuntime;

import java.net.MalformedURLException;

public class S3CustomRuntime extends AbstractMicronautLambdaRuntime<S3Event, Void, S3Event, Void> {

    public static void main(String[] args) {
        try {
            new S3CustomRuntime().run(args);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Override
    @Nullable
    protected RequestHandler<S3Event, Void> createRequestHandler(String... args) {
        return new S3EventsHandler();
    }
}
