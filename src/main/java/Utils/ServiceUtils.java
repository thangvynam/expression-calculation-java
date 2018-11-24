package Utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author namtv3
 */
public class ServiceUtils {
    public static Map<Boolean, Double>convertStringToDouble(String str){
        Map<Boolean,Double> temp = new HashMap<Boolean, Double>();
        try{
            if(str.contains("x"))
                temp.put(false,0.0);
            double v = Double.parseDouble(str);
            temp.put(true,v);
        }catch (Exception ex){
            temp.put(false,0.0);
        }
        return temp;
    }
    public static String replace(String str){
        str=str.replace("(","");
        str=str.replace(")","");
        return str;
    }
}
