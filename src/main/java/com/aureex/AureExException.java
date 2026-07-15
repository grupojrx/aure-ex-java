package com.aureex;

/** Erro tipado da API AureEX. */
public final class AureExException extends RuntimeException {
    private final String code;
    private final Object details;
    private final int statusCode;

    public AureExException(String message, String code, Object details, int statusCode) {
        super(message);
        this.code = code;
        this.details = details;
        this.statusCode = statusCode;
    }

    public String getCode() {
        return code;
    }

    public Object getDetails() {
        return details;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
