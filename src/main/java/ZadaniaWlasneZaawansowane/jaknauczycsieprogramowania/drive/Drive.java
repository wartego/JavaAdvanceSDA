package ZadaniaWlasneZaawansowane.jaknauczycsieprogramowania.drive;


import ZadaniaWlasneZaawansowane.jaknauczycsieprogramowania.file.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String name);
}
