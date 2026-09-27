package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class by6 {
    public static final by6 b = new by6(2);
    public static final by6 c = new by6(0);
    public static final by6 d;
    public static final by6 e;
    public static final by6 f;
    public static final cld g;
    public static final boolean h;
    public final /* synthetic */ int a;

    static {
        by6 by6Var = new by6(1);
        d = by6Var;
        e = new by6(3);
        f = by6Var;
        g = cld.a(by6Var, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        h = true;
    }

    public /* synthetic */ by6(int i) {
        this.a = i;
    }

    public final cy6 a(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                if (b(i, i2, i3, i4) == 1.0f) {
                    return cy6.QUALITY;
                }
                return b.a(i, i2, i3, i4);
            case 1:
                return cy6.QUALITY;
            case 2:
                if (h) {
                    return cy6.QUALITY;
                }
                return cy6.MEMORY;
            default:
                return cy6.QUALITY;
        }
    }

    public final float b(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                return Math.min(1.0f, b.b(i, i2, i3, i4));
            case 1:
                return Math.max(i3 / i, i4 / i2);
            case 2:
                if (h) {
                    return Math.min(i3 / i, i4 / i2);
                }
                if (Math.max(i2 / i4, i / i3) == 0) {
                    return 1.0f;
                }
                return 1.0f / Integer.highestOneBit(r1);
            default:
                return 1.0f;
        }
    }
}
