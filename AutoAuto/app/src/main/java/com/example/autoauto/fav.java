package com.example.autoauto;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Bundle;

public class fav extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fav);

        Button addButton = findViewById(R.id.add_payment_button);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAddAddressDialog();
            }
        });
    }

    private void showAddAddressDialog() {
        // Inflate the dialog layout
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_add_address, null);

        // Create the dialog
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
        dialogBuilder.setView(dialogView);

        // Initialize the input fields and button
        EditText titleInput = dialogView.findViewById(R.id.title_input);
        EditText addressInput = dialogView.findViewById(R.id.address_input);
        Button confirmButton = dialogView.findViewById(R.id.confirm_button);

        // Create and show the dialog
        AlertDialog dialog = dialogBuilder.create();
        dialog.show();

        // Set the confirm button action
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = titleInput.getText().toString().trim();
                String address = addressInput.getText().toString().trim();

                if (!title.isEmpty() && !address.isEmpty()) {
                    // Handle adding the new address logic here
                    Toast.makeText(fav.this, "Address added: " + title, Toast.LENGTH_SHORT).show();
                    dialog.dismiss();  // Close the dialog
                } else {
                    Toast.makeText(fav.this, "Please fill in both fields", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}