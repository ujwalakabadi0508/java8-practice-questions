package org.example.functionalinterface;

@FunctionalInterface
public interface FuncInterface {

    String getName(String name);

}

@FunctionalInterface
interface FuncInterface1 extends FuncInterface{

        String getName(String oders);

}

