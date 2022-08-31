import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class JS_Count {
	@Test
	public void CountTest () {
		
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		 Long c=myList.stream().distinct().count();
		 System.out.println(c);
	}

}
