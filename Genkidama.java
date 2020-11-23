import java.util.*;
public class Genkidama{
	public static void main(String[] args){
		int genki = 0;
		while(true){
			System.out.println("地球のみんな、オラに元気を分けてくれ! yes/no> ");
			String judgeG = new Scanner(System.in).nextLine();
			if(judgeG.equals("yes")){
				int index = genkiR(genki);
				genki = genki + index;
			}else if(judgeG.equals("no")){
				System.out.printf("元気%d!フリーザにぶつけますか? yes/no> ",genki);
				String judgeA = new Scanner(System.in).nextLine();
				if(judgeA.equals("yes")){
					if(genki < 80){
						System.out.println("フリーザ「いまのはいたかった...いたかったぞーっ!!!!!!」");
						System.out.println("悟空　敗北");
						break;
					}else{
						System.out.println("フリーザ「こ、ここ...こんな...もの...!!!こんな....」");
						System.out.println("Next Battle!!");
						break;
					}
				}else{
				}
			}
		}
	}
	public static int genkiR(int genki){
		int index = new Random().nextInt(30)+1;
		System.out.printf("元気が%d溜まった!%n",index);
		return index;
	}
}
