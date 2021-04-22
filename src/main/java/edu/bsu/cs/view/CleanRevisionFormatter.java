package edu.bsu.cs.view;

import edu.bsu.cs.model.Formatter;
import edu.bsu.cs.model.Revision;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public final class CleanRevisionFormatter implements Formatter {

    @Override
    public String format(Revision revision) {
        // format: [username] made a change [date] [time of day]
        return String.format("%s made a change %s",
                revision.name,
                DateTimeFormatter
                        .ofPattern("uuuu-MM-dd hh:mm:ss a")
                        .withLocale(Locale.getDefault())
                        .withZone(ZoneId.systemDefault())
                        .format(revision.timestamp));
    }

}
