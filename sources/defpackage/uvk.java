package defpackage;

import com.google.mlkit.vision.barcode.common.Barcode;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public enum uvk {
    HTTP_CONNECT_TIMEOUT(60000),
    HTTP_READ_TIMEOUT(60000),
    READ_BYTE(Barcode.FORMAT_UPC_E);

    private final int a;

    uvk(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }
}
