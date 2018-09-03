package club.bugmakers.bruce.lombok;

import lombok.*;

/**
 * @description: @NoArgsConstructor, @RequiredArgsConstructor, @AllArgsConstructor,这几个注解分别为类自动生成了无参构造器、指定参数的构造器和包含所有参数的构造器
 * @author: ouyangqiangqiang
 * @date: 2018/8/29 15:40
 */
@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class Demo07ArgsContructor {

    private int x, y;
    @NonNull private String description;

    @NoArgsConstructor
    public static class NoArgsExample {
        @NonNull private String field;
    }

}

//public class Demo07ArgsContructor<T> {
//    private int x, y;
//    @NonNull private String description;
//
//    private Demo07ArgsContructor(String description) {
//        if (description == null) throw new NullPointerException("description");
//        this.description = description;
//    }
//
//    public static <T> Demo07ArgsContructorof(T description) {
//        return new Demo07ArgsContructor(description);
//    }
//
//    @java.beans.ConstructorProperties({"x", "y", "description"})
//    protected Demo07ArgsContructor(int x, int y, String description) {
//        if (description == null) {
//            throw new NullPointerException("description");
//        }
//        this.x = x;
//        this.y = y;
//        this.description = description;
//    }
//
//    public static class NoArgsExample {
//        @NonNull private String field;
//
//        public NoArgsExample() {
//        }
//    }
//}
