package com.codegym;

public class IllegalTriangleException extends Exception{
    public IllegalTriangleException() {
        super("Exception: Không phải 3 cạnh của 1 tam giác");
    }
}
