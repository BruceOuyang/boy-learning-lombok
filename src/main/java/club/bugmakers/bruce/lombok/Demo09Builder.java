package club.bugmakers.bruce.lombok;

import lombok.Builder;
import lombok.Singular;

import java.util.Set;

/**
 * @description: @Builder注解提供了一种比较推崇的构建值对象的方式
 * @author: ouyangqiangqiang
 * @date: 2018/8/31 10:14
 */
@Builder
public class Demo09Builder {
    private String name;
    private int age;

    @Singular private Set<String> occupations;
}

//上面代码相当于如下：

//public class Demo09Builder {
//
//    private String name;
//    private int age;
//    private Set<String> occupations;
//
//    BuilderExample(String name, int age, Set<String> occupations) {
//        this.name = name;
//        this.age = age;
//        this.occupations = occupations;
//    }
//
//    public static Demo09Builder builder() {
//        return new BuilderExampleBuilder();
//    }
//
//    public static class Demo09Builder {
//
//        private String name;
//        private int age;
//        private java.util.ArrayList<String> occupations;
//
//        Demo09Builder() {
//        }
//
//        public Demo09Builder name(String name) {
//            this.name = name;
//            return this;
//        }
//
//        public Demo09Builder age(int age) {
//            this.age = age;
//            return this;
//        }
//
//        public Demo09Builder occupation(String occupation) {
//            if (this.occupations == null) {
//                this.occupations = new java.util.ArrayList<String>();
//            }
//            this.occupations.add(occupation);
//            return this;
//        }
//
//        public Demo09Builder occupations(Collection<? extends String> occupations) {
//            if (this.occupations == null) {
//                this.occupations = new java.util.ArrayList<String>();
//            }
//            this.occupations.addAll(occupations);
//            return this;
//        }
//
//        public Demo09Builder clearOccupations() {
//            if (this.occupations != null) {
//                this.occupations.clear();
//            }
//            return this;
//        }
//
//        public Demo09Builder build() {
//            Set<String> occupations = new HashSet<>();
//            return new BuilderExample(name, age, occupations);
//        }
//
//        @verride
//        public String toString() {
//            return "BuilderExample.BuilderExampleBuilder(name = " + this.name + ", age = " + this.age + ", occupations = " + this.occupations + ")";
//        }
//    }
//}