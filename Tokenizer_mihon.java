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

			System.out.print("���i����" + name + "��");
			System.out.print("���z��"+price +"��");
			System.out.println("�݌ɐ���" + quantity + "�ł�");
	}
	public static void main(String args[]){
		new Tokenizer_mihon();
	}
}