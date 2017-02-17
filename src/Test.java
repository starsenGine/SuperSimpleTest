import java.util.HashMap;
import java.util.Map.Entry;

public class Test {
    String s = "天工网定位于我的建设门户、我的工作社区，倾听用户的声音，" +
            "关注用户的需求是天工生存与发展的根基，网上会员大都是通过口碑相传得知天工网，" +
            "并成为天工网的忠实用户";
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args){
        Test test = new Test();
        String s = test.s;
        HashMap<String,Integer> maps = new HashMap<String,Integer>();
        for(int i=0; i<s.length(); i++){
        	String c = s.charAt(i)+"";
        	if(maps.get(c) == null)
        		maps.put(c, 1);
        	else
        		maps.put(c, maps.get(c)+1);
        }
        
        HashMap mapss[] = new HashMap[maps.size()];
        int k=0;
        for(Entry<String, Integer> set:maps.entrySet()){
        	String ss = set.getKey();
        	int num = set.getValue();
        	HashMap m = new HashMap();
        	m.put("str", ss);
        	m.put("num", num);
        	mapss[k++] = m;
        }
        
        for(int i=1; i<mapss.length; i++){
        	HashMap map = mapss[i];
        	int j = i-1;
        	for(; j>=0 && Integer.valueOf(map.get("num").toString()) > Integer.valueOf(mapss[j].get("num").toString()); j--){
        		mapss[j+1] = mapss[j];
        	}
        	mapss[j+1] = map;
        }
        
        for(int i=0; i<mapss.length; i++){
        	System.out.println(mapss[i].get("str") + ":" + mapss[i].get("num"));
        }
    }
    
    
}
