import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_4_5 {

      @Test
      public void test() {
         Double expected=-1.25;
         Double actual=MyEquation.solve(4,5);

         Assertions.assertEquals(expected,actual,0.001,"4 *x+5=0 egyneletet nem jol oldotta meg");
      }
   }
