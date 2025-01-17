package io.lab.hotel.zad5;

import org.junit.platform.suite.api.*;

@Suite
@SelectPackages("io.lab.hotel.zad5") // Wybierz pakiet, w którym znajdują się testy
@SelectClasses(FasadaTest.class)
public class FasadaTestSuite {
}