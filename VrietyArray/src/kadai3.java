import java.util.HashMap;
public class kadai3 {
	
	public static void main(String[] args) {
		HashMap<String,Integer>timei = new HashMap<>();
		timei.put("りんご", 130);
		timei.put("メロン", 6000);
		timei.put("みかん",120);
		timei.put("バナナ", 98);
		for(HashMap.Entry<String, Integer> name : timei.entrySet()){
			System.out.println(name.getKey()+":"+name.getValue());
		}
		
	}

}
