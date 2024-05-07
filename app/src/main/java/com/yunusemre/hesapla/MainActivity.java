package com.yunusemre.hesapla;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


import com.yunusemre.hesapla.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
        private ActivityMainBinding binding;
        //int cursorPos = binding.editTextNumber.getSelectionStart();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.textViewEnd.setVisibility(View.INVISIBLE);
        binding.editTextNumber.setShowSoftInputOnFocus(false);
        binding.editTextNumber2.setShowSoftInputOnFocus(false);

        binding.editTextNumber.setSelection(binding.editTextNumber.getSelectionStart());




    }
        public void btn0(View view){
        if (binding.editTextNumber.hasFocus()){
            binding.editTextNumber.setText(binding.editTextNumber.getText()+"0");

        }else if (binding.editTextNumber2.hasFocus()){
            binding.editTextNumber2.setText(binding.editTextNumber2.getText()+"0");

           }
        }
        public void btn1(View view){
            if (binding.editTextNumber.hasFocus()){
                binding.editTextNumber.setText(binding.editTextNumber.getText()+"1");
            }else if (binding.editTextNumber2.hasFocus()){
                binding.editTextNumber2.setText(binding.editTextNumber2.getText()+"1");
            }
        }
        public void btn2(View view){
            if (binding.editTextNumber.hasFocus()){
                binding.editTextNumber.setText(binding.editTextNumber.getText()+"2");
            }else if (binding.editTextNumber2.hasFocus()){
                binding.editTextNumber2.setText(binding.editTextNumber2.getText()+"2");
            }
        }
    public void btn3(View view){
        if (binding.editTextNumber.hasFocus()){
            binding.editTextNumber.setText(binding.editTextNumber.getText()+"3");
        }else if (binding.editTextNumber2.hasFocus()){
            binding.editTextNumber2.setText(binding.editTextNumber2.getText()+"3");
        }
    }
    public void btn4(View view){
        if (binding.editTextNumber.hasFocus()){
            binding.editTextNumber.setText(binding.editTextNumber.getText()+"4");
        }else if (binding.editTextNumber2.hasFocus()){
            binding.editTextNumber2.setText(binding.editTextNumber2.getText()+"4");
        }
    }
    public void btn5(View view){
        if (binding.editTextNumber.hasFocus()){
            binding.editTextNumber.setText(binding.editTextNumber.getText()+"5");
        }else if (binding.editTextNumber2.hasFocus()){
            binding.editTextNumber2.setText(binding.editTextNumber2.getText()+"5");
        }
    }
    public void btn6(View view){
        if (binding.editTextNumber.hasFocus()){
            binding.editTextNumber.setText(binding.editTextNumber.getText()+"6");
        }else if (binding.editTextNumber2.hasFocus()){
            binding.editTextNumber2.setText(binding.editTextNumber2.getText()+"6");
        }
    }
    public void btn7(View view){
        if (binding.editTextNumber.hasFocus()){
            binding.editTextNumber.setText(binding.editTextNumber.getText()+"7");
        }else if (binding.editTextNumber2.hasFocus()){
            binding.editTextNumber2.setText(binding.editTextNumber2.getText()+"7");
        }
    }
    public void btn8(View view){
        if (binding.editTextNumber.hasFocus()){
            binding.editTextNumber.setText(binding.editTextNumber.getText()+"8");
        }else if (binding.editTextNumber2.hasFocus()){
            binding.editTextNumber2.setText(binding.editTextNumber2.getText()+"8");
        }
    }
    public void btn9(View view){
        if (binding.editTextNumber.hasFocus()){
            binding.editTextNumber.setText(binding.editTextNumber.getText()+"9");
        }else if (binding.editTextNumber2.hasFocus()){
            binding.editTextNumber2.setText(binding.editTextNumber2.getText()+"9");
        }
    }

        public void temizle(View view){
        if (!binding.editTextNumber.getText().toString().isEmpty() || !binding.editTextNumber2.getText().toString().isEmpty()){
            binding.editTextNumber.setText(" ");
            binding.editTextNumber2.setText(" ");
            binding.textViewEkran.setText("Temizlendi!");
            binding.textViewEnd.setVisibility(View.VISIBLE);
        }
        }


      public void btnTopla(View view){
            try {
                if (!binding.editTextNumber.getText().toString().isEmpty() && !binding.editTextNumber2.getText().toString().isEmpty()){
                    double sayı1 = Double.parseDouble(binding.editTextNumber.getText().toString());
                    double sayı2 = Double.parseDouble(binding.editTextNumber2.getText().toString());
                    double sonuc = sayı1 + sayı2;
                    binding.textViewEkran.setText(""+sonuc);
                    binding.textViewEnd.setVisibility(View.VISIBLE);
                } else if (binding.editTextNumber.getText().toString().isEmpty() && binding.editTextNumber2.getText().toString().isEmpty()) {
                    binding.textViewEnd.setVisibility(View.VISIBLE);
                    binding.textViewEkran.setText("İşlem yapmak için sayı giriniz!");
                } else{
                    binding.textViewEkran.setText("Lütfen sayı giriniz!");
                    binding.textViewEnd.setVisibility(View.VISIBLE);
                }
            }catch (Exception e){
                binding.textViewEkran.setText("İşlem yapmak için sayı giriniz!");
            }

      }

      public void btnBol(View view){
          try {
              if (!binding.editTextNumber.getText().toString().isEmpty() && !binding.editTextNumber2.getText().toString().isEmpty()){
                  double sayı1 = Double.parseDouble(binding.editTextNumber.getText().toString());
                  double sayı2 = Double.parseDouble(binding.editTextNumber2.getText().toString());
                  double sonuc = sayı1 / sayı2;
                  binding.textViewEkran.setText(""+sonuc);
                  binding.textViewEnd.setVisibility(View.VISIBLE);
              } else if (binding.editTextNumber.getText().toString().isEmpty() && binding.editTextNumber2.getText().toString().isEmpty()) {
                  binding.textViewEnd.setVisibility(View.VISIBLE);
                  binding.textViewEkran.setText("İşlem yapmak için sayı giriniz!");
              } else{
                  binding.textViewEkran.setText("Lütfen sayı giriniz!");
                  binding.textViewEnd.setVisibility(View.VISIBLE);
              }
          }catch (Exception e){
              binding.textViewEkran.setText("İşlem yapmak için sayı giriniz!");
          }
      }

      public void btnCarp(View view){
          try {
              if (!binding.editTextNumber.getText().toString().isEmpty() && !binding.editTextNumber2.getText().toString().isEmpty()){
                  double sayı1 = Double.parseDouble(binding.editTextNumber.getText().toString());
                  double sayı2 = Double.parseDouble(binding.editTextNumber2.getText().toString());
                  double sonuc = (sayı1) * (sayı2);
                  binding.textViewEkran.setText(""+sonuc);
                  binding.textViewEnd.setVisibility(View.VISIBLE);
              } else if (binding.editTextNumber.getText().toString().isEmpty() && binding.editTextNumber2.getText().toString().isEmpty()) {
                  binding.textViewEnd.setVisibility(View.VISIBLE);
                  binding.textViewEkran.setText("İşlem yapmak için sayı giriniz!");
              } else{
                  binding.textViewEkran.setText("Lütfen sayı giriniz!");
                  binding.textViewEnd.setVisibility(View.VISIBLE);
              }
          }catch (Exception e){
              binding.textViewEkran.setText("İşlem yapmak için sayı giriniz!");
          }
      }

        public void btnCikar(View view){
            try {
                if (!binding.editTextNumber.getText().toString().isEmpty() && !binding.editTextNumber2.getText().toString().isEmpty()){
                    double sayı1 = Double.parseDouble(binding.editTextNumber.getText().toString());
                    double sayı2 = Double.parseDouble(binding.editTextNumber2.getText().toString());
                    double sonuc = (sayı1) - (sayı2);
                    binding.textViewEkran.setText(""+sonuc);
                    binding.textViewEnd.setVisibility(View.VISIBLE);
                } else if (binding.editTextNumber.getText().toString().isEmpty() && binding.editTextNumber2.getText().toString().isEmpty()) {
                    binding.textViewEnd.setVisibility(View.VISIBLE);
                    binding.textViewEkran.setText("İşlem yapmak için sayı giriniz!");
                } else{
                    binding.textViewEkran.setText("Lütfen sayı giriniz!");
                    binding.textViewEnd.setVisibility(View.VISIBLE);
                }
            }catch (Exception e){
                binding.textViewEkran.setText("İşlem yapmak için sayı giriniz!");
            }
        }

            public void btnNegatif(View view){
                if (binding.editTextNumber.hasFocus()){
                    binding.editTextNumber.setText(binding.editTextNumber.getText()+"-");
                }else if (binding.editTextNumber2.hasFocus()){
                    binding.editTextNumber2.setText(binding.editTextNumber2.getText()+"-");
                }
            }

            public void btnNokta(View view){
                if (binding.editTextNumber.hasFocus()){
                    binding.editTextNumber.setText(binding.editTextNumber.getText()+".");
                }else if (binding.editTextNumber2.hasFocus()){
                    binding.editTextNumber2.setText(binding.editTextNumber2.getText()+".");
                }
            }






}