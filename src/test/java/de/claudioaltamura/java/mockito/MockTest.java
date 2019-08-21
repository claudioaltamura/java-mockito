package de.claudioaltamura.java.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class MockTest {

  @Mock
  private List<String> mockedList;

  @Test
  void testMockedList() {
    mockedList.add("a");

    verify(mockedList).add("a");

    assertEquals(0, mockedList.size());
  }

}
