package com.google.android.libraries.places.internal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.g;
import com.google.android.libraries.places.R;
import defpackage.dmk;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzuy extends c {
    private final List zza;

    public zzuy(List list) {
        list.getClass();
        this.zza = list;
    }

    @Override // androidx.recyclerview.widget.c
    public final int getItemCount() {
        return this.zza.size();
    }

    @Override // androidx.recyclerview.widget.c
    public final int getItemViewType(int i) {
        zzuv zzuvVar = (zzuv) this.zza.get(i);
        if (zzuvVar instanceof zzuu) {
            return 0;
        }
        if (zzuvVar instanceof zzut) {
            return 1;
        }
        dmk.a();
        return 0;
    }

    @Override // androidx.recyclerview.widget.c
    public final void onBindViewHolder(g gVar, int i) {
        gVar.getClass();
        int itemViewType = gVar.getItemViewType();
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                return;
            }
            TextView zza = ((zzuw) gVar).zza();
            Object obj = this.zza.get(i);
            obj.getClass();
            zza.setText(((zzut) obj).zza());
            return;
        }
        TextView zza2 = ((zzux) gVar).zza();
        Object obj2 = this.zza.get(i);
        obj2.getClass();
        zza2.setText(((zzuu) obj2).zza());
    }

    @Override // androidx.recyclerview.widget.c
    public final g onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i != 0) {
            if (i == 1) {
                View inflate = from.inflate(R.layout.about_tab_feature, viewGroup, false);
                inflate.getClass();
                return new zzuw(inflate);
            }
            dmk.v("Invalid view type");
            return null;
        }
        View inflate2 = from.inflate(R.layout.about_tab_section_title, viewGroup, false);
        inflate2.getClass();
        return new zzux(inflate2);
    }

    public final boolean zza(int i) {
        if (i >= 0) {
            List list = this.zza;
            if (i < list.size() - 1) {
                return list.get(i + 1) instanceof zzuu;
            }
            return false;
        }
        return false;
    }
}
