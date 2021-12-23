import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class NoteKeeperTest {
    private NoteKeeper noteKeeper;
    @BeforeAll
    public static void addNotes(){
        NoteKeeper noteKeeper= new NoteKeeper();
        noteKeeper.setMyNote("Science Class");
        noteKeeper.setMyNote("Science Homework");
        noteKeeper.setMyNote("Maths Class");
        noteKeeper.setMyNote("Homework");
        noteKeeper.setMyNote("Assignment");
    }
    @BeforeEach
    public void setUp(){
        noteKeeper= new NoteKeeper();
    }
    @DisplayName("Add items to my To-Do list")
    @Test
    public void addToToDoList() {
        ArrayList<String> answer = noteKeeper.getMyNote();
        ArrayList<String> expectedAnswer = new ArrayList(List.of("Science Class", "Science Homework", "Maths Class", "Assignment", "Homework"));
        assertEquals(answer, expectedAnswer);
    }

    @DisplayName("Remove items from my To-Do list")
    @Test
    public void removeFromToDoList() {
        ArrayList<String> answer = noteKeeper.removeFromMyNote("Homework");
        ArrayList<String> expectedAnswer = new ArrayList(List.of("Science Class", "Science Homework", "Maths Class", "Assignment"));
        assertEquals(expectedAnswer, answer);
    }

    @DisplayName("Unremove items from my To-Do List")
    @Test
    public void unremoveFromToDoList() {
        ArrayList<String> answer = noteKeeper.unremoveFromMyNote();
        ArrayList<String> expectedAnswer = new ArrayList(List.of("Science Class", "Science Homework", "Maths Class", "Assignment", "Homework"));
        assertEquals(answer, expectedAnswer);
    }

    @DisplayName("Toggle between completed and not completed.")
    @Test
    public void toggleCompletedAndNotCompleted() {
        noteKeeper.setStatus("Maths Class");
        ArrayList<String> answer = noteKeeper.getStatus();
        ArrayList<String> expectedAnswer = new ArrayList<>(List.of("Science Class-NotCompleted", "Science Homework-NotCompleted","Maths Class-Completed","Assignment-NotCompleted"));
        assertEquals(expectedAnswer, answer);
    }
}
