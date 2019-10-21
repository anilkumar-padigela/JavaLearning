/**
 * 
 */
package com.learning.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Padigela Anil kumar
 *
 */
public class WithOutOptionalExecutor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Optional<String>> i = new ArrayList<Optional<String>>();
i.add(Optional.ofNullable(null));
System.out.println(i.get(0).toString());

List<String> i1 = new ArrayList<String>();
i1.add(null);
//System.out.println(i1.get(0).toString());

/*List<Optional<Integer>> intList = new ArrayList<Optional<Integer>>();
intList.add(Optional.of(1));
intList.add(Optional.of(2));
intList.add(Optional.of(3));
intList.add(Optional.of(4));
intList.add(Optional.of(null));

Optional<Optional<Integer>> maxValue = intList.stream().max((n1,n2)->Integer.compare(n1.get(), n2.get()));
System.out.println(maxValue);
*/


List<Integer> intList = new ArrayList<Integer>();
//intList.add(1);
//intList.add(1);
//intList.add(1);
intList.add(null);

Optional<Integer> maxValue  =  intList.stream().filter(n->n!=null).max((n1,n2)->Integer.compare(n1, n2));

if(maxValue.isPresent()) {
	System.out.println(maxValue.get());
}else {
	System.out.println("No values");
}


	}

}
