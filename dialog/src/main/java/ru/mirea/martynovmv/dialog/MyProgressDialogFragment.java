package ru.mirea.martynovmv.dialog;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;

public class MyProgressDialogFragment extends DialogFragment {
    private ProgressDialog progressDialog;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Создаем диалог
        progressDialog = new ProgressDialog(getActivity());
        progressDialog.setTitle("Загрузка");
        progressDialog.setMessage("Ожидание...");
        // Показывать прогресс
        progressDialog.setIndeterminate(true);
        progressDialog.setButton(Dialog.BUTTON_POSITIVE, "OK", (dialog, which) -> {
            ((MainActivity)getActivity()).onOkClicked();
        });
        return progressDialog;
    }
}
