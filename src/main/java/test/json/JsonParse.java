package test.json;


import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.PropertyFilter;

/**
 * 描述：
 *
 * @Auther: qgm
 * @Date: 2018/12/26 13:49
 */
public class JsonParse {
    public static void main(String[] args) {
        deserializeJsonWithoutNull();
    }

    public static void deserializeJsonWithoutNull() {
        C c = new C();
        c.setVal(0);
        c.setIntVal(0);
        c.setS(null);
        JsonConfig config = new JsonConfig();
        config.setJsonPropertyFilter(new PropertyFilter()  {
            @Override
            public boolean apply(Object source, String name, Object value){
                return value== null || value.equals("null");
            }
        });
        JSONObject json = JSONObject.fromObject(c,config);
        System.out.println(json.toString());
    }

}


