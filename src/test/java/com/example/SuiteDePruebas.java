package com.example;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("Suite de pruebas matemáticas")
@SelectClasses({OperacionesMatematicasTest.class, CalculadoraTest.class})
public class SuiteDePruebas {
}