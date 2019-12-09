package de.claudioaltamura.java.mockito;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class VoidTest {

  @Mock
  private Car car;

  @Test
  void simpleVerify() {
    car.hoot();
    verify(car, times(1)).hoot();
  }

  @Test
  void testDoNothing() {
    doNothing().when(car).hoot();
    car.hoot();
    verify(car, times(1)).hoot();
  }

}
