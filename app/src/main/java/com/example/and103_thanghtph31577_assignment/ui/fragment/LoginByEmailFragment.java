package com.example.and103_thanghtph31577_assignment.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.and103_thanghtph31577_assignment.MainActivity;
import com.example.and103_thanghtph31577_assignment.R;
import com.example.and103_thanghtph31577_assignment.databinding.FragmentLoginByEmailBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.concurrent.Executor;


public class LoginByEmailFragment extends Fragment {

    private FragmentLoginByEmailBinding binding;
    private FirebaseAuth mAuth;
    private Context context;

    public LoginByEmailFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onStart() {
        super.onStart();
        mAuth = FirebaseAuth.getInstance();

        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            startActivity(new Intent(getActivity(), MainActivity.class));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentLoginByEmailBinding.inflate(inflater, container, false);
        mAuth = FirebaseAuth.getInstance();
        context = requireActivity();
        userListener();
        return binding.getRoot();
    }
    private void userListener() {
        binding.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });

        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginApp();
            }
        });

        binding.textViewForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("123123", "onClick: ");
                mAuth.sendPasswordResetEmail(binding.editTextEmail.getText().toString().trim()).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(getActivity(), "Vui lòng kiểm tra gmail lấy lại mật khẩu", Toast.LENGTH_SHORT).show();

                        }else {
                            Toast.makeText(getActivity(), "Lỗi gửi gmail", Toast.LENGTH_SHORT).show();

                        }
                    }
                });
            }
        });
    }

    private void loginApp() {

        String pass  = binding.editTextPassword.getText().toString().trim();

        String email = binding.editTextEmail.getText().toString().trim();
        if (email.isEmpty() || pass.isEmpty()) {
            Toast.makeText(context, "Vui lòng nhập đủ thông tin", Toast.LENGTH_SHORT).show();
        }   else {
            mAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener( getActivity(), new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        FirebaseUser user = mAuth.getCurrentUser();
                        Toast.makeText(getActivity(), "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(getActivity(), MainActivity.class));
                    }else {
                        Toast.makeText(getActivity(), "Đăng nhập thất bại", Toast.LENGTH_SHORT).show();
                    }
                }
            });

        }

    }
}