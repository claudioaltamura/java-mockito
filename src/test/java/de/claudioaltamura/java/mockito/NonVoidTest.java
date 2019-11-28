package de.claudioaltamura.java.mockito;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doThrow;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class NonVoidTest {

  @Mock
  private Car car;

  @Test()
  void test() {
    doThrow(NullPointerException.class).when(car).hoot();

    assertThrows(NullPointerException.class, car::hoot);
  }

}
