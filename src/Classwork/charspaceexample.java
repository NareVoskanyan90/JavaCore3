package Classwork;

public class charspaceexample {

    public static void main(String[] args) {
        char[] spaceArray = {' ', ' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' ', ' ', ' ',};
        int starIndex = 0;
        int endIndex = spaceArray.length - 1;
        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[starIndex] == ' ') {
                starIndex++;
            } else {
                break;
            }
            {
            }
        }

                    if (spaceArray[endIndex] == ' ') {
                        starIndex--;
                    } else {
                        int newlength = (endIndex - starIndex) + 1;
                        char[]result=new char[newlength];
                        for (int j1 = starIndex; j1 <=endIndex ; j1++) {
                            System.out.print(spaceArray[j1]);
                        }
                    
                    }

                }

                {
                }

            }
