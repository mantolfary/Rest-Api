package co.istad.java.webmvc.exception;

public record FieldResponse(
        String field,
        String message
) {
}
