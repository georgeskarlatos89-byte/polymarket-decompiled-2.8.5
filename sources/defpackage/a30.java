package defpackage;

import android.security.keystore.KeyGenParameterSpec;
import io.sentry.android.core.m0;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class a30 {
    public static final Object b = new Object();
    public KeyStore a;

    public a30() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            this.a = keyStore;
        } catch (IOException | GeneralSecurityException e) {
            xbc.m(e);
            throw null;
        }
    }

    public static boolean a(String str) {
        a30 a30Var = new a30();
        synchronized (b) {
            try {
                if (!a30Var.d(str)) {
                    b(str);
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(String str) {
        String b2 = g3k.b(str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(b2, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    public final synchronized z20 c(String str) {
        z20 z20Var;
        z20Var = new z20(g3k.b(str), this.a);
        byte[] a = hnf.a(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(a, z20Var.b(z20Var.a(a, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return z20Var;
    }

    public final synchronized boolean d(String str) {
        String b2;
        b2 = g3k.b(str);
        try {
        } catch (NullPointerException unused) {
            m0.p("a30", "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
            try {
                try {
                    Thread.sleep((int) (Math.random() * 40.0d));
                } catch (InterruptedException unused2) {
                }
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.a = keyStore;
                keyStore.load(null);
                return this.a.containsAlias(b2);
            } catch (IOException e) {
                throw new GeneralSecurityException(e);
            }
        }
        return this.a.containsAlias(b2);
    }
}
