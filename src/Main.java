import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static Map<Integer, String> foodsID = new HashMap<>() {{
		put(0, "りんご");
		put(1, "バナナ");
		put(2, "みかん");
	}};
	
	public static void main(String[] args) {
		System.out.println("①ArrayListを使用して出力");
		List<String> foods = new ArrayList<String>();
			
			foods.add("りんご");
			foods.add("バナナ");
			foods.add("みかん");
			
		System.out.println(foods.get(0));
		System.out.println(foods.get(1));
		System.out.println(foods.get(2));
		System.out.println("");
		
		System.out.println("②MAPを使用して出力");		
		Map<String, String> foodsMap = new HashMap<>();
	    foodsMap.put("りんご", "青森県");
	    foodsMap.put("バナナ", "沖縄県");
	    foodsMap.put("みかん", "和歌山県");
	    
	    System.out.println(foodsMap.get("りんご"));
	    System.out.println(foodsMap.get("バナナ"));
	    System.out.println(foodsMap.get("みかん"));
	    System.out.println("");
	    
	    System.out.println("③例外処理を使用して出力");	
        try {
        	System.out.println(foodsID(4));
        } catch (Exception e) {
        	e.printStackTrace();
        }
	}
	public static String foodsID(int id) throws Exception {
		String foodName = foodsID.get(id);
		
		if (foodName == null) {
			throw new Exception("no food found. id:" + id);
		}
		return foodName;
	}
}
