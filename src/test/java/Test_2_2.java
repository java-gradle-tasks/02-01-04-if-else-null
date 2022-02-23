import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_2_2 {

      @Test
      public void test() {
         Double expected=-1.0;
         Double actual=MyEquation.solve(2,2);

         Assertions.assertEquals(expected,actual,0.1,"2 *x+2=0 egyneletet nem jol oldotta meg");
      }
   }
