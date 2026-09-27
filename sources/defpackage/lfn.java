package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class lfn {
    public static final void a(vl4 vl4Var, pq4 pq4Var, int i) {
        int i2;
        boolean z;
        sr8 sr8Var = (sr8) pq4Var;
        sr8Var.g0(-1677843913);
        if (sr8Var.j(vl4Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sr8Var.V(i3 & 1, z)) {
            vl4Var.invoke(sr8Var, Integer.valueOf(i3 & 14));
        } else {
            sr8Var.Y();
        }
        nrf u = sr8Var.u();
        if (u != null) {
            u.d = new qm(vl4Var, i, 19);
        }
    }

    public static boolean b(String str, String str2) {
        char c;
        int length = str.length();
        if (str != str2) {
            if (length == str2.length()) {
                for (int i = 0; i < length; i++) {
                    if (str.charAt(i) == str2.charAt(i) || ((c = (char) ((r3 | ' ') - 97)) < 26 && c == ((char) ((r4 | ' ') - 97)))) {
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static String c(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt >= 'A' && charAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'A' && c <= 'Z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static String d(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'a' && c <= 'z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static int e(Set set) {
        int i;
        int i2 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return i2;
    }

    public static boolean f(uzg uzgVar, Collection collection) {
        collection.getClass();
        if (collection instanceof wol) {
            collection = ((wol) collection).zza();
        }
        boolean z = false;
        if ((collection instanceof Set) && collection.size() > uzgVar.size()) {
            Iterator<E> it = uzgVar.iterator();
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            z |= uzgVar.remove(it2.next());
        }
        return z;
    }
}
