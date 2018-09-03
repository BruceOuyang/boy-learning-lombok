package club.bugmakers.bruce.lombok;

import lombok.val;

/**
 * @description: Val可以将变量申明是final类型
 * @author: ouyangqiangqiang
 * @date: 2018/8/29 11:55
 */
public class Demo01Val {

    public static void main(String [] args) {
        val a = "A";
    }
}

//    public   static void main(String[] args) {
//
//        val setVar = new HashSet<String>();
//        val listsVar = new   ArrayList<String>();
//        val mapVar = new HashMap<String,   String>();
//
//        //=>上面代码相当于如下：
//        final Set<String> setVar2 = new   HashSet<>();
//        final List<String> listsVar2 = new   ArrayList<>();
//        final Map<String, String> maps2 =   new HashMap<>();
//
//    }
