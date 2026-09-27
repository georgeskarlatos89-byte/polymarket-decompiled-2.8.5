package defpackage;

import android.os.Build;
import android.window.BackEvent;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class m21 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final long e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m21(BackEvent backEvent) {
        this(r1, r2, r3, r4, r5);
        long j;
        backEvent.getClass();
        float a = b30.a(backEvent);
        float t = b30.t(backEvent);
        float y = b30.y(backEvent);
        int c = b30.c(backEvent);
        if (Build.VERSION.SDK_INT >= 36) {
            j = l21.b(backEvent);
        } else {
            j = 0;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat(touchX=");
        sb.append(this.a);
        sb.append(", touchY=");
        sb.append(this.b);
        sb.append(", progress=");
        sb.append(this.c);
        sb.append(", swipeEdge=");
        sb.append(this.d);
        sb.append(", frameTimeMillis=");
        return ix2.n(sb, this.e, ')');
    }

    public m21(float f, float f2, float f3, int i, long j) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
        this.e = j;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m21(g0d g0dVar) {
        this(g0dVar.c, g0dVar.d, g0dVar.b, g0dVar.a, g0dVar.e);
        g0dVar.getClass();
    }
}
