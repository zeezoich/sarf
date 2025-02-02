package sarf.util;

import java.io.*;
import java.nio.charset.Charset;

/**
 * <p>Title: Sarf Program</p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2006</p>
 *
 * <p>Company: ALEXO</p>
 *
 * @author Haytham Mohtasseb Billah
 * @version 1.0
 */
public final class FileUtil {
    private FileUtil() {
    }

    static public String getContents(String relativePath) {
        //...checks on aFile are elided
        StringBuilder contents = new StringBuilder();

        //declared here only to make visible to finally clause
        BufferedReader input = null;
        try {
            //use buffering, reading one line at a time
            //FileReader always assumes default encoding is OK!
            input = new BufferedReader(new InputStreamReader(ClassLoader.getSystemResource(relativePath).openStream(), Charset.availableCharsets().getOrDefault("UTF-8", Charset.defaultCharset())));
            String line; //not declared within while loop
            /*
             * readLine is a bit quirky :
             * it returns the content of a line MINUS the newline.
             * it returns null only for the END of the stream.
             * it returns an empty String if two newlines appear in a row.
             */
            while ((line = input.readLine()) != null) {
                contents.append(line);
                contents.append(System.getProperty("line.separator"));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (input != null) {
                    //flush and close both "input" and its underlying FileReader
                    input.close();
                }
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return contents.toString();
    }

    static public void saveContents(File aFile, String aContents) throws IOException {
        if (aFile == null) {
            throw new IllegalArgumentException("File should not be null.");
        }
        var created = aFile.createNewFile();
        if(!created){
            throw new IOException("could not created the file " + aFile.getAbsolutePath());
        }

        //declared here only to make visible to finally clause; generic reference
        BufferedWriter output = null;
        try {
            //use buffering
            //FileWriter always assumes default encoding is OK!
            output = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(aFile), "cp1256"));

            output.write(aContents);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            //flush and close both "output" and its underlying FileWriter
            if (output != null) {
                output.flush();
                output.close();
            }
        }
    }

    public static InputStream getResourceInputStream(String relativePath) {
        System.err.println("Retrieving " + relativePath + " from resources");
        return ClassLoader.getSystemClassLoader().getResourceAsStream(relativePath);
    }
}
