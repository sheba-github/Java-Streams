import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class JS_NumbersStartingWith1 {

	@Test
	public void NumbersStartingWith1() {	
	
		            List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
		            myList.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println);
	}
}
