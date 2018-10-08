package codewars;

public class FileNameExtractor {

    public static String extractFileName(String dirtyFileName) {

        String result = dirtyFileName.replaceFirst("^(.*?)_", "").replaceAll("\\.[^.]*$", "");
        return result;
    }


    public static void main(String[] args) {
        extractFileName("1231231223123131_FILE_NAME.EXTENSION.OTHEREXTENSION");
    }
}
