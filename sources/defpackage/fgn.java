package defpackage;

import android.net.Uri;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class fgn {
    public static boolean a(Uri uri) {
        if (uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority())) {
            return true;
        }
        return false;
    }

    public static void c(int i, String str, List list) {
        if (list.size() == i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i + " parameters found " + list.size());
    }

    public static void d(int i, String str, List list) {
        if (list.size() >= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at least " + i + " parameters found " + list.size());
    }

    public static void e(int i, String str, ArrayList arrayList) {
        if (arrayList.size() <= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at most " + i + " parameters found " + arrayList.size());
    }

    public static boolean f(ndl ndlVar) {
        if (ndlVar == null) {
            return false;
        }
        Double zzd = ndlVar.zzd();
        if (zzd.isNaN() || zzd.doubleValue() < ConstantsKt.UNSET || !zzd.equals(Double.valueOf(Math.floor(zzd.doubleValue())))) {
            return false;
        }
        return true;
    }

    public static rgl g(String str) {
        rgl rglVar;
        if (str != null && !str.isEmpty()) {
            rglVar = rgl.a(Integer.parseInt(str));
        } else {
            rglVar = null;
        }
        if (rglVar != null) {
            return rglVar;
        }
        dmk.v(k84.g("Unsupported commandId ", str));
        return null;
    }

    public static boolean h(ndl ndlVar, ndl ndlVar2) {
        if (!ndlVar.getClass().equals(ndlVar2.getClass())) {
            return false;
        }
        if ((ndlVar instanceof gel) || (ndlVar instanceof gdl)) {
            return true;
        }
        if (ndlVar instanceof pal) {
            if (Double.isNaN(ndlVar.zzd().doubleValue()) || Double.isNaN(ndlVar2.zzd().doubleValue())) {
                return false;
            }
            return ndlVar.zzd().equals(ndlVar2.zzd());
        }
        if (ndlVar instanceof del) {
            return ndlVar.zzc().equals(ndlVar2.zzc());
        }
        if (ndlVar instanceof b9l) {
            return ndlVar.zze().equals(ndlVar2.zze());
        }
        if (ndlVar != ndlVar2) {
            return false;
        }
        return true;
    }

    public static int i(double d) {
        int i;
        if (!Double.isNaN(d) && !Double.isInfinite(d) && d != ConstantsKt.UNSET) {
            if (d > ConstantsKt.UNSET) {
                i = 1;
            } else {
                i = -1;
            }
            return (int) ((i * Math.floor(Math.abs(d))) % 4.294967296E9d);
        }
        return 0;
    }

    public static double j(double d) {
        int i;
        if (Double.isNaN(d)) {
            return ConstantsKt.UNSET;
        }
        if (!Double.isInfinite(d) && d != ConstantsKt.UNSET && d != ConstantsKt.UNSET) {
            if (d > ConstantsKt.UNSET) {
                i = 1;
            } else {
                i = -1;
            }
            return i * Math.floor(Math.abs(d));
        }
        return d;
    }

    public static Object k(ndl ndlVar) {
        if (ndl.g1.equals(ndlVar)) {
            return null;
        }
        if (ndl.e1.equals(ndlVar)) {
            return "";
        }
        if (ndlVar instanceof zcl) {
            return l((zcl) ndlVar);
        }
        if (ndlVar instanceof h8l) {
            ArrayList arrayList = new ArrayList();
            h8l h8lVar = (h8l) ndlVar;
            int i = 0;
            while (i < h8lVar.k()) {
                if (i < h8lVar.k()) {
                    int i2 = i + 1;
                    Object k = k(h8lVar.l(i));
                    if (k != null) {
                        arrayList.add(k);
                    }
                    i = i2;
                } else {
                    ahh.i(hdi.l(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
                    return null;
                }
            }
            return arrayList;
        }
        if (!ndlVar.zzd().isNaN()) {
            return ndlVar.zzd();
        }
        return ndlVar.zzc();
    }

    public static HashMap l(zcl zclVar) {
        HashMap hashMap = new HashMap();
        Iterator it = new ArrayList(zclVar.a.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object k = k(zclVar.a(str));
            if (k != null) {
                hashMap.put(str, k);
            }
        }
        return hashMap;
    }

    public static void m(a7h a7hVar) {
        int i = i(a7hVar.I("runtime.counter").zzd().doubleValue() + 1.0d);
        if (i <= 1000000) {
            a7hVar.G("runtime.counter", new pal(Double.valueOf(i)));
        } else {
            dmk.n("Instructions allowed exceeded");
        }
    }

    public abstract void b(ArrayList arrayList);
}
