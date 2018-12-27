package cn.ding.hu.wechatmenu;

import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import cn.ding.hu.wechatmenulib.PopupMenu;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Point point = new Point();

    public boolean dispatchTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            point.x = (int) event.getRawX();
            point.y = (int) event.getRawY();
        }
        return super.dispatchTouchEvent(event);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.popmenu);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu floatMenu = new PopupMenu(MainActivity.this);
                floatMenu.items("菜单1", "菜单2");
                floatMenu.show(point);
                floatMenu.setOnItemClickListener(new PopupMenu.OnItemClickListener() {
                    @Override
                    public void onClick(View v, int position) {
                        switch (position) {
                            case 0:
                                Toast.makeText(MainActivity.this,"菜单1 click..",Toast.LENGTH_LONG).show();
                                break;
                            case 1:
                                Toast.makeText(MainActivity.this,"菜单2 click..",Toast.LENGTH_LONG).show();
                                break;
                        }
                    }
                });
            }
        });
    }
}
