package com.example.todo.data.repository;

import com.example.todo.data.model.Reminder;
import java.util.ArrayList;
import java.util.List;

public class ReminderRepository {
    private List<Reminder> reminders = new ArrayList<>();

    public void addReminder(Reminder reminder) {
        reminders.add(reminder);
    }

    public List<Reminder> getReminders() {
        return reminders;
    }

    public void updateReminder(Reminder reminder) {
        // update logic
    }

    public void deleteReminder(Reminder reminder) {
        reminders.remove(reminder);
    }
}
