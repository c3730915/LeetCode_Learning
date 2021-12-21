package weee;

import com.github.kokorin.jaffree.LogLevel;
import com.github.kokorin.jaffree.ffmpeg.*;
import com.github.kokorin.jaffree.ffprobe.FFprobe;
import com.github.kokorin.jaffree.ffprobe.FFprobeResult;
import com.github.kokorin.jaffree.ffprobe.Stream;
import com.github.kokorin.jaffree.ffprobe.data.ProbeData;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;

public class downloadVideo {
    @Test
    public void downloadVideo() throws IOException, CsvException {
        List<String[]> r = new LinkedList<>();
        try ( CSVReader reader = new CSVReader( new FileReader("/Users/jayden/Desktop/project/ideaProject/LeetCode_Learning/mavenMoudle/src/main/resources/data.csv") ) ) {
             r = reader.readAll();
        }
        int currentLine =1;
        int startLine = 2498;
        for ( String[] strings : r ) {
            if ( currentLine<startLine )
            {
                currentLine++;
                continue;
            }
            URL website = new URL(strings[1]);
            ReadableByteChannel rbc = Channels.newChannel(website.openStream());
            String fileName = "/Users/jayden/Desktop/project/ideaProject/LeetCode_Learning/mavenMoudle/src/main/resources/videos/"+strings[0]+".mp4";
            FileOutputStream fos = new FileOutputStream(fileName);
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
            System.out.println("saving:"+strings[0]);
            currentLine++;
        }
    }

    @Test
    public void getVideoDuration(){
//        String pathToVideo = "/Users/jayden/Desktop/project/ideaProject/LeetCode_Learning/mavenMoudle/src/main/resources/videos/2499.mp4";
//        FFprobeResult result = FFprobe.atPath()
//                .setShowStreams(true)
//                .setInput(pathToVideo)
//                .execute();
//
//        ProbeData data = result.getData();
//        System.out.println(data);
//        for ( Stream stream : result.getStreams()) {
//            System.out.println("Stream #" + stream.getIndex()
//                    + " type: " + stream.getCodecType()
//                    + " duration: " + stream.getDuration() + " seconds");
//        }

        String pathToVideo = "/Users/jayden/Desktop/project/ideaProject/LeetCode_Learning/mavenMoudle/src/main/resources/videos/";
        for ( int i = 0; i < 100; i++ ) {
            String path = pathToVideo+(String.valueOf( 2497+i ))+".mp4";
            getDurationSpecify(path,2497+i );
        }

    }

    public void getDurationSpecify(String pathToVideo,Integer id){

        final AtomicLong durationMillis = new AtomicLong();

        FFmpegResult ffmpegResult = FFmpeg.atPath()
                .addInput(
                        UrlInput.fromUrl(pathToVideo)
                )
                .addOutput(new NullOutput())
                .setProgressListener(new ProgressListener() {
                    @Override
                    public void onProgress(FFmpegProgress progress) {
                        durationMillis.set(progress.getTimeMillis());
                    }
                })
                .setLogLevel( LogLevel.QUIET )
                .execute();

        System.out.println("Exact duration: " + (int)durationMillis.get()/1000 + " seconds");

    }
}
