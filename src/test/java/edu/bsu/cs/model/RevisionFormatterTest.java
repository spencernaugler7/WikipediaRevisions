package edu.bsu.cs.model;

import edu.bsu.cs.view.CleanRevisionFormatter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Time;
import java.time.Instant;

public class RevisionFormatterTest {
    Revision testRevison;

    @BeforeEach
    public void setup() {
        testRevison = new Revision.Builder("testRevision")
                .timestamp(Instant.parse("2021-04-22T15:43:13Z"));
    }

    @Test
    public void testRevisionformats() {
        CleanRevisionFormatter formatter = new CleanRevisionFormatter();
        Assertions.assertNotNull(formatter.format(testRevison));
    }

}
