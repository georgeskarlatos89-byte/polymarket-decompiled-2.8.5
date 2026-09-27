package defpackage;

import android.os.Bundle;
import java.math.BigInteger;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.EllipticCurve;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class nyn {
    public static boolean a(BigInteger bigInteger, BigInteger bigInteger2, ECParameterSpec eCParameterSpec) {
        EllipticCurve curve = eCParameterSpec.getCurve();
        BigInteger a = curve.getA();
        BigInteger b = curve.getB();
        BigInteger p = ((ECFieldFp) curve.getField()).getP();
        return bigInteger2.pow(2).mod(p).equals(bigInteger.pow(3).add(a.multiply(bigInteger)).add(b).mod(p));
    }

    public static final void b(String str, int i, Bundle bundle) {
        str.getClass();
        bundle.putInt(str, i);
    }

    public static final void c(Bundle bundle, String str) {
        str.getClass();
        bundle.putString(str, null);
    }

    public static final void d(Bundle bundle, String str, List list) {
        str.getClass();
        list.getClass();
        bundle.putParcelableArrayList(str, pyn.b(list));
    }

    public static final void e(Bundle bundle, String str, Bundle bundle2) {
        str.getClass();
        bundle2.getClass();
        bundle.putBundle(str, bundle2);
    }

    public static final void f(Bundle bundle, String str, String str2) {
        str.getClass();
        str2.getClass();
        bundle.putString(str, str2);
    }

    public static final void g(Bundle bundle, String str, List list) {
        str.getClass();
        list.getClass();
        bundle.putStringArrayList(str, pyn.b(list));
    }
}
