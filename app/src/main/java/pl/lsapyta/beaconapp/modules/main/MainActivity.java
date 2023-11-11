package pl.lsapyta.beaconapp.modules.main;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import pl.lsapyta.beaconapp.R;
import pl.lsapyta.beaconapp.databinding.ActivityMainBinding;
import pl.lsapyta.beaconapp.modules.receiver.ReceiverActivity;
import pl.lsapyta.beaconapp.modules.sender.SenderActivity;

public class MainActivity extends AppCompatActivity {

    Activity mActivity = this;
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        initView();
    }

    private void initView()
    {
        binding.btnSender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mActivity, SenderActivity.class);
                startActivity(intent);
            }
        });

        binding.btnReceiver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(mActivity, ReceiverActivity.class);
                startActivity(intent);

            }
        });
    }


}