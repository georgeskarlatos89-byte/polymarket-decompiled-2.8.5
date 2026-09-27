package defpackage;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class i2m extends wfn implements Serializable {
    public final MessageDigest a;
    public final int b;
    public final boolean c;
    public final String d;

    public i2m() {
        boolean z;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.a = messageDigest;
            this.b = messageDigest.getDigestLength();
            this.d = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z = true;
            } catch (CloneNotSupportedException unused) {
                z = false;
            }
            this.c = z;
        } catch (NoSuchAlgorithmException e) {
            dmk.i(e);
            throw null;
        }
    }

    public final String toString() {
        return this.d;
    }
}
