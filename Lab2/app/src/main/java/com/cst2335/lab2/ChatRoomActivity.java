package com.cst2335.lab2;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;



public class ChatRoomActivity extends AppCompatActivity {


    Button sendBtn;
    Button recieveBtn;
    EditText editTxt;
    ChatAdapter messageAdapter;
    TextView message;

    ArrayList<String> list = new ArrayList<String>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_room);

        sendBtn = findViewById(R.id.buttonSend);
        recieveBtn = findViewById(R.id.buttonRecieve);
        editTxt = findViewById(R.id.editTextChat);
        ListView listV = findViewById(R.id.listViewChat);

        messageAdapter = new ChatAdapter();
        listV.setAdapter(messageAdapter);
        onClick(); //Send button
        onClick2(); //Recieve button



    }


    public void onClick() {
        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String chatString = editTxt.getText().toString();
                list.add(chatString);
                messageAdapter.notifyDataSetChanged();
                editTxt.setText("");

            }
        });

    }

    public void onClick2() {
        recieveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String chatString = editTxt.getText().toString();
                list.add(chatString);
                messageAdapter.notifyDataSetChanged();
                editTxt.setText("");

            }
        });

    }


    private class ChatAdapter extends BaseAdapter {


        public int getCount() {
            return list.size();
        }

        public Object getItem(int position) {
            return list.get(position);
        }

        public long getItemId(int position) {
            return (long) position;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = ChatRoomActivity.this.getLayoutInflater();
            View result;
            if (position % 2 == 0)
                result = inflater.inflate(R.layout.chat_incoming, null);

            else
                result = inflater.inflate(R.layout.chat_outgoing, null);
            message =  result.findViewById(R.id.messageText);
            message.setText(getItem(position).toString());

            return result;
        }





    }

}