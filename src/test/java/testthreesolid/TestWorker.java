package assignment5;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestWorker {
  BaseWorker w = new BaseWorker("Bob", 12345);

  // Given test
  @Test
  @DisplayName("Work Method Test")
  public void testWorkMethod() {
    assertEquals(w.work(),"I'm working already!","Mismatch between test text and method text");
  }
  
  // Passing test
  @Test
  @DisplayName("Worker setName Test")
  public void testSetNameMethod() {
    w.setName("Trevor");
    assertEquals(w.getName(), "Trevor");
  }
}
