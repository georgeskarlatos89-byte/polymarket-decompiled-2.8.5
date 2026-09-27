package defpackage;

import com.google.mlkit.vision.barcode.common.Barcode;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum don implements jxl {
    FORMAT_UNKNOWN(0),
    FORMAT_CODE_128(1),
    FORMAT_CODE_39(2),
    FORMAT_CODE_93(4),
    FORMAT_CODABAR(8),
    FORMAT_DATA_MATRIX(16),
    FORMAT_EAN_13(32),
    FORMAT_EAN_8(64),
    FORMAT_ITF(128),
    FORMAT_QR_CODE(256),
    FORMAT_UPC_A(Barcode.FORMAT_UPC_A),
    FORMAT_UPC_E(Barcode.FORMAT_UPC_E),
    FORMAT_PDF417(2048),
    FORMAT_AZTEC(4096);

    private final int zzp;

    don(int i) {
        this.zzp = i;
    }

    @Override // defpackage.jxl
    public final int zza() {
        return this.zzp;
    }
}
