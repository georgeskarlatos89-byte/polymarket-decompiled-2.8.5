package io.sentry.android.replay.viewhierarchy;

import android.graphics.Rect;
import defpackage.r40;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class g {
    public final int a;
    public final int b;
    public final float c;
    public final boolean d;
    public final boolean e;
    public final Rect f;
    public ArrayList g;

    public g(int i, int i2, float f, g gVar, boolean z, boolean z2, Rect rect) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = z;
        this.e = z2;
        this.f = rect;
    }

    public final void a(r40 r40Var) {
        ArrayList arrayList;
        if (((Boolean) r40Var.invoke(this)).booleanValue() && (arrayList = this.g) != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(r40Var);
            }
        }
    }
}
