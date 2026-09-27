package com.google.android.material.datepicker;

import defpackage.nkc;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ MaterialCalendarGridView a;
    public final /* synthetic */ int b;

    public /* synthetic */ b(e eVar, MaterialCalendarGridView materialCalendarGridView, int i) {
        this.a = materialCalendarGridView;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int a;
        MaterialCalendarGridView materialCalendarGridView = this.a;
        if (materialCalendarGridView.hasFocus() && (i = this.b) != 0) {
            nkc b = materialCalendarGridView.b();
            if (i == 1) {
                a = b.b(b.f() + 1);
                if (a == -1) {
                    a = b.f();
                }
            } else {
                a = b.a(b.c() - 1);
                if (a == -1) {
                    a = b.c();
                }
            }
            materialCalendarGridView.setSelection(a);
        }
    }
}
