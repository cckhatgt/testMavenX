package Data;

import java.io.InputStream;

public class ReadFile {

    public ReadFile(){
    }

    public InputStream readFile(String filename){
        return this.getClass().getClassLoader().getResourceAsStream(filename);
    }

}
