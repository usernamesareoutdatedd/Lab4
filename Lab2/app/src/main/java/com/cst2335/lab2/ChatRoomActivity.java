package com.cst2335.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import android.os.Bundle;

public class ChatRoomActivity extends AppCompatActivity {

    String TAG = "activity_chat_room.xml";
    Button sendBtn;
    Button recieveBtn;
    EditText editTxt;
    ArrayList<String> chat = new ArrayList<String>();
    ChatAdapter messageAdapter;
    TextView message;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_room);

        sendBtn = (Button) findViewById(R.id.buttonSend);
        recieveBtn = (Button) findViewById(R.id.buttonRecieve);
        editTxt = (EditText) findViewById(R.id.editTextChat);
        ListView list = (ListView) findViewById(R.id.listViewChat);

        messageAdapter = new ChatAdapter(this);
        list.setAdapter(messageAdapter);
        onClick(); //Send button
        onClick2(); //Recieve button

    }


    public void onClick() {
        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String chatString = editTxt.getText().toString();
                chat.add(chatString);
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
                chat.add(chatString);
                messageAdapter.notifyDataSetChanged();
                editTxt.setText("");

            }
        });

    }

    private class ChatAdapter extends ArrayAdapter<String> {

        public ChatAdapter(Context ctx) {
            super(ctx, 0);
        }

        public int getCount() {
            return chat.size();
        }

        public String getItem(int position) {
            return chat.get(position);
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = ChatRoomActivity.this.getLayoutInflater();
            View result = null;
            if (position % 2 == 0)
                result = inflater.inflate(R.layout.chat_incoming, null);

            else
                result = inflater.inflate(R.layout.chat_outgoing, null);
            message = (TextView) result.findViewById(R.id.messageText);
            message.setText(getItem(position));

            return result;

        }


    }

}