public class FileDetailsStatVisitor implements FileDetailsVisitor {
    @Override
    public void visit(DirectoryDetails directoryDetails) {

    }

    @Override
    public void visit(DocxFileDetails docxFileDetails) {
        System.out.println("The file " + docxFileDetails.getName() + " has an average of " + docxFileDetails.getWords() / docxFileDetails.getPages() + " words per page.");
    }

    @Override
    public void visit(HtmlFileDetails htmlFileDetails) {
        System.out.println("The file " + htmlFileDetails.getName() + " contains " + htmlFileDetails.getLines() + " lines.");
    }

    @Override
    public void visit(JpgFileDetails jpgFileDetails) {
        int result = jpgFileDetails.getSize() / (jpgFileDetails.getHeight() * jpgFileDetails.getWidth());
       //double round = result % 1;
       //int toPrint = 0;
       //if (round > 0.5) {
       //    toPrint = (int) Math.ceil(jpgFileDetails.getSize() / (jpgFileDetails.getHeight() * jpgFileDetails.getWidth()));
       //}
       //else {
       //    toPrint=(int)result;
       //}
        System.out.println("The picture " + jpgFileDetails.getName() + " has an average of " + result + " bytes per pixel.");
    }

    @Override
    public void visit(Mp3FileDetails mp3FileDetails) {
        System.out.println("The bitrate of " + mp3FileDetails.getName() + " is " + mp3FileDetails.getSize() / mp3FileDetails.getLengthSec() + " bytes per second.");
    }

    @Override
    public void visit(PptxFileDetails pptxFileDetails) {
        System.out.println("The average slide size in Presentation " + pptxFileDetails.getName() + " is " + pptxFileDetails.getSize() / pptxFileDetails.getSlides());
    }

    @Override
    public void visit(TxtFileDetails txtFileDetails) {
        System.out.println("The file " + txtFileDetails.getName() + " contains " + txtFileDetails.getWords() + " words.");
    }
}
