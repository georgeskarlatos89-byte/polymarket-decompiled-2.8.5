package com.google.android.libraries.places.internal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.g;
import com.google.android.libraries.places.R;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzvg extends c {
    private final List zza;

    public zzvg(List list) {
        list.getClass();
        this.zza = list;
    }

    @Override // androidx.recyclerview.widget.c
    public final int getItemCount() {
        return this.zza.size();
    }

    @Override // androidx.recyclerview.widget.c
    public final /* bridge */ /* synthetic */ void onBindViewHolder(g gVar, int i) {
        zzvf zzvfVar = (zzvf) gVar;
        zzvfVar.getClass();
        zzvfVar.zza().setText((CharSequence) this.zza.get(i));
    }

    @Override // androidx.recyclerview.widget.c
    public final /* bridge */ /* synthetic */ g onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.expanded_open_hours_item, viewGroup, false);
        inflate.getClass();
        return new zzvf(inflate);
    }
}
