import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class JS_PrintingtheNames {
	
	@Test
	public void JSPrintCountOfNames() {
		//Method 1
		ArrayList<String> as=new ArrayList<String>();
		as.add("Sheba");
		as.add("Saravanan");
		as.add("Ridhi");
		as.add("Shanta");
		as.add("Nakshu");
		as.add("Nivu");
		
		Long c = as.stream().filter(p->p.length()>4).count();
        System.out.println(c);
		
      
	}
	@Test
	public void JSPrintNamesThatEndsWitha() {
		
		Stream.of("Sheba","Saravanan","Ridhi","Shanta","Nakshu","Nivu").filter(p->p.endsWith("a")).map(p->p.toUpperCase()).forEach(p->System.out.println(p));
		
	}
	
}
