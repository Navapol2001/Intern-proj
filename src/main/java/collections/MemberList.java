package collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MemberList extends Family{
    private static LinkedList<Family> famLists;
    private MemberList() {
        famLists = new LinkedList<>();
    }

    public void addMember(Scanner scanner) {
        System.out.print("Enter the family member's name and age: ");
        String name1 = scanner.next();
        int age2 = scanner.nextInt();
        Family fam = new Family(name1, age2);
        famLists.add(fam);
    }
//    public void sortByAge() {
//        Collections.sort(famLists, new Family());
//        for (Family mem : famLists) {
//            System.out.print("{ ");
//            System.out.print(mem.getName() + ":" + mem.getAge());
//            System.out.print(" }");
//        }
//    }

    public static void main(String[] args) {
        MemberList memberList = new MemberList();
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many family members do you have?");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            memberList.addMember(scanner);
        }
        System.out.println("Your family members are: ");
        famLists.sort(new Family());
        System.out.println(famLists);
        scanner.close();
    }
}

