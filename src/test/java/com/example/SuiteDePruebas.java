package com.example;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({OperacionesMatematicasTest.class, CalculadoraTest.class})
public class SuiteDePruebas {
}