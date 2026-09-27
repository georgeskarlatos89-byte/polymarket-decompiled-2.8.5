package com.socure.docv.capturesdk.feature.help.presentation.ui;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.g;
import com.polymarket.android.R;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class c extends androidx.recyclerview.widget.c {
    public final List a;
    public final String b;
    public final LayoutInflater c;

    public c(Context context, List list, String str) {
        list.getClass();
        str.getClass();
        this.a = list;
        this.b = str;
        LayoutInflater from = LayoutInflater.from(context);
        from.getClass();
        this.c = from;
    }

    @Override // androidx.recyclerview.widget.c
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.c
    public final void onBindViewHolder(g gVar, int i) {
        b bVar = (b) gVar;
        bVar.getClass();
        bVar.a.setText((CharSequence) this.a.get(i));
        TextView textView = bVar.a;
        String str = this.b;
        textView.setTextColor(Color.parseColor(str));
        bVar.b.setTextColor(Color.parseColor(str));
    }

    @Override // androidx.recyclerview.widget.c
    public final g onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View inflate = this.c.inflate(R.layout.socure_instruction_item, viewGroup, false);
        inflate.getClass();
        return new b(inflate);
    }
}
