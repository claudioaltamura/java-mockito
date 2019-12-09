package de.claudioaltamura.java.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SpyTest {

  @Spy
  List<String> list = new ArrayList<>();

  @Test
  void testSpy() {
    list.add("one");
    list.add("two");

    verify(list).add("one");
    verify(list).add("two");

    assertEquals(2, list.size());

    doReturn(100).when(list).size();
    assertEquals(100, list.size());
  }

}
