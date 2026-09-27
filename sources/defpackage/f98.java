package defpackage;

import com.polymarket.data.EEventStreamDenialReason;
import com.polymarket.data.EEventStreamSource;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class f98 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[EEventStreamDenialReason.values().length];
        try {
            iArr[EEventStreamDenialReason.loginRequired.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
        int[] iArr2 = new int[EEventStreamSource.Kind.values().length];
        try {
            iArr2[EEventStreamSource.Kind.hls.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[EEventStreamSource.Kind.embed.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[EEventStreamSource.Kind.webRTC.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
        int[] iArr3 = new int[r98.values().length];
        try {
            iArr3[r98.Playing.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[r98.Failed.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        c = iArr3;
    }
}
