package httpcl;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LvziCon {
	Map<String, String> map = new HashMap<String, String>();
	String[] str=new String[100];
	public void Getlia(String gequ) {
		String arg=gequ.replaceAll(" ", "+");
		String url="http://www.ytmp3.cn/?search="+arg;
		String str=Httpon.doGet(url, "utf-8");
		String reg="href=\"p/.*?.mp3";
		Pattern pt=Pattern.compile(reg);
		Matcher match=pt.matcher(str);
		while(match.find()) {
			String[] list=match.group().toString().split("\"");
			String a="";
			for(int i=0;i<list[1].length();i++) {
				if(list[1].charAt(i)<='9'&&list[1].charAt(i)>='0')
					a=a+list[1].charAt(i);
			}
			map.put(list[5], a);
		}
		/*for (String key : map.keySet()) {
		    System.out.println(key + " £º" + map.get(key));
		}*/
	}
	public String[] getMap() {
		int i=0;
		for(String key:map.keySet()) {
			str[i++]=key+":"+map.get(key);
		}
		return str;
	}
}
