package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.g;
import com.polymarket.android.R;
import defpackage.a1k;
import defpackage.dmk;
import defpackage.ikc;
import defpackage.me7;
import defpackage.nkc;
import defpackage.rn6;
import defpackage.tsf;
import defpackage.tu2;
import defpackage.w4c;
import java.util.Calendar;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class e extends androidx.recyclerview.widget.c {
    public final tu2 a;
    public final rn6 b;
    public final me7 c;
    public final int d;
    public ikc e;
    public int f = 0;

    public e(ContextThemeWrapper contextThemeWrapper, tu2 tu2Var, rn6 rn6Var, me7 me7Var) {
        ikc ikcVar = tu2Var.a;
        ikc ikcVar2 = tu2Var.b;
        ikc ikcVar3 = tu2Var.d;
        if (ikcVar.a.compareTo(ikcVar3.a) <= 0) {
            if (ikcVar3.a.compareTo(ikcVar2.a) <= 0) {
                this.d = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * nkc.d) + (w4c.u(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
                this.a = tu2Var;
                this.b = rn6Var;
                this.c = me7Var;
                this.e = ikcVar3;
                setHasStableIds(true);
                return;
            }
            dmk.v("currentPage cannot be after lastPage");
            throw null;
        }
        dmk.v("firstPage cannot be after currentPage");
        throw null;
    }

    public final ikc a(int i) {
        Calendar a = a1k.a(this.a.a.a);
        a.add(2, i);
        return new ikc(a);
    }

    public final int b(ikc ikcVar) {
        return this.a.a.p(ikcVar);
    }

    @Override // androidx.recyclerview.widget.c
    public final int getItemCount() {
        return this.a.g;
    }

    @Override // androidx.recyclerview.widget.c
    public final long getItemId(int i) {
        Calendar a = a1k.a(this.a.a.a);
        a.add(2, i);
        a.set(5, 1);
        Calendar a2 = a1k.a(a);
        a2.get(2);
        a2.get(1);
        a2.getMaximum(7);
        a2.getActualMaximum(5);
        a2.getTimeInMillis();
        return a2.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.c
    public final void onBindViewHolder(g gVar, int i) {
        d dVar = (d) gVar;
        tu2 tu2Var = this.a;
        Calendar a = a1k.a(tu2Var.a.a);
        a.add(2, i);
        ikc ikcVar = new ikc(a);
        dVar.a.setText(ikcVar.o());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) dVar.b.findViewById(R.id.month_grid);
        if (materialCalendarGridView.b() != null && ikcVar.equals(materialCalendarGridView.b().a)) {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.b().getClass();
            throw null;
        }
        new nkc(ikcVar, tu2Var);
        throw null;
    }

    @Override // androidx.recyclerview.widget.c
    public final g onCreateViewHolder(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (w4c.u(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            linearLayout.setLayoutParams(new tsf(-1, this.d));
            return new d(linearLayout, true);
        }
        return new d(linearLayout, false);
    }
}
