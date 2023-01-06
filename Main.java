import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		GameFrame frame = new GameFrame();
		ArrayList<String> onlyHereBecauseINeedAnArrayList = new ArrayList<String>();
		onlyHereBecauseINeedAnArrayList.add("test");
		onlyHereBecauseINeedAnArrayList.add("second thing");
		onlyHereBecauseINeedAnArrayList.add("third thing");

		System.out.println(	onlyHereBecauseINeedAnArrayList.indexOf("test"));
		System.out.println(	onlyHereBecauseINeedAnArrayList.indexOf("third thing"));

		onlyHereBecauseINeedAnArrayList.remove(1);
		System.out.println(	onlyHereBecauseINeedAnArrayList.indexOf("third thing"));

		

	}
}