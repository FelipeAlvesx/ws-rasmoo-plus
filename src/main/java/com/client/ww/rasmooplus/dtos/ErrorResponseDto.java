package com.client.ww.rasmooplus.dtos;

public record ErrorResponseDto(String message) {

    public ErrorResponseDto(Exception ex) {
        this(ex.getMessage());

    }



}
