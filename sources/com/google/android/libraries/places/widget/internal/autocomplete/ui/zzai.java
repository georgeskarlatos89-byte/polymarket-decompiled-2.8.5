package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.g;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.internal.zzqv;
import defpackage.jib;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzai extends jib {
    private final zzaj zza;
    private int zzb;
    private boolean zzc;

    public zzai(zzaj zzajVar) {
        super(new zzah(null));
        this.zzc = true;
        this.zza = zzajVar;
    }

    @Override // androidx.recyclerview.widget.c
    public final /* bridge */ /* synthetic */ void onBindViewHolder(g gVar, int i) {
        zzb((zzal) gVar, i);
    }

    @Override // androidx.recyclerview.widget.c
    public final /* bridge */ /* synthetic */ g onCreateViewHolder(ViewGroup viewGroup, int i) {
        return zza(viewGroup, i);
    }

    @Override // defpackage.jib
    public final void submitList(List list) {
        boolean z;
        try {
            int i = 0;
            if (this.zzb == 0 && list != null && !list.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            this.zzc = z;
            if (list != null) {
                i = list.size();
            }
            this.zzb = i;
            super.submitList(list);
        } catch (Error | RuntimeException e) {
            zzqv.zzb(e);
            throw e;
        }
    }

    public final zzal zza(ViewGroup viewGroup, int i) {
        try {
            return new zzal(this.zza, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.places_autocomplete_prediction, viewGroup, false));
        } catch (Error | RuntimeException e) {
            zzqv.zzb(e);
            throw e;
        }
    }

    public final void zzb(zzal zzalVar, int i) {
        try {
            zzalVar.zza((AutocompletePrediction) getItem(i), this.zzc);
        } catch (Error | RuntimeException e) {
            zzqv.zzb(e);
            throw e;
        }
    }
}
