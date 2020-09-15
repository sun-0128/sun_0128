package sunyong.hive;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

/**
 * @author sunyong
 * @date 2020/07/13
 * @description
 */
public class StrToLower extends UDF {
    public Text evaluate(final Text s){
        if(s==null){
            return null;
        }
        return new Text(s.toString().toUpperCase());
    }
}
