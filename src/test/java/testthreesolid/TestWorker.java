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
  @DisplayName("R-Arnecke Worker Pass Test")
  public void newtestRAWorkerPass()
  {
  	assertTrue(w.ID == 12345);
  }

  @Test
  @DisplayName("R-Arnecke Worker Fail Test")
  public void newtestRAWorkerFail()
  {
  	BaseWorker x = w;
  	assertNotSame(x, w);
  }
}
