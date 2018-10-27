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
  public void newtest<HN>WorkerPass()
  {
    assertEquals(w.getID(), 12345,"Mismatch between ID and method ID");
  }
  
  @Test
  @DisplayName("ID test")
  public void newtest<HN>WorkerFail()
  {
    assertEquals(w.getID(), "Kendrick Lamar","Mismatch between name and method name");
  }
}
