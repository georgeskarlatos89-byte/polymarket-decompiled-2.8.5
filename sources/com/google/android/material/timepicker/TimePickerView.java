package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.polymarket.android.R;
import defpackage.pjb;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
class TimePickerView extends ConstraintLayout {
    public static final /* synthetic */ int r = 0;
    public final Chip q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.View$OnClickListener, java.lang.Object] */
    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ?? obj = new Object();
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        materialButtonToggleGroup.m.add(new Object());
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.q = chip2;
        clockFaceView.I = new e(this);
        pjb pjbVar = new pjb(new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener()), 1);
        chip.setOnTouchListener(pjbVar);
        chip2.setOnTouchListener(pjbVar);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(obj);
        chip2.setOnClickListener(obj);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.q.sendAccessibilityEvent(8);
        }
    }
}
