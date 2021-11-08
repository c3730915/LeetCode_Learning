package test.image;

import org.junit.Test;

import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Iterator;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;

public class CompressJPEGFile {

    @Test
    public void compressImage() throws IOException {

        File imageFile = new File("src/test/image/5515_640.jpeg");
        File compressedImageFile = new File("src/test/image/myimage_compressed.jpg");

        InputStream is = new FileInputStream(imageFile);
        OutputStream os = new FileOutputStream(compressedImageFile);

        float quality = 0.5f;

        // create a BufferedImage as the result of decoding the supplied InputStream
        BufferedImage image = ImageIO.read(is);

        // get all image writers for JPG format
        Iterator<ImageWriter> writers = ImageIO.getImageWritersByFormatName("jpg");

        if (!writers.hasNext())
            throw new IllegalStateException("No writers found");

        ImageWriter writer = (ImageWriter) writers.next();
        ImageOutputStream ios = ImageIO.createImageOutputStream(os);
        writer.setOutput(ios);

        ImageWriteParam param = writer.getDefaultWriteParam();

        // compress to a given quality
        param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
        param.setCompressionQuality(quality);

        // appends a complete image stream containing a single image and
        //associated stream and image metadata and thumbnails to the output
        writer.write(null, new IIOImage(image, null, null), param);

        // close all streams
        is.close();
        os.close();
        ios.close();
        writer.dispose();

    }

}