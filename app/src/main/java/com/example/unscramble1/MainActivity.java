package com.example.unscramble1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.content.Context;
import android.os.Bundle;
import com.example.unscramble1.databinding.ActivityMainBinding;
public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    Context context;
    private MainViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context= getApplicationContext();
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        viewModel = new ViewModelProvider(this).get(MainViewModel.class);
        binding.setViewMod(viewModel);
        binding.button.setOnClickListener((v) -> {
            viewModel.check(context,String.valueOf(binding.editTextTextPersonName.getText()));
        });
        binding.setLifecycleOwner(this);
        viewModel.shuf();

    }
}