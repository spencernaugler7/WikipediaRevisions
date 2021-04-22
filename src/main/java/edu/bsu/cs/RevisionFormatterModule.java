package edu.bsu.cs;

import com.google.inject.AbstractModule;
import com.google.inject.Module;
import edu.bsu.cs.model.Formatter;
import edu.bsu.cs.view.CleanRevisionFormatter;

public class RevisionFormatterModule extends AbstractModule {
    @Override
    protected void configure(){
        bind(Formatter.class).to(CleanRevisionFormatter.class);
    }
}
