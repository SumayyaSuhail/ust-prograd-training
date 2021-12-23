import java.util.ArrayList;

public class NoteKeeper {
    static ArrayList<MyNote> myNote = new ArrayList<>();
    static ArrayList<MyNote> tempNote = new ArrayList<>();
    ArrayList<String> items=new ArrayList<>();
    public void setMyNote(String value) {
        MyNote note = new MyNote();
        note.item = value;
        note.status="NotCompleted";
        myNote.add(note);
    }
    public ArrayList<String> getMyNote() {
        for (MyNote note : myNote) {
            items.add(note.item);
        }
        return items;
    }
    public ArrayList<String> removeFromMyNote(String item){
        for (int i = 0; i <myNote.size() ; i++) {
            if(myNote.get(i).item.equals(item)){
                tempNote.add(myNote.get(i));
                myNote.remove(myNote.get(i));
            }
        }
        return getMyNote();
    }
    public ArrayList<String> unremoveFromMyNote(){
        myNote.addAll(tempNote);
        return getMyNote();
    }
    public void setStatus(String item1){
        for (MyNote value : myNote) {
            if (value.item.equals(item1)) {
                value.status = "Completed";
            }
        }
    }
    public ArrayList<String> getStatus(){
        ArrayList<String> statusList= new ArrayList<>();
        for (MyNote note : myNote) {
            statusList.add(note.item+"-"+note.status);
        }
        return statusList;
    }
}

class MyNote {
    String item;
    String status;
}
