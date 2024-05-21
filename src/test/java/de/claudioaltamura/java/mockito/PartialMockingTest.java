package de.claudioaltamura.java.mockito;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class PartialMockingTest {

  @Mock private Car car;

  @Test
  void testPartialMocked() {
    doCallRealMethod().when(car).getModel();

    assertNull(car.getModel());

    verify(car, times(1)).getModel();
  }
}
