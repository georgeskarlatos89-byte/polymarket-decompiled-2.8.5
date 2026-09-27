package io.sentry.android.replay;

import defpackage.sv6;
import defpackage.woa;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class v {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final int e;
    public final int f;

    public v(int i, int i2, float f, float f2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = i3;
        this.f = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (this.a == vVar.a && this.b == vVar.b && Float.compare(this.c, vVar.c) == 0 && Float.compare(this.d, vVar.d) == 0 && this.e == vVar.e && this.f == vVar.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + woa.b(this.e, sv6.a(sv6.a(woa.b(this.b, Integer.hashCode(this.a) * 31, 31), this.c, 31), this.d, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScreenshotRecorderConfig(recordingWidth=");
        sb.append(this.a);
        sb.append(", recordingHeight=");
        sb.append(this.b);
        sb.append(", scaleFactorX=");
        sb.append(this.c);
        sb.append(", scaleFactorY=");
        sb.append(this.d);
        sb.append(", frameRate=");
        sb.append(this.e);
        sb.append(", bitRate=");
        return sv6.o(sb, this.f, ')');
    }
}
