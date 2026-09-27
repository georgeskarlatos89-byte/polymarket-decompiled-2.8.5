package com.google.android.libraries.places.internal;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.g;
import com.google.android.libraries.places.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzuw extends g {
    private final TextView zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzuw(View view) {
        super(view);
        view.getClass();
        View findViewById = view.findViewById(R.id.feature_name);
        findViewById.getClass();
        this.zza = (TextView) findViewById;
    }

    public final TextView zza() {
        return this.zza;
    }
}
