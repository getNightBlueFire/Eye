import java.util.*;

public class Docs {
    Collection<Contract> list;

    public Docs() {
        this.list = new ArrayList<>();
    }

    public Docs(boolean flag) {
        if (flag){
            this.list = new HashSet<>();
        } else {
            this.list = new LinkedList<>();
        }
    }

    public HashMap<String, String> getMap(){
        return new HashMap<>();
    }


}
