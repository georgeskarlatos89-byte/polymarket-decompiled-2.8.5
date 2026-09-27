package defpackage;

import android.os.Build;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class bz9 {
    public static final p3j b = p3j.ALGORITHM_REQUIRES_BORINGCRYPTO;
    public static final aj c = new aj(9);
    public final SecretKeySpec a;

    public bz9(byte[] bArr) {
        if (b.a()) {
            g3k.a(bArr.length);
            this.a = new SecretKeySpec(bArr, "AES");
        } else {
            fi9.r("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
    }

    public static AlgorithmParameterSpec a(byte[] bArr) {
        Integer valueOf;
        int i;
        int length = bArr.length;
        if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            int i2 = q1k.a;
            if (!Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(Build.VERSION.SDK_INT);
            }
            if (valueOf != null) {
                i = valueOf.intValue();
            } else {
                i = -1;
            }
            if (i <= 19) {
                return new IvParameterSpec(bArr, 0, length);
            }
        }
        return new GCMParameterSpec(128, bArr, 0, length);
    }
}
