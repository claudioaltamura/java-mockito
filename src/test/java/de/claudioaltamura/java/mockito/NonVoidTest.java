package de.claudioaltamura.java.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doThrow;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class NonVoidTest {

  @Mock
  private Car car;

  @Test
  void testDoAnwser() {
	  doAnswer(invocation -> {
		  return "Mercedes New";
	  }).when(car).getModel();

	  assertEquals(car.getModel(), "Mercedes New");
  }

  @Test
  void testDoThrow() {
    doThrow(RuntimeException.class).when(car).getModel();

    assertThrows(RuntimeException.class, car::getModel);
  }

}
