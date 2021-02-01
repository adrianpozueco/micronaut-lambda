package com.ryanair;


import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.amazonaws.services.lambda.runtime.events.S3Event;
import edu.umd.cs.findbugs.annotations.Nullable;
import io.micronaut.function.aws.runtime.AbstractMicronautLambdaRuntime;

import java.net.MalformedURLException;

public class S3EventsLambdaRuntime extends AbstractMicronautLambdaRuntime<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent, S3Event, Void> {

    public static void main(String[] args) {
        try {
            new S3EventsLambdaRuntime().run(args);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Nullable
    @Override
    protected RequestHandler<S3Event, Void> createRequestHandler(String... args) {
        return new S3EventsHandler();
    }
}
