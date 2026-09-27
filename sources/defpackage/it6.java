package defpackage;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.SecretKey;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class it6 extends b91 {
    public static final Set f;

    static {
        Set set = q35.a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(aaa.k);
        f = Collections.unmodifiableSet(linkedHashSet);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public it6(SecretKey secretKey) {
        super(f, r0, secretKey);
        int length;
        Set set;
        byte[] encoded = secretKey.getEncoded();
        if (encoded == null) {
            length = 0;
        } else {
            length = encoded.length * 8;
        }
        if (length == 0) {
            set = ee7.a;
        } else {
            set = (Set) q35.b.get(Integer.valueOf(length));
            if (set == null) {
                throw new Exception("The Content Encryption Key length must be 128 bits (16 bytes), 192 bits (24 bytes), 256 bits (32 bytes), 384 bits (48 bytes) or 512 bites (64 bytes)");
            }
        }
    }
}
