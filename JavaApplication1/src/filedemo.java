import java.io.File;
public class filedemo {

    public static void main(String args[]) {
        File fo = new File("classIntro.java");
        sop("-------------------------------------");
        sop("File properties are as follows");
        sop("-------------------------------------");
        sop("File name : " + fo.getName());
        sop("File path: " + fo.getPath());
        sop("Abs path : " + fo.getAbsolutePath());
        sop("Parent : " + fo.getParent());
        sop("File Exists: " + fo.exists());
        sop(fo.canWrite()?"is Writeable" : "is not writeable");
        sop(fo.canRead()?"is Readable" : "is not Readable");
        sop("is" + (fo.isDirectory()?"":" not a directory"));
        sop("It is a normal file"+fo.isFile());
        sop("It is a absolute file"+fo.isAbsolute());
        sop("file last modified" + new java.util.Date(fo.lastModified()));
        sop("file size:"+fo.length()+"bytes");
        
        
    }   
    static void sop(String str)
    {
        System.out.println(str);
    }
}
