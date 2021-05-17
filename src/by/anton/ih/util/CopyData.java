package by.anton.ih.util;

import by.anton.ih.composite.TextComponentImpl;

public class CopyData {
    public static void copyDataTextComponents(TextComponentImpl from,
                                              TextComponentImpl to, String delimiter) {
        for(int i = 0; i < from.getTextElementSize(); i++) {
            String fromData = from.getTextElement(i);
            if(!fromData.isEmpty()) {
                String [] elements = fromData.split(delimiter);
                for(String element : elements) {
                    to.addTextElement(element.trim());
                }
            }
        }
    }
}
