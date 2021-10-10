package utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhy
 * @create 2021-10-04 9:31
 */
public class StringToDateConverter implements Converter<String, Date> {

    @Override
    public Date convert(String s) {
        if (s == null){
            throw new RuntimeException("请输入数据");
        }
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return df.parse(s);
        }catch (Exception e){
            throw new RuntimeException("输入的数据格式有问题");
        }
    }
}
