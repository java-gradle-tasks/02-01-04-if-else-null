import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Null {

      @Test
      public void test() {
         Double actual=MyEquation.solve(0,2);

         Assertions.assertNull(actual,"0 *x+2=0 egyneletet nem jol oldotta meg");
      }
   }
