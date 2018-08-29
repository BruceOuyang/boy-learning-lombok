package club.bugmakers.bruce.lombok;

import lombok.Getter;
import lombok.Setter;

/**
 * @description: @Getter/@Setter：可以针对类的属性字段自动生成Get/Set方法
 * @author: ouyangqiangqiang
 * @date: 2018/8/29 15:14
 */
public class Demo04GetterAndSetter {
    @Getter
    @Setter
    private Integer id;
    @Getter
    @Setter
    private String name;
}

/**
 * 相当于
 */
class Demo04Compare {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
