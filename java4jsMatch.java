
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;  
  
public class java4jsMatch {  
    public static void main(String[] args) {  
    	String rStr = "(\\d{4})\\/(\\d{2})\\/(\\d{2})"; // 你的正则表达式  
        String str = "2024-11-13"; // 你要匹配的字符串  

        jsMatch(str,rStr);
    }  
    
	public static String[] jsMatch(String input, String regex) {
        List<String> strList = new ArrayList<String>();
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        while (m.find()) {
            for (int i = 0; i <= m.groupCount(); i++) {

                strList.add(m.group(i));
            }
        }
        String[] strArr = new String[strList.size()];
        int i = 0;
        for (String str : strList) {
        	strArr[i] = str;
            i++;
        }
        return strArr;
      
  }
}