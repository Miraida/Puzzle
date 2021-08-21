package com.geek.puzzle;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> texts;
    TextView timer;
    ImageView image;
    CountDownTimer countDownTimer;
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        mixList();
        setText();
        setupListeners();
        setTimer();
    }

    private void setTimer() {
        countDownTimer =  new CountDownTimer(60000, 1000) {
            public void onTick(long millisUntilFinished) {
                timer.setText(String.valueOf(millisUntilFinished / 1000));

            }

            public void onFinish() {
                timer.setText("Ну ты и лох!");
                loadImage("https://www.icegif.com/wp-content/uploads/naruto-vs-sasuke-icegif-2.gif");
            }
        }.start();
    }

    private void setupListeners() {
        button1.setOnClickListener(v -> {
            if (!button1.getText().equals(" ")) {
                if (button2.getText().equals(" ")) {
                    button2.setText(button1.getText());
                    button1.setText(" ");
                }
                if (button4.getText().equals(" ")) {
                    button4.setText(button1.getText());
                    button1.setText(" ");
                }
            }
            checkResult();
        });
        button2.setOnClickListener(v -> {
            if (!button2.getText().equals(" ")) {
                if (button1.getText().equals(" ")) {
                    button1.setText(button2.getText());
                    button2.setText(" ");
                }
                if (button3.getText().equals(" ")) {
                    button3.setText(button2.getText());
                    button2.setText(" ");
                }
                if (button5.getText().equals(" ")) {
                    button5.setText(button2.getText());
                    button2.setText(" ");
                }
            }
            checkResult();
        });
        button3.setOnClickListener(v -> {
            if (!button3.getText().equals(" ")) {
                if (button2.getText().equals(" ")) {
                    button2.setText(button3.getText());
                    button3.setText(" ");
                }
                if (button6.getText().equals(" ")) {
                    button6.setText(button3.getText());
                    button3.setText(" ");
                }
            }
            checkResult();
        });
        button4.setOnClickListener(v -> {
            if (!button4.getText().equals(" ")) {
                if (button1.getText().equals(" ")) {
                    button1.setText(button4.getText());
                    button4.setText(" ");
                }
                if (button5.getText().equals(" ")) {
                    button5.setText(button4.getText());
                    button4.setText(" ");
                }
                if (button7.getText().equals(" ")) {
                    button7.setText(button4.getText());
                    button4.setText(" ");
                }
            }
            checkResult();
        });
        button5.setOnClickListener(v -> {
            if (!button5.getText().equals(" ")) {
                if (button4.getText().equals(" ")) {
                    button4.setText(button5.getText());
                    button5.setText(" ");
                }
                if (button2.getText().equals(" ")) {
                    button2.setText(button5.getText());
                    button5.setText(" ");
                }
                if (button6.getText().equals(" ")) {
                    button6.setText(button5.getText());
                    button5.setText(" ");
                }
                if (button8.getText().equals(" ")) {
                    button8.setText(button5.getText());
                    button5.setText(" ");
                }
            }
            checkResult();
        });
        button6.setOnClickListener(v -> {

            if (!button6.getText().equals(" ")) {
                if (button3.getText().equals(" ")) {
                    button3.setText(button6.getText());
                    button6.setText(" ");
                }
                if (button5.getText().equals(" ")) {
                    button5.setText(button6.getText());
                    button6.setText(" ");
                }
                if (button9.getText().equals(" ")) {
                    button9.setText(button6.getText());
                    button6.setText(" ");
                }
            }
            checkResult();
        });
        button7.setOnClickListener(v -> {
            if (!button7.getText().equals(" ")) {
                if (button4.getText().equals(" ")) {
                    button4.setText(button7.getText());
                    button7.setText(" ");
                }
                if (button8.getText().equals(" ")) {
                    button8.setText(button7.getText());
                    button7.setText(" ");
                }
            }
            checkResult();
        });
        button8.setOnClickListener(v -> {
            if (!button8.getText().equals(" ")) {
                if (button7.getText().equals(" ")) {
                    button7.setText(button8.getText());
                    button8.setText(" ");
                }
                if (button5.getText().equals(" ")) {
                    button5.setText(button8.getText());
                    button8.setText(" ");
                }
                if (button9.getText().equals(" ")) {
                    button9.setText(button8.getText());
                    button8.setText(" ");
                }
            }
            checkResult();
        });
        button9.setOnClickListener(v -> {
            if (!button9.getText().equals(" ")) {
                if (button8.getText().equals(" ")) {
                    button8.setText(button9.getText());
                    button9.setText(" ");
                }
                if (button6.getText().equals(" ")) {
                    button6.setText(button9.getText());
                    button9.setText(" ");
                }
            }
            checkResult();
        });

    }

    private void checkResult() {
        if (button1.getText().equals("1") &&
                button2.getText().equals("2") &&
                button3.getText().equals("3") &&
                button4.getText().equals("4") &&
                button5.getText().equals("5") &&
                button6.getText().equals("6") &&
                button7.getText().equals("7") &&
                button8.getText().equals("8") &&
                button9.getText().equals(" ")) {
         timer.setText("Молодец!");
         cancelM();
         loadImage("https://www.icegif.com/wp-content/uploads/naruto-icegif-34.gif");
        }
    }

    private void loadImage(String url) {
        image.setVisibility(View.VISIBLE);
        findViewById(R.id.layout).setVisibility(View.GONE);
        Glide.with(this).load(url).into(image);
    }

    private void initViews() {
        texts = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", " ");

        timer = findViewById(R.id.tv_timer);
       image= findViewById(R.id.imageView);
        button1 = findViewById(R.id.btn_1);
        button2 = findViewById(R.id.btn_2);
        button3 = findViewById(R.id.btn_3);
        button4 = findViewById(R.id.btn_4);
        button5 = findViewById(R.id.btn_5);
        button6 = findViewById(R.id.btn_6);
        button7 = findViewById(R.id.btn_7);
        button8 = findViewById(R.id.btn_8);
        button9 = findViewById(R.id.btn_9);
    }

    private void setText() {
        button1.setText(texts.get(0));
        button2.setText(texts.get(1));
        button3.setText(texts.get(2));
        button4.setText(texts.get(3));
        button5.setText(texts.get(4));
        button6.setText(texts.get(5));
        button7.setText(texts.get(6));
        button8.setText(texts.get(7));
        button9.setText(texts.get(8));
    }

    private void mixList() {
        Collections.shuffle(texts);
    }
private void cancelM(){
   countDownTimer.cancel();
}
}