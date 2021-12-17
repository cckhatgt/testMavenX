package Data;

import java.io.InputStream;

public class ReadFile {

    public ReadFile(){
        return;
    }

    public InputStream readFile(String filename){
        InputStream ioStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream(filename);
        return ioStream;
    }

}
