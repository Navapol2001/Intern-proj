package navapol;

public class CreateFile implements WriteFile{
    @Override
    public  String write() {
        WriteFile.super.write();
        return "CreateFile";
    }
}
