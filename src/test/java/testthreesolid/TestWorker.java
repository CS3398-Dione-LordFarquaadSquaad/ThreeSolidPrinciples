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
    assertEquals(w.getName(), "Bob","Mismatch between test text and method text");
  }
  
   @Test
  @DisplayName("Eat Method Test")
  public void testEatMethod()
  {
    assertEquals(w.eat(), "I like pickles and ketchup","Mismatch between test text and method text");
  }
  
}
