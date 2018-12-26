package test.base.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 描述：
 *
 * @Auther: qgm
 * @Date: 2018/12/4 18:09
 */
public class TraverseArrayListDelete {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(1000);
        for (int i = 0; i < 1000; i++) {
            list.add(String.valueOf(i));
        }

        //循环遍历删除
//        List<String> list1 = deleteListByItli(list);  // output： [aaa, bbb, ccc]

        //从大到小循环遍历删除
//        List<String> list1 = deleteListByItliDesc(list);  // output： []

        //增强For循环遍历删除
//        List<String> list1 = deleteListByForeach(list); // output: Exception in thread "main" java.util.ConcurrentModificationException

        //iterator遍历删除
        List<String> list1 = deleteListByIterator(list);  // output: []   **推荐**  TODO 有个问题 ArrayList值太大时，会明显减慢速度

        System.out.println(list1);
    }

    /**
     * 循环遍历删除
     *
     * @param list
     * @return
     */
    public static List<String> deleteListByItli(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }

        return list;

    }

    /**
     * 从大到小循环遍历删除
     *
     * @param list
     * @return
     */
    public static List<String> deleteListByItliDesc(List<String> list) {
        for (int i = list.size() - 1; i > -1; i--) {
            list.remove(i);
        }

        return list;

    }

    /**
     * 增强For循环遍历删除
     *
     * @param list
     * @return
     */
    public static List<String> deleteListByForeach(List<String> list) {
        for (String s : list) {
            list.remove(s);
        }
        return list;
    }

    /**
     * 遍历删除
     */
    public static List<String> deleteListByIterator(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }

        return list;
    }



}
