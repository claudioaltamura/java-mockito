package de.claudioaltamura.java.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class InjectMockTest {

  @Mock
  private Map<String, String> sounds;

  @InjectMocks
  private Car car;

  @Test
  void test() {
    when(sounds.get("One")).thenReturn("Vroom");

    assertEquals("Vroom", car.getSounds().get("One"));
  }

}
