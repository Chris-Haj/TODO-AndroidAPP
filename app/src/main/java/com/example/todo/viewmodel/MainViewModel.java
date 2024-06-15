package com.example.todo.viewmodel;

import androidx.lifecycle.ViewModel;
import com.example.todo.data.model.Reminder;
import com.example.todo.data.repository.ReminderRepository;
import java.util.List;

public class MainViewModel extends ViewModel {
    private ReminderRepository repository;
    private List<Reminder> reminders;

    public MainViewModel() {
        repository = new ReminderRepository();
        reminders = repository.getReminders();
    }

    public List<Reminder> getReminders() {
        return reminders;
    }

    public void addReminder(Reminder reminder) {
        repository.addReminder(reminder);
    }

    public void updateReminder(Reminder reminder) {
        repository.updateReminder(reminder);
    }

    public void deleteReminder(Reminder reminder) {
        repository.deleteReminder(reminder);
    }
}
