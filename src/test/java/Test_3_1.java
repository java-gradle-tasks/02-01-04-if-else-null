import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_3_1 {

      @Test
      public void test() {
         Double expected=-0.3333;
         Double actual=MyEquation.solve(3,1);

         Assertions.assertEquals(expected,actual,0.001,"3 *x+1=0 egyneletet nem jol oldotta meg");
      }
   }
