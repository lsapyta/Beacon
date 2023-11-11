package pl.lsapyta.beaconapp.modules.receiver;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import pl.lsapyta.beaconapp.databinding.ActivityReceiverBinding;

public class ReceiverActivity extends Activity {

    ActivityReceiverBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityReceiverBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }
}
