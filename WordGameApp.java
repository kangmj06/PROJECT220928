import java.util.Scanner;

class Player{ 
	Scanner scanner = new Scanner(System.in);
	public String name, word; 
	public String writeWord() { 
		word = scanner.next(); 
		return word;
}

	public boolean checkSuccess(char lastChar) { 
		if (lastChar == word.charAt(0)) 
			return true;
		else 
			return false;
	}
}

public class WordGameApp() {
	public static void main(String[] args) {
		String word = "아버지"; 
		System.out.println("끝말잇기 게임을 시작합니다...");
		System.out.print("게임에 참여하는 인원 수>> ");
		Scanner scanner = new Scanner(System.in);
		int playernum = scanner.nextInt();
		Player[] play = new Player[playernum];
		for(int i = 0; i<playernum; i++) { 
			System.out.print("참가자의 이름 입력>> ");
			play[i] = new Player();
			play[i].name = scanner.next();
		} 
		System.out.printf("시작하는 단어는 %s입니다.\n", word);
		int i = 0, j = 0;
		while(true) { 
			i = j % playernum; 
			int lastIndex = word.length() -1;
			char lastChar = word.charAt(lastIndex);
			System.out.print(play[i].name + ">> ");
			play[i].writeWord(); 
			boolean counting = play[i].checkSuccess(lastChar);
			if(counting == false) {
				System.out.println(play[i].name + "님이 졌습니다.");
				break;
				}
			word = play[i].word;
			j++;
			}
		scanner.close();
	 }
}