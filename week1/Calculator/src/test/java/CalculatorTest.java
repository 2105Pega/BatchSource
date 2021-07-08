import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.revature.driver.Calculator;

public class CalculatorTest {
	
	  private Calculator calculator;

	    @BeforeEach                                         
	    public void setUp() throws Exception {
	        calculator = new Calculator();
	    }
	    
	    @Test                                                  
	    public void testMultiply() {
	        assertEquals(20, calculator.multiply(4,5),      
	        "multiplication works fine!");          
	    }
	    
	    @Test                                                  
	    public void testAdd() {
	        assertEquals(10, calculator.add(5,5),      
	        "addition works fine!");          
	    }
	    
	    @Test                                                  
	    public void testDivide() {
	        assertEquals(1, calculator.divide(5,5),      
	        "Division works fine!");          
	    }
	    
	    @Test                                                  
	    public void testSubtraction() {
	        assertEquals(0, calculator.Subtract(5,5),      
	        "Subtraction works fine!");          
	    }
	    
	    @Test                                                  
	    public void testModule() {
	        assertEquals(0, calculator.module(5,5),      
	        "addition works fine!");          
	    }
	    
//	    @Test
//	    public void testDivideByZero() {
//	         Integer resultDiv = calculator.divide(3, 0);
//	        assertThrows(ArithmeticException.class, () -> {
//	            int result = 12 / 0;
//	        });
//	     //   assertEquals("Divide by zero gives infinity as result", true, Double.isInfinite(resultDiv));
//	    }
//                                    
	    @DisplayName("Ensure correct handling of zero")
	    public void testMultiplyWithZero() {
	        assertEquals(0, calculator.multiply(0,5), "Multiple with zero should be zero");
	        assertEquals(0, calculator.multiply(5,0), "Multiple with zero should be zero");
	        assertEquals(5, calculator.divide(5,0), "divide by with zero should be zero");
	    }

}
