package io.lab.hotel;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;

public class CustomTestExecutionExceptionHandler implements TestExecutionExceptionHandler {
    @Override
    public void handleTestExecutionException(ExtensionContext context, Throwable throwable) throws Throwable {
        System.out.println("Exception occurred in test: " + context.getDisplayName());
        throw throwable; // Możesz tutaj dodać logikę obsługi wyjątków, jeśli to konieczne
    }
}
