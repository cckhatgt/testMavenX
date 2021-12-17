package Launch;

import Data.ReadFile;
import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class MainLaunch {

    public static void main(String[] args) {
        System.out.println("Hello World");

        RangeMap<Integer, String> myMap
                = TreeRangeMap.create();
        myMap.put(Range.closed(0, 2), "Associate");
        myMap.put(Range.closed(3, 5), "Senior Associate");
        myMap.put(Range.closed(6, 8), "Vice President");
        myMap.put(Range.closed(9, 15), "Executive Director");

        for (int index = 0; index < 20; index++) {
            System.out.println(myMap.get(index));
        }

        ReadFile readfile = new ReadFile();
        try {
            InputStream inputStream = readfile.readFile("data.txt");
            InputStreamReader isr = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);
            String str = "";
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*br.lines().forEach(line -> System.out.println(line));*/


        return;
    }

}
