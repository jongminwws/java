package exam;

import java.util.*;


public class exam1 {
    public static void main(String[] args) {

//        int a = 500;
//        int count = 0;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("입력");
//        System.out.println(a);
//            System.out.println("출력");
//            System.out.print("{");
//            for (int i = 1; i <= a; i++) {
//                if (a % i == 0) {
//                    if (count > 0) {
//                        System.out.print(", ");
//                    }
//                    System.out.print(i);
//                    count++;
//                }
//            }
//            System.out.println("}");
//            System.out.println("약수의 개수는 " + count + "개 입니다.");
//        }
//
//}
//		String[] list1 =new String[10];
//		list1[0] = "java";
//		list1[1] = "jdbc";
//		list1[2] = "jsp";
//		list1[3] = "database";
//		for(int i=0;i<list1.hashCode();i++) {
//			if(list1[i]==null) {
//				break;
//			}
//			System.out.println(list1[i]);
//		}

        //동적배열 array list
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("java");
        list2.add("jdbc");
        list2.add("jsp");
        list2.add("database");

        for(int i=0; i<list2.size();i++) {
            System.out.println(list2.get(i));
        }

        //동적배열(hashmap)
        HashMap<String, Integer> list3 =new HashMap<String, Integer> ();
        list3.put("정자바", 95);
        list3.put("홍길동", 85);
        list3.put("이몽룡", 90);
        list3.put("춘향이", 78);

        Set<String> keyValue = list3.keySet(); //key 값 수집.

       Iterator<String> KeyIterator = keyValue.iterator();

       while (KeyIterator.hasNext()) {
           String key = KeyIterator.next();
           Integer value = list3.get(key);
           System.out.println(key + " : " + value);
       }
    }
}


