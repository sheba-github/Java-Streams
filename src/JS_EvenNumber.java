import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;
public class JS_EvenNumber {
	@Test
	public void EvenNumbTest() {				
				            List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
				            myList.stream()
				                  .filter(s -> (s%2==0))
				                  .forEach(s->System.out.println(s));
				    }
				
		
		
	}

