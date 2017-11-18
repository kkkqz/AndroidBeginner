package helloworld.kkkqz.com.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int quantity = 1;
    String submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void more(View view) {
        submit = "Whipped cream aquired";
    }

    public void submitOrder(View view) {
        CheckBox WhipperCreamCheckBox = (CheckBox) findViewById(R.id.whipped_cream_checkbox);
        boolean haswhippedcream = WhipperCreamCheckBox.isChecked();
        int price = quantity * 10;
        if (haswhippedcream == true) {
            submit = "Total price is $" + price;
            submit = submit + "\nWhipped cream aquired";
            submit = submit + "\nQuantity is " + quantity;
            submit = submit + "\nThank you!";
            displaysubmit(submit);
        } else {
            submit = "Total price is $" + price;
            submit = submit + "\nQuantity is " + quantity;
            submit = submit + "\nThank you!";
            displaysubmit(submit);
        }
    }

    private void displayquantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    private void displaysubmit(String string) {
        TextView orderTextView = (TextView) findViewById(R.id.order_text_view);
        orderTextView.setText(string);
    }

    public void add(View view) {
        quantity = quantity + 1;
        displayquantity(quantity);
    }

    public void minus(View view) {
        quantity = quantity - 1;
        displayquantity(quantity);
    }


}
