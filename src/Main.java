
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Docs docs = new Docs();
        Contract e;
        Scanner sc = new Scanner(System.in);
        while (true) {
            String temp = sc.nextLine();
            if (temp.equals("0")) {
                break;
            } else {
                System.out.println(temp.contains("\n"));
                e = new Contract(temp);
                docs.list.add(e);
            }
        }
        docs.list.forEach(System.out::println);
        System.currentTimeMillis();



        HashSet<String> doc = new HashSet<>();
        docs.list.forEach(string -> {
            try(Scanner fr = new Scanner(new File(string.getName()))){
                while (fr.hasNextLine()){
                    String test = fr.nextLine();
                    doc.add(test);
                }
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        }
        );

        doc.forEach(System.out::println);
        HashMap<String, String> map = docs.getMap();
        doc.forEach(s -> {
            map.put(s, UUID.randomUUID().toString());
        });



        map.forEach((s, s2) -> {
            System.out.println(s + "     " + s2);
        });

    }
}