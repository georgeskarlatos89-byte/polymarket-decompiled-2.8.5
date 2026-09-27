package com.google.android.libraries.places.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.ConsumerAlert;
import com.google.android.libraries.places.api.model.Place;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzvc {
    private final Context zza;
    private final int zzb;
    private final View zzc;
    private final TextView zzd;
    private final TextView zze;

    public zzvc(Context context, int i, View view) {
        context.getClass();
        view.getClass();
        this.zza = context;
        this.zzb = i;
        View findViewById = view.findViewById(R.id.consumer_alert);
        findViewById.getClass();
        this.zzc = findViewById;
        View findViewById2 = view.findViewById(R.id.consumer_alert_overview);
        findViewById2.getClass();
        this.zzd = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.consumer_alert_details);
        findViewById3.getClass();
        this.zze = (TextView) findViewById3;
    }

    public static /* synthetic */ void zzb(zzvc zzvcVar) {
        TextView textView = zzvcVar.zze;
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        compoundDrawablesRelative.getClass();
        Drawable drawable = compoundDrawablesRelative[2];
        if (drawable != null) {
            int lineHeight = textView.getLineHeight();
            drawable.setBounds(0, 0, lineHeight, lineHeight);
            textView.setCompoundDrawablesRelative(null, null, drawable, null);
        }
    }

    public static /* synthetic */ void zzc(zzvc zzvcVar, ConsumerAlert consumerAlert, View view) {
        new zztk(zzvcVar.zza, zzvcVar.zzb, consumerAlert).show();
    }

    public final void zza(Place place) {
        place.getClass();
        final ConsumerAlert consumerAlert = place.getConsumerAlert();
        View view = this.zzc;
        if (consumerAlert == null) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        this.zzd.setText(consumerAlert.getOverview());
        TextView textView = this.zze;
        textView.post(new Runnable() { // from class: com.google.android.libraries.places.internal.zzvb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzvc.zzb(zzvc.this);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.internal.zzva
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view2) {
                zzvc.zzc(zzvc.this, consumerAlert, view2);
            }
        });
    }
}
