package com.ryanair;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class S3EventsHandlerTest {

    private static S3EventsHandler s3EventsHandler;

    @BeforeAll
    public static void setupServer() {
        s3EventsHandler = new S3EventsHandler();
    }

    @AfterAll
    public static void stopServer() {
        if (s3EventsHandler != null) {
            s3EventsHandler.getApplicationContext().close();
        }
    }

    @Test
    public void testHandler() {
//        Book book = new Book();
//        book.setName("Building Microservices");
//        BookSaved bookSaved = s3EventsHandler.execute(book);
//        assertEquals(bookSaved.getName(),book.getName());
//        assertNotNull(bookSaved.getIsbn());
    }
}
