package assignment5;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestWorker {
  BaseWorker w = new BaseWorker("Bob", 12345);

  @Test
  @DisplayName("Work Method Test")
  public void testWorkMethod()
  {
    assertEquals(w.work(),"I'm working already!","Mismatch between test text and method text");
  }
  
  @Test
  @DisplayName("Name Method Test")
  public void testNameMethod()
  {
    assertEquals(w.getName(), "Bob","Mismatch between name and method name");
  }
}
