package de.claudioaltamura.java.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class PartialMockingTest {

  @Mock
  private Car car;

  @Test
  void testPartialMocked() {
    doCallRealMethod().when(car).getModel();

    assertNull(car.getModel());

    verify(car, times(1)).getModel();

  }

}
