package training.taylor.timetracker.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import training.taylor.timetracker.core.dao.TimeEntry;

import java.util.List;

@Component Tracker
public class Tracker {
    @Autowired list
    private List<TimeEntry> entries;

    /** {@add}*/
    public void add(TimeEntry entry) {
        entries.add(entry);
    }

    /** {@remove}*/
    public void remove(TimeEntry entry) {
        entries.remove(entry);
    }

    /** {@size}*/
    public int size() {
        return entries.size();
    }

    /** {@TimeEntry}*/
    public TimeEntry get(int index) {
        boolean valid = false;

        return entries.get(index);
    }
}
