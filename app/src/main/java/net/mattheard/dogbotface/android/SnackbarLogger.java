package net.mattheard.dogbotface.android;

import android.support.design.widget.Snackbar;
import android.view.View;

import net.mattheard.dogbotface.core.Logger;

public class SnackbarLogger implements Logger {

    private final View view;

    SnackbarLogger(final View view) {
        this.view = view;
    }

    @Override
    public void logMessage(final String message) {
        getSnackBar(message).show();
    }

    private Snackbar getSnackBar(final String text) {
        final int duration = Snackbar.LENGTH_SHORT;
        return Snackbar.make(view, text, duration);
    }
}
