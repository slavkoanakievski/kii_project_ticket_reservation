package com.example.avtobuska_stanica.Model.exceptions;

public class InvalidPatnikEmbgException extends RuntimeException{
    public InvalidPatnikEmbgException(String embg) {
        super(String.format("Patnikot so embg: %s ne e vnesen", embg));
    }
}
