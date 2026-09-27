package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum rym {
    GOOGLE_ANALYTICS(0),
    GOOGLE_SIGNAL(1),
    SGTM(2),
    SGTM_CLIENT(3),
    GOOGLE_SIGNAL_PENDING(4),
    UNKNOWN(99);

    private final int zzg;

    rym(int i) {
        this.zzg = i;
    }

    public static rym a(int i) {
        for (rym rymVar : values()) {
            if (rymVar.zzg == i) {
                return rymVar;
            }
        }
        return UNKNOWN;
    }

    public final int zza() {
        return this.zzg;
    }
}
