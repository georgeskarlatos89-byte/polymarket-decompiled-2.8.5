package com.google.android.libraries.places.internal;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.g;
import com.google.android.libraries.places.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzvh extends g {
    private final TextView zza;
    private final TextView zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzvh(View view) {
        super(view);
        view.getClass();
        View findViewById = view.findViewById(R.id.fuel_type);
        findViewById.getClass();
        this.zza = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.fuel_price);
        findViewById2.getClass();
        this.zzb = (TextView) findViewById2;
    }

    public final TextView zza() {
        return this.zza;
    }

    public final TextView zzb() {
        return this.zzb;
    }
}
