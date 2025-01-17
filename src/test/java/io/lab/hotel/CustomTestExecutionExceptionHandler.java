package io.lab.hotel;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;

public class CustomTestExecutionExceptionHandler implements TestExecutionExceptionHandler {
    @Override
    public void handleTestExecutionException(ExtensionContext context, Throwable throwable) {
        System.out.println("Ignorowanie wyjątku w teście: " + context.getDisplayName());
        System.out.println("Szczegóły wyjątku: " + throwable.getMessage());
    }
}