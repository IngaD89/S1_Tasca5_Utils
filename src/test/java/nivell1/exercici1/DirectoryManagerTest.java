package nivell1.exercici1;

import org.example.nivell1.exercici1.DirectoryManager;
import org.example.nivell1.exercici1.EmptyDirectoryException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DirectoryManagerTest {

    private final DirectoryManager DIRECTORY_MANAGER = new DirectoryManager();


    @Test
    public void assertThrowsException() {
        assertThrows(EmptyDirectoryException.class,
                () -> DIRECTORY_MANAGER.readDirectory("src/main/resources/empty_directory"));

    }

    @Test
    public void verifyDirectoryContent() {
        assertAll(() -> {
                    EmptyDirectoryException emptyDirectoryException = assertThrows(EmptyDirectoryException.class,
                            () -> DIRECTORY_MANAGER.readDirectory("src/main/resources/empty_directory"));
                    assertEquals("EXCEPTION: Directory is empty", emptyDirectoryException.getMessage());

                },
                () -> {
                    assertEquals(3, DIRECTORY_MANAGER.readDirectory("src/main/resources/n1_ex1").size());
                });
    }

}
