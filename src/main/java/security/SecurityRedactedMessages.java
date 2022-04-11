package security;

import java.io.*;

import shoppingmall.ShoppingMall;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

//Sending secret messages within shopping mall security
    public class SecurityRedactedMessages {

        public static void redactTextFile(String fileName,
                                          String[] redactedWordsArray) {

            if (!fileName.contains(".txt")) {
                System.out.println("This is not a text file.");
                return;
            }


            try {
                File originalFile = new File (fileName);
                BufferedReader originalFileReader =
                        new BufferedReader(new FileReader(originalFile));

                File redactedFile = new File("redacted-" +
                        fileName);
                BufferedWriter redactedFileWriter = new BufferedWriter(new FileWriter(redactedFile));

                String currentLine = originalFileReader.readLine();

                while(currentLine != null) {
                    for (String redactedWord : redactedWordsArray) {
                        currentLine = StringUtils
                                .replaceIgnoreCase(currentLine,
                                        redactedWord, "REDACTED");
                    }

                    redactedFileWriter.append(currentLine).append("\n");
                    currentLine = originalFileReader.readLine();
                }

                originalFileReader.close();
                redactedFileWriter.close();

            } catch (IOException e) {
                System.out.println("Problem reading or writing to file" + e);
            }
        }

    }
