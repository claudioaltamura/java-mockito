package de.claudioaltamura.java.mockito;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ExceptionTest {

  @Test()
  void test() {
    Car car = new Car();
    assertThrows(Exception.class, car::boom);
  }

}
