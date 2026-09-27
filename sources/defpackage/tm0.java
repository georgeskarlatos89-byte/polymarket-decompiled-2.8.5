package defpackage;

import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class tm0 {
    public final List a = Collections.singletonList("RS256");
    public final Signature b;

    public tm0(PublicKey publicKey) {
        try {
            Signature signature = Signature.getInstance("SHA256withRSA");
            this.b = signature;
            signature.initVerify(publicKey);
        } catch (NoSuchAlgorithmException unused) {
        }
    }
}
