package Classwork.group1.Lesson2;

public class CharArrayExample {

    public static void main(String[] args) {

        char c = 'o';
        int ch = 0;
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e',};
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'o') {
                ch++;
            }
        }
        System.out.println(ch);

    }

}