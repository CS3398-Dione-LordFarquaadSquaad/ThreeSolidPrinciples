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
  @DisplayName("setName Test")
  public void newtestRAWorkerPass() {
    w.setName("Trevor");
    assertEquals(w.getName(),"Trevor","Mismatch between given name to set and actually set name");
  }
  
  // Failing test (will cause a build fail)
  @Test
  @DisplayName("null Worker Test")
  public void newtestRAWorkerFail() {
    assertNull(w, "Should be a null Worker object, but not");
  }
}
