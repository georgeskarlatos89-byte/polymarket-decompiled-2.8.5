package io.sentry.android.core.internal.threaddump;

import android.graphics.Bitmap;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class b {
    public final int a;
    public int b;
    public final Object c;

    public b(Bitmap bitmap, int i, int i2) {
        bitmap.getClass();
        this.c = bitmap;
        this.a = i;
        this.b = i2;
    }

    public a a() {
        int i = this.b;
        if (i >= 0 && i < this.a) {
            ArrayList arrayList = (ArrayList) this.c;
            this.b = i + 1;
            return (a) arrayList.get(i);
        }
        return null;
    }

    public b(ArrayList arrayList) {
        this.c = arrayList;
        this.a = arrayList.size();
    }
}
