package de.claudioaltamura.java.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class WithOutMockitoAnnotationsTest {

  private Car car;

  @BeforeEach
  public void setUp() {
    car = mock(Car.class);
  }

  @Test
  void ifYouDontLikeAnnotations() {
    when(car.getManuefactor()).thenReturn("Mercedes");

    assertEquals("Mercedes", car.getManuefactor());
  }

}
