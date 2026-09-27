package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum afl {
    GENERAL(true),
    BOOLEAN(false),
    CHARACTER(false),
    INTEGRAL(false),
    FLOAT(true);

    private final boolean zzg;

    afl(boolean z) {
        this.zzg = z;
    }

    public final boolean a() {
        return this.zzg;
    }
}
