import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class ReverseSentence {
	public static void main(String args[]) {
		String punctuations = ";:.,!?\"";
		if(args!=null && !(args.length>0)){
		 	System.out.println("You need to provide a string"); System.exit(1);
		 }
		List<String> listString = Arrays.asList(((String)args[0]).split("(?<=,)|(?<=;)|(?<=:)|(?<=\")|(?<=\\.)|(?<=!)|(?<=\\?)|(?<= )|(?=,)|(?=;)|(?=:)|(?=\")|(?=\\.)|(?=!)|(?=\\?)|(?= )"));
		{
			Integer last = listString.size() - 1;
			Integer i = 0;
			while(i <= last){
				while((punctuations.contains(listString.get(i)))){
					i++;
				}
				while(punctuations.contains(listString.get(last))){
					last--;
				}
				String tmp = listString.get(i);
				listString.set(i++, listString.get(last));
				listString.set(last--, tmp);
			}
		}
		printString(listString);
	}

	protected static void printString(List<String> listString){
		listString.forEach(v -> {
			System.out.print(v);
		});
		System.out.println();
	}
}
