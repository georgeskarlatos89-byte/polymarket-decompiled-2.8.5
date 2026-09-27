package defpackage;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class b91 {
    public static final Set e = Collections.unmodifiableSet(new HashSet(Arrays.asList("AES", "ChaCha20")));
    public final Set a;
    public final Set b;
    public final daa c = new rn6(0);
    public final SecretKey d;

    /* JADX WARN: Type inference failed for: r0v0, types: [daa, rn6] */
    public b91(Set set, Set set2, SecretKey secretKey) {
        if (set != null) {
            this.a = Collections.unmodifiableSet(set);
            if (set2 != null) {
                this.b = set2;
                if (secretKey != null && set.size() > 1 && (secretKey.getAlgorithm() == null || !e.contains(secretKey.getAlgorithm()))) {
                    dmk.v("The algorithm of the content encryption key (CEK) must be AES or ChaCha20");
                    throw null;
                }
                this.d = secretKey;
                return;
            }
            dmk.v("The supported encryption methods must not be null");
            throw null;
        }
        dmk.v("The supported JWE algorithm set must not be null");
        throw null;
    }

    public final SecretKey b(fe7 fe7Var) {
        SecretKey secretKey = this.d;
        if (secretKey != null) {
            return secretKey;
        }
        if (fe7Var == null) {
            return secretKey;
        }
        SecureRandom secureRandom = new SecureRandom();
        Set set = q35.a;
        if (set.contains(fe7Var)) {
            byte[] bArr = new byte[fe7Var.c / 8];
            secureRandom.nextBytes(bArr);
            return new SecretKeySpec(bArr, "AES");
        }
        throw new Exception(j9n.d(fe7Var, set));
    }
}
