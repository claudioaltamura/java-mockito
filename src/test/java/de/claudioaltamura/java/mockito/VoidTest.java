package de.claudioaltamura.java.mockito;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
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

  @Test
  void testDoThrow() {
    doThrow(NullPointerException.class).when(car).hoot();

    assertThrows(NullPointerException.class, car::hoot);
  }

  @Test
  void testAnsweringACallToVoid() {
    doAnswer(invocation -> {
        String model = invocation.getArgument(0);
        assertTrue(model.length()>3);
        return null;
    }).when(car).setModel(anyString());
    car.setModel("NewModel");
  }

}
