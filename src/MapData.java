import java.io.File;
import java.util.HashMap;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.ZipFile;

public class MapData {
    final String MAPS = "./Data/MapsInput";
    final String DEST = "./Data/MapsRaw";
    HashMap<String, Map> mapList;

    public MapData(){

    }

    public HashMap<String, Map> unzipMaps(){
        HashMap<String, Map> mapList = new HashMap<String, Map>();
        File dir = new File(MAPS);
        File[] dirList = dir.listFiles();

        if(dirList != null){
            for(File file : dirList){
                try{
                    ZipFile zipFile = new ZipFile(file);
                    zipFile.extractAll(DEST + "/" + file.getName());
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        }



        return mapList;
    }
}
