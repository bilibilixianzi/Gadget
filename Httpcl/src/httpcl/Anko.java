package httpcl;

import java.awt.List;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.tools.JavaFileObject;

public class Anko {
	Map<String, String> map = new HashMap<String, String>();
	public void chuli(String city) {
		String url="https://restapi.amap.com/v3/weather/weatherInfo?&key=908b557ef5511ca58f2393bc5ba5bb2a&city="+city+"&extensions=base&output=JSON";
		String jsonStr="{}";
		String text=Httpon.doGet(url,"utf-8");
		String reg="\"?\"";
		String[] lists=text.split(reg);
		int[] num=new int[1000];int j=0;
		for(int i=0;i<lists.length;i++) {
			if(lists[i].contains(":")&&lists[i].length()==1||lists[i].contains("lives")||lists[i].contains(",")||lists[i].contains("[")||lists[i].contains("{")||lists[i].contains("}")||lists[i].contains("]")) {
				lists[i]=null;
			}else {
				num[j++]=i;
			}
		}
		for(int i=0;i<j;i+=2) {
			map.put(lists[num[i]], lists[num[i+1]]);
		}
		/*for (String key : map.keySet()) {
		    System.out.println(key + " £º" + map.get(key));
		}*/
	}
	public String getMap(String ars) {
		return map.get(ars);
	}
}
