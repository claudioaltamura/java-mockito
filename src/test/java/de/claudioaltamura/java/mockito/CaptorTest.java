package de.claudioaltamura.java.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
public class CaptorTest {

  @Mock
  private Car mockedCar;

  @Captor
  private ArgumentCaptor<String> argumentCaptor;
  
  @Test
  public void testSetManuefactor() {
    mockedCar.setManuefactor("Mercedes");

    verify(mockedCar).setManuefactor(argumentCaptor.capture());

    assertEquals("Mercedes", argumentCaptor.getValue());
  }
}
