import java.util.ArrayList;
import java.util.List;

// TODO: Implement Composite (change this file).
public class DirectoryDetails extends FileDetails {
    private List<FileDetails> childFileDetails;

    public DirectoryDetails(String path, String name) {
        super(path, name);
        this.childFileDetails = new ArrayList<>();
    }

    public void addFile(FileDetails fileDetails) {
        childFileDetails.add(fileDetails);
    }

    //https://www.baeldung.com/java-composite-pattern#:~:text=The%20composite%20pattern%20is%20meant,a%20whole%20hierarchy%20of%20objects.
}