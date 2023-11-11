package pl.lsapyta.beaconapp.modules.sender;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import pl.lsapyta.beaconapp.databinding.ActivitySenderBinding;
import pl.lsapyta.beaconapp.features.firebase.CoreFirebaseMessagingService;
import pl.lsapyta.beaconapp.features.firebase.FirebaseHelper;

public class SenderActivity extends Activity {

    Context mContext = this;
    ActivitySenderBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySenderBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        initView();
    }

    private void initView()
    {
        binding.btnConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseHelper.sendNotification(mContext,"test");
            }
        });
    }
}
