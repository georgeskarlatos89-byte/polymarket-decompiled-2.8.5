package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class lg5 implements Serializable {
    public static final lg5 c = new lg5("P-256", "secp256r1");
    public static final lg5 d = new lg5("secp256k1", "secp256k1");
    public static final lg5 e = new lg5("P-256K", "secp256k1");
    public static final lg5 f = new lg5("P-384", "secp384r1");
    public static final lg5 g = new lg5("P-521", "secp521r1");
    public static final lg5 h = new lg5("Ed25519", "Ed25519");
    public static final lg5 i = new lg5("Ed448", "Ed448");
    public static final lg5 j = new lg5("X25519", "X25519");
    public static final lg5 k = new lg5("X448", "X448");
    public final String a;
    public final String b;

    public lg5(String str, String str2) {
        Objects.requireNonNull(str);
        this.a = str;
        this.b = str2;
    }

    public static Set a(haa haaVar) {
        if (haa.i.equals(haaVar)) {
            return Collections.singleton(c);
        }
        if (haa.j.equals(haaVar)) {
            return Collections.singleton(d);
        }
        if (haa.k.equals(haaVar)) {
            return Collections.singleton(f);
        }
        if (haa.l.equals(haaVar)) {
            return Collections.singleton(g);
        }
        if (haa.p.equals(haaVar)) {
            return Collections.unmodifiableSet(new HashSet(Arrays.asList(h, i)));
        }
        return null;
    }

    public static lg5 b(String str) {
        if (str != null && !str.trim().isEmpty()) {
            lg5 lg5Var = c;
            if (str.equals(lg5Var.a)) {
                return lg5Var;
            }
            lg5 lg5Var2 = e;
            if (str.equals(lg5Var2.a)) {
                return lg5Var2;
            }
            lg5 lg5Var3 = d;
            if (str.equals(lg5Var3.a)) {
                return lg5Var3;
            }
            lg5 lg5Var4 = f;
            if (str.equals(lg5Var4.a)) {
                return lg5Var4;
            }
            lg5 lg5Var5 = g;
            if (str.equals(lg5Var5.a)) {
                return lg5Var5;
            }
            lg5 lg5Var6 = h;
            if (str.equals(lg5Var6.a)) {
                return lg5Var6;
            }
            lg5 lg5Var7 = i;
            if (str.equals(lg5Var7.a)) {
                return lg5Var7;
            }
            lg5 lg5Var8 = j;
            if (str.equals(lg5Var8.a)) {
                return lg5Var8;
            }
            lg5 lg5Var9 = k;
            if (str.equals(lg5Var9.a)) {
                return lg5Var9;
            }
            return new lg5(str, null);
        }
        dmk.v("The cryptographic curve string must not be null or empty");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lg5) {
            if (this.a.equals(((lg5) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        return this.a;
    }
}
