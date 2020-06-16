import java.util.*;
class Tokenizer_mihon2{
	StringTokenizer st;
	String name;
	int price;
	int quantity;

	Tokenizer_mihon2(){
		String item[] = new String[3];
		item[0] = "apple,100,10";
		item[1] = "orange,200,20";
		item[2] = "grape,300,30";
		
		for(int i=0; i<item.length; i++){
			st = new StringTokenizer(item[i],",");
			name = st.nextToken();
			price = Integer.parseInt(st.nextToken());
			quantity= Integer.parseInt(st.nextToken());

			System.out.print("¤•i–¼‚Í" + name + "‚Å");
			System.out.print("‹àŠz‚Í"+ price +"‰~‚Å");
			System.out.print("ÝŒÉ”‚Í"+ quantity + "ŒÂ‚Å‚·");
		}
	}
	public static void main(String srgs[]){
		new Tokenizer_mihon();
	}
}