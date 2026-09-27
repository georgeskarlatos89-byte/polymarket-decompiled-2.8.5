package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class wra {
    public static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public static a30 a(String str) {
        boolean startsWith;
        Iterator it = a.iterator();
        while (it.hasNext()) {
            a30 a30Var = (a30) it.next();
            synchronized (a30Var) {
                startsWith = str.toLowerCase(Locale.US).startsWith("android-keystore://");
            }
            if (startsWith) {
                return a30Var;
            }
        }
        throw new GeneralSecurityException(k84.g("No KMS client does support: ", str));
    }
}
