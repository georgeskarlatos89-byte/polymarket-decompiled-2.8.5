package defpackage;

import com.google.mlkit.vision.barcode.common.Barcode;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class fe7 extends fn {
    public static final fe7 d = new fe7("A128CBC-HS256", 256);
    public static final fe7 e = new fe7("A192CBC-HS384", 384);
    public static final fe7 f = new fe7("A256CBC-HS512", Barcode.FORMAT_UPC_A);
    public static final fe7 g = new fe7("A128CBC+HS256", 256);
    public static final fe7 h = new fe7("A256CBC+HS512", Barcode.FORMAT_UPC_A);
    public static final fe7 i = new fe7("A128GCM", 128);
    public static final fe7 j = new fe7("A192GCM", 192);
    public static final fe7 k = new fe7("A256GCM", 256);
    public static final fe7 l = new fe7("XC20P", 256);
    public final int c;

    public fe7(String str, int i2) {
        super(str);
        this.c = i2;
    }
}
