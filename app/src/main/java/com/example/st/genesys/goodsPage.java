package com.example.st.genesys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class goodsPage extends AppCompatActivity {
   private   Button submitgoods_btn, menu1_btn;
    private  EditText qty_1, qty_2, qty_3,hours;
    private  EditText p1, p2, p3;
    private  TextView tprice, tqty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods_page);


        p1 = (EditText) findViewById(R.id.price1);
        p2 = (EditText) findViewById(R.id.price2);
        p3 = (EditText) findViewById(R.id.price3);
        hours = (EditText) findViewById(R.id.hours_edit);
        submitgoods_btn = (Button) findViewById(R.id.goods_submit);
        tprice = (TextView) findViewById(R.id.total_price);
        qty_1 = (EditText) findViewById(R.id.qty1);
        qty_2 = (EditText) findViewById(R.id.qty2);
        qty_3 = (EditText) findViewById(R.id.qty3);
         tqty = (TextView) findViewById(R.id.total_qty);


   menu1_btn = (Button) findViewById(R.id.menu_btn);

        submitgoods_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int price11 = Integer.parseInt(p1.getText().toString());
                int price22 =  Integer.parseInt(p2.getText().toString());
                int price33 =  Integer.parseInt(p3.getText().toString());
                int qty11 = Integer.parseInt(qty_1.getText().toString());
                int qty22 =Integer.parseInt(qty_2.getText().toString());
                int qty33 = Integer.parseInt(qty_3.getText().toString());
                int hourss = Integer.parseInt((hours.getText().toString()));
                int sum = price11 + price22 + price33;
                int qtysum = qty11 + qty22 + qty33;
                int hors_NO = hourss + 0;

                tprice.setText("TOTAL PRICE =" + String.valueOf(sum));
                tqty.setText("Total Quantity =" + String.valueOf(qtysum));
                hours.setText("Hours Worked for the day =" + String.valueOf(hors_NO));

                Intent intent = new Intent(goodsPage.this, GraphActivity.class);
                intent.putExtra("totalPrice", sum);
                intent.putExtra("totalQuantity", qtysum);
                intent.putExtra("totalHours", hors_NO);

                startActivity(intent);

            }
        });
        menu1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }

}