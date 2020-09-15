package sunyong.hive;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

/**
 * @author sunyong
 * @date 2020/07/12
 * @description
 * 功能:输入xxx 输出:Hello: xxx
 */
public class HelloUDF extends UDF {
    public Text evaluate(Text name){
        return new Text("Hello : "+name);
    }
}
