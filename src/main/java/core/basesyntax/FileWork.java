package core.basesyntax;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileWork {
    public String[] readFromFile(String fileName) {
        String[] split = fileName.split("\\W+");
        for (int i = 0; i < split.length; i++) {
            split[i] = split[i].toLowerCase();
        }

        List<String> result = new ArrayList<>();

        for (int i = 0; i < split.length; i++) {
            if (split[i].startsWith("w")) {
                result.add(split[i]);
            }
        }
        Collections.sort(result);
        if (!result.isEmpty()) {
            return result.toArray(new String[0]);
        } else {
            return null;
        }
    }
}
