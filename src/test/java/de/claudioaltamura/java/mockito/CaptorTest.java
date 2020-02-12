package de.claudioaltamura.java.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CaptorTest {

  @Mock
  private Car mockedCar;

  @Captor
  private ArgumentCaptor<String> argumentCaptor;

  @Test
  void testSetManuefactor() {
    doNothing().when(mockedCar).setManuefactor(argumentCaptor.capture());

	mockedCar.setManuefactor("Mercedes");

    assertEquals("Mercedes", argumentCaptor.getValue());
	}
}
