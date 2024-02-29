package es.iessoterohernandez.daw.endes.TestsBoletinJUnit;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ TestBoa.class, TestFridge.class, TestOperadorAritmetico.class, TestPila.class,
		TestSubscripcion.class })

public class AllTests {

}
