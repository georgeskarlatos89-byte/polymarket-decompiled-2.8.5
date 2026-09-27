package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.g;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.internal.zzqv;
import defpackage.d55;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzal extends g {
    private final TextView zza;
    private final TextView zzb;
    private AutocompletePrediction zzc;
    private boolean zzd;

    public zzal(final zzaj zzajVar, View view) {
        super(view);
        this.zza = (TextView) view.findViewById(R.id.places_autocomplete_prediction_primary_text);
        this.zzb = (TextView) view.findViewById(R.id.places_autocomplete_prediction_secondary_text);
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzak
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view2) {
                zzal.this.zzc(zzajVar, view2);
            }
        });
    }

    private final /* synthetic */ void zzd(zzaj zzajVar, View view) {
        AutocompletePrediction autocompletePrediction = this.zzc;
        if (autocompletePrediction == null) {
            return;
        }
        try {
            zzajVar.zza(autocompletePrediction, getAdapterPosition());
        } catch (Error | RuntimeException e) {
            zzqv.zzb(e);
            throw e;
        }
    }

    public final void zza(AutocompletePrediction autocompletePrediction, boolean z) {
        this.zzc = autocompletePrediction;
        this.zzd = z;
        SpannableString primaryText = autocompletePrediction.getPrimaryText(new ForegroundColorSpan(d55.d(this.itemView.getContext(), R.color.places_autocomplete_prediction_primary_text_highlight)));
        TextView textView = this.zza;
        textView.setText(primaryText);
        TextView textView2 = this.zzb;
        SpannableString secondaryText = autocompletePrediction.getSecondaryText(null);
        textView2.setText(secondaryText);
        if (secondaryText.length() == 0) {
            textView2.setVisibility(8);
            textView.setGravity(16);
        } else {
            textView2.setVisibility(0);
            textView.setGravity(80);
        }
    }

    public final boolean zzb() {
        return this.zzd;
    }

    public final /* synthetic */ void zzc(zzaj zzajVar, View view) {
        zzd(zzajVar, view);
    }
}
