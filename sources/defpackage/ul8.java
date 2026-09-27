package defpackage;

import android.util.Range;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ul8 extends e19 {
    public static final Range e = new Range(30, 30);
    public final int b = 60;
    public final int c = 60;
    public final bx7 d = bx7.FPS_RANGE;

    @Override // defpackage.e19
    public final bx7 a() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FpsRangeFeature(minFps=");
        sb.append(this.b);
        sb.append(", maxFps=");
        return sv6.o(sb, this.c, ')');
    }
}
