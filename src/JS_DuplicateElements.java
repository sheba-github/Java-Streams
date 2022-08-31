import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

public class JS_DuplicateElements {

	@Test
	public void DuplicateTest() {
		
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set = new HashSet<Integer>();
        myList.stream().filter(n -> !set.add(n))
        .forEach(System.out::println);
	}
	
}
