import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class JS_FirstElement {

	@Test
	public void FirstElement() {
		
	      List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
          myList.stream()
          .limit(1)
          .forEach(System.out::println);     ;		
	}
}
