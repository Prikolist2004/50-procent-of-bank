package com.example.bang;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DialogFragment extends androidx.fragment.app.DialogFragment {
    private EditText username;
    private EditText password;
    private Button login;
    private TextView loginLocked;
    private TextView attempts;
    private TextView numberOfAttempts;

    int numberOfRemainingLoginAttempts = 3;






    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.register_dialog, null);
        final EditText loginEditText = view.findViewById(R.id.login);
        final EditText passwordEditText = view.findViewById(R.id.password);
        builder.setView(view)
                .setTitle("Регистрация")
                .setPositiveButton("Зарегистрироваться", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        String login = loginEditText.getText().toString();
                        String password = passwordEditText.getText().toString();

                        // Проверяем, парает ли введенный логин и пароль
                        if (login.equals("админ") && password.equals("админ")) {
                            // Пароль совпадает с администраторским паролем
                            Toast.makeText(getActivity(), "Регистрация успешна!", Toast.LENGTH_SHORT).show();
                            dismiss();
                            Intent intent = new Intent(getActivity(), log_in.class);
                            startActivity(intent);
                        } else {
                            // Неправильный логин или пароль, выводим сообщение
                            Toast.makeText(getActivity(), "Неправильный логин или пароль. Повторите попытку.", Toast.LENGTH_SHORT).show();
                        }
                    }
                })
                .setNegativeButton("Отмена", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dismiss(); // Закрыть всплывающее окно при нажатии на "Отмена"
                    }
                });
        return builder.create();
    }
}
