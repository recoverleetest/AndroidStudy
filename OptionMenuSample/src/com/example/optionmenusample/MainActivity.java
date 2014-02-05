package com.example.optionmenusample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Toast;

// refer to http://tigerwoods.tistory.com/24

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // getMenuInflater().inflate(R.menu.main, menu);

        menu.add(0, R.id.action_settings1, Menu.NONE, R.string.action_settings1);
        menu.add(0, R.id.action_settings2, Menu.NONE, R.string.action_settings2);
        menu.add(0, R.id.action_settings3, Menu.NONE, R.string.action_settings3);

        SubMenu subMenu = menu.addSubMenu(0, R.id.action_sub_settings, Menu.NONE, R.string.action_sub_settings);

        subMenu.add(1, R.id.action_sub_item1, Menu.NONE, R.string.action_sub_string1);
        subMenu.add(1, R.id.action_sub_item1, Menu.NONE, R.string.action_sub_string2);
        subMenu.add(1, R.id.action_sub_item1, Menu.NONE, R.string.action_sub_string3);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub

        String msg = "group id : " + item.getGroupId() + "\n";
        msg += "item id : " + item.getItemId() + "\n";
        msg += "order : " + item.getOrder();

        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();

        switch (item.getItemId()) {

        case R.id.action_settings1:
            Toast.makeText(getApplicationContext(), "1", Toast.LENGTH_SHORT).show();
            break;
        case R.id.action_settings2:
            Toast.makeText(getApplicationContext(), "2", Toast.LENGTH_SHORT).show();
            break;
        case R.id.action_settings3:
            Toast.makeText(getApplicationContext(), "3", Toast.LENGTH_SHORT).show();
            break;
        case R.id.action_sub_item1:
            Toast.makeText(getApplicationContext(), "sub 1", Toast.LENGTH_SHORT).show();
            break;
        case R.id.action_sub_item2:
            Toast.makeText(getApplicationContext(), "sub 2", Toast.LENGTH_SHORT).show();
            break;
        case R.id.action_sub_item3:
            Toast.makeText(getApplicationContext(), "sub 3", Toast.LENGTH_SHORT).show();
            break;
        default:
            break;

        }
        return super.onOptionsItemSelected(item);
    }
}
