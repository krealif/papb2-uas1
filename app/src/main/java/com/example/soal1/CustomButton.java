package com.example.soal1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;

import com.google.android.material.button.MaterialButton;

public class CustomButton extends MaterialButton implements View.OnClickListener {

    private Drawable loveIcon;
    private boolean toggle = false;
    ColorStateList currentColor;

    public CustomButton(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        loveIcon = ResourcesCompat.getDrawable(getResources(),
                R.drawable.baseline_favorite_24, null);

        setCompoundDrawablesWithIntrinsicBounds(loveIcon, null, loveIcon, null);

        // get current color
        currentColor = getBackgroundTintList();

        setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (toggle) {
            setBackgroundTintList(currentColor);
        } else {
            setBackgroundTintList(ColorStateList.valueOf(Color.RED));
        }
        toggle = !toggle;
    }
}
