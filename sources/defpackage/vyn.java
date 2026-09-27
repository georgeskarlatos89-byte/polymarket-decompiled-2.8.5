package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum vyn implements jxl {
    UNRECOGNIZED(0),
    CODE_128(1),
    CODE_39(2),
    CODE_93(3),
    CODABAR(4),
    DATA_MATRIX(5),
    EAN_13(6),
    EAN_8(7),
    ITF(8),
    QR_CODE(9),
    UPC_A(10),
    UPC_E(11),
    PDF417(12),
    AZTEC(13),
    DATABAR(14),
    TEZ_CODE(16);

    private final int zzr;

    vyn(int i) {
        this.zzr = i;
    }

    @Override // defpackage.jxl
    public final int zza() {
        return this.zzr;
    }
}
