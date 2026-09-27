package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum tsm implements ull {
    TYPE_UNKNOWN(0),
    TYPE_THIN(1),
    TYPE_THICK(2),
    TYPE_GMV(3);

    private final int zzf;

    tsm(int i) {
        this.zzf = i;
    }

    @Override // defpackage.ull
    public final int zza() {
        return this.zzf;
    }
}
