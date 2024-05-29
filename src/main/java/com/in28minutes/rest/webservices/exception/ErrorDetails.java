package com.in28minutes.rest.webservices.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ErrorDetails {
    private LocalDate timestamp;
    private String message;
    private String details;
}
