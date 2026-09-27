package defpackage;

import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class tpe {
    public static final tpe d = new tpe(1.0f, 1.0f);
    public final float a;
    public final float b;
    public final int c;

    static {
        u1k.G(0);
        u1k.G(1);
    }

    public tpe(float f, float f2) {
        boolean z;
        if (f > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        pfn.b(z);
        pfn.b(f2 > 0.0f);
        this.a = f;
        this.b = f2;
        this.c = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tpe.class == obj.getClass()) {
            tpe tpeVar = (tpe) obj;
            if (this.a == tpeVar.a && this.b == tpeVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.a), Float.valueOf(this.b)};
        int i = u1k.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
