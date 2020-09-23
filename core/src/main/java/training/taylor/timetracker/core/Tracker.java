package training.taylor.timetracker.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import training.taylor.timetracker.core.dao.TimeEntry;

import java.util.List;

/**
 * Created by Jason on 6/19/2015.
 */
@Component
public class Tracker {
    /** *list */
    @Autowired
    private List<TimeEntry> entries;

    /** *add */
    public void add(final TimeEntry entry) {
        entries.add(entry);
    }

    /** *remove */
    public void remove(final TimeEntry entry) {
        entries.remove(entry);
    }

    /** *size */
    public int size() {
        return entries.size();
    }

    /** *get */
    public TimeEntry get(final int index) {
        boolean valid = false;

        return entries.get(index);
    }
}
