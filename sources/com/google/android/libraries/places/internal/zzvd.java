package com.google.android.libraries.places.internal;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.g;
import com.google.android.libraries.places.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzvd extends g {
    private final TextView zza;
    private final TextView zzb;
    private final CardView zzc;
    private final TextView zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzvd(View view) {
        super(view);
        view.getClass();
        View findViewById = view.findViewById(R.id.connector_name);
        findViewById.getClass();
        this.zza = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.max_charge_rate);
        findViewById2.getClass();
        this.zzb = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.chargers_available_card);
        findViewById3.getClass();
        this.zzc = (CardView) findViewById3;
        View findViewById4 = view.findViewById(R.id.chargers_available);
        findViewById4.getClass();
        this.zzd = (TextView) findViewById4;
    }

    public final TextView zza() {
        return this.zza;
    }

    public final TextView zzb() {
        return this.zzb;
    }

    public final CardView zzc() {
        return this.zzc;
    }

    public final TextView zzd() {
        return this.zzd;
    }
}
