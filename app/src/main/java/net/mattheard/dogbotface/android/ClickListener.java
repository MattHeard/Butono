package net.mattheard.dogbotface.android;

import android.view.View;

import net.mattheard.dogbotface.core.Torso;

class ClickListener implements View.OnClickListener {
    private static final String MESSAGE = "0/DANCU//";
    private final Torso torso;

    ClickListener(final Torso torso) {
        this.torso = torso;
    }

    @Override
    public void onClick(final View v) {
        torso.handleMessage(getMessage());
    }

    private String getMessage() {
        return MESSAGE;
    }
}
