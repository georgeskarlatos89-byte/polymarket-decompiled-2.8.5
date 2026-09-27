package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum zpn implements kml {
    TYPE_UNKNOWN(0),
    LATIN(1),
    LATIN_AND_CHINESE(2),
    LATIN_AND_DEVANAGARI(3),
    LATIN_AND_JAPANESE(4),
    LATIN_AND_KOREAN(5),
    CREDIT_CARD(6),
    DOCUMENT(7),
    PIXEL_AI(8);

    private final int zzk;

    zpn(int i) {
        this.zzk = i;
    }

    @Override // defpackage.kml
    public final int zza() {
        return this.zzk;
    }
}
