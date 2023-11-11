package pl.lsapyta.beaconapp.modules.sender;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import pl.lsapyta.beaconapp.databinding.ActivitySenderBinding;

public class SenderActivity extends Activity {

    ActivitySenderBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySenderBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }
}
