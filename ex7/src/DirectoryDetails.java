import java.util.ArrayList;
import java.util.List;

public class DirectoryDetails extends FileDetails {
    private List<FileDetails> childFileDetails;

    public DirectoryDetails(String path, String name) {
        super(path, name);
        this.childFileDetails = new ArrayList<>();
    }

    @Override
    public void accept(FileDetailsVisitor fileDetailsVisitor ) {
        for (FileDetails fileDetails:childFileDetails) {
           fileDetails.accept(fileDetailsVisitor);
        }
        fileDetailsVisitor.visit(this);
    }


    public void addFile(FileDetails fileDetails) {
        childFileDetails.add(fileDetails);
    }
}