package lesson5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* Задание 4
https://leetcode.com/problems/find-duplicate-file-in-system/
 */
public class Task4 {
    public static void main(String[] args) {
        //Test cases
        System.out.println(findDuplicate(new String[]{ "root/a 1.txt(abcd) 2.txt(efgh)",
                "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)" }));
        System.out.println(findDuplicate(new String[]{ "root/a 1.txt(abcd) 2.txt(efgh)",
                "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)" }));
    }

    public static List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < paths.length; i++) {
            String[] files = paths[i].split(" ");
            String dir = files[0];

            for (int j = 1; j < files.length; j++) {
                int index = files[j].indexOf("(");
                String name = files[j].substring(0, index);
                String content = files[j].substring(index + 1, files[j].length() - 1);

                if (!map.containsKey(content)) {
                    map.put(content, new ArrayList<>());
                }

                map.get(content).add(dir + "/" + name);
            }
        }

        List<List<String>> duplicates = new ArrayList<>();
        for (List<String> f : map.values()) {
            if (f.size() > 1) {
                duplicates.add(f);
            }
        }

        return duplicates;
    }
}
