import java.sql.SQLOutput;
import java.util.Scanner;
public class Flames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("NUMBER OF LETTERS IN NAME 1 ( without space ) : ");
        int length1 = input.nextInt();
        System.out.println("Name 1 ( example : s h a f e e q ) :");
        char[] name1 = new char[length1];
        for(int i=0 ; i<length1 ; i++){
            name1[i]=input.next().charAt(0);
        }
        System.out.print("NUMBER OF LETTERS IN NAME 2 ( without space ) : ");
        int length2 = input.nextInt();
        System.out.println("Name 2 ( example : s h a f e e q ) :");
        char[] name2 = new char[length2];
        for(int i=0 ; i<length2 ; i++){
            name2[i]=input.next().charAt(0);
        }

        String[] flames={"friends" , "lover" , "affection" , "marriage" , "enemy" , "sister"};
        int flamesTarget=name1.length+name2.length;
        for(int i=0 ;i<name1.length ; i++){
            for (int j = 0; j < name2.length; j++) {
                if(name1[i]==name2[j]){
                    name1[i]='0';
                    name2[j]='0';
                    flamesTarget -=2;
                    break;
                }
            }
        }
        int[] flamesIndex=new int[6];
        int index=0;
        int count=1;
        int end=0;
        int ans=0;
        while(end<flamesIndex.length){
            if(index==flamesIndex.length)index=0;
            if(flamesIndex[index]==1){
                index++;
            }
            else{
                if(count==flamesTarget){
                    flamesIndex[index]=1;
                    count=0;
                    ans=index;
                    end++;

                }
                index++;
                count++;
            }
        }




        System.out.println(flames[ans]);
    }

}
