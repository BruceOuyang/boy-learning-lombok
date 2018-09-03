package club.bugmakers.bruce.lombok;

import lombok.EqualsAndHashCode;

/**
 * @description: @EqualsAndHashCode：为使用该注解的类自动生成equals和hashCode方法
 * @author: ouyangqiangqiang
 * @date: 2018/8/29 15:24
 */
@EqualsAndHashCode(exclude = {"id"}, callSuper = true)
public class Demo06EqualsAndHashCode extends Demo {
    private Integer id;
    private String name;
}

/**
 * 相当于
 */
//class Demo06Compare {
//    private Integer id;
//    private String name;
//    @Override
//    public boolean equals(final Object o) {
//        if (o == this) {
//            return true;
//        }
//        if (o == null) {
//            return false;
//        }
//        if (o.getClass() != this.getClass()) {
//            return false;
//        }
//        if (!super.equals(o)) {
//            return false;
//        }
//        final Demo06Compare other = (Demo06Compare)o;
//        if (this.name == null ? other.name != null : !this.name.equals(other.name)) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        final int PRIME = 31;
//        int result = 1;
//        result = result * PRIME + super.hashCode();
//        result = result * PRIME + (this.name == null ? 0 : this.name.hashCode());
//        return result;
//    }
//}