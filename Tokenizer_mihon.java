import java.util.*;
	class Tokenizer_mihon{
		StringTokenizer st;
		String name;
		int price;
		int quantity;

		Tokenizer_mihon(){
			String line = "apple,100,10";

			st = new StringTokenizer(line,",");

			name = st.nextToken();
			price = Integer.parseInt( st.nextToken());
			quantity = Integer.parseInt( st.nextToken());

			System.out.print("商品名は" + name + "で");
			System.out.print("金額は"+price +"で");
			System.out.println("在庫数は" + quantity + "個です");
	}
	public static void main(String args[]){
		new Tokenizer_mihon();
	}
}