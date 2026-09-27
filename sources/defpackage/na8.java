package defpackage;

import com.polymarket.clients.ClientLivestreamSource;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class na8 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ClientLivestreamSource.Kind.values().length];
        try {
            iArr[ClientLivestreamSource.Kind.signedStream.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ClientLivestreamSource.Kind.htmlVideoEmbed.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ClientLivestreamSource.Kind.hls.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
