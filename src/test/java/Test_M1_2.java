import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_M1_2 {

      @Test
      public void test() {
         Double expected=2.0;
         Double actual=MyEquation.solve(-1,2);

         Assertions.assertEquals(expected,actual,0.1,"-1 *x+2=0 egyneletet nem jol oldotta meg");
      }
   }
