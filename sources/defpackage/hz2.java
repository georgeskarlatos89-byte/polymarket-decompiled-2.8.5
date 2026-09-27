package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class hz2 implements k5a {
    public final Object a;
    public final HashMap b;
    public final ndg c;
    public final b13 d;
    public final Context e;

    public hz2(Context context, Object obj, LinkedHashSet linkedHashSet) {
        ndg ndgVar = new ndg(27);
        this.a = new Object();
        this.b = new HashMap();
        this.c = ndgVar;
        this.e = context;
        if (obj instanceof b13) {
            this.d = (b13) obj;
        } else {
            ryb.b();
            this.d = new b13(new uhl(context, 16));
        }
        try {
            a(new ArrayList(linkedHashSet));
        } catch (q13 e) {
            if (e.getCause() instanceof p13) {
                throw ((p13) e.getCause());
            }
            throw new Exception(e);
        }
    }

    @Override // defpackage.k5a
    public final void a(List list) {
        HashSet hashSet;
        HashMap hashMap = new HashMap();
        synchronized (this.a) {
            hashSet = new HashSet(list);
            hashSet.removeAll(this.b.keySet());
        }
        try {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                hashMap.put(str, b(str));
            }
            synchronized (this.a) {
                try {
                    HashMap hashMap2 = new HashMap();
                    Iterator it2 = ((ArrayList) list).iterator();
                    while (it2.hasNext()) {
                        String str2 = (String) it2.next();
                        if (this.b.containsKey(str2)) {
                            hashMap2.put(str2, (jdi) this.b.get(str2));
                        } else {
                            hashMap2.put(str2, (jdi) hashMap.get(str2));
                        }
                    }
                    this.b.clear();
                    this.b.putAll(hashMap2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (RuntimeException | p13 e) {
            throw new Exception("Failed to create SupportedSurfaceCombination", e);
        }
    }

    public final jdi b(String str) {
        iw7 iw7Var;
        if (Build.VERSION.SDK_INT >= 35) {
            iw7Var = new mw7(this.e, str, this.d);
        } else {
            iw7Var = iw7.m0;
        }
        iw7 iw7Var2 = iw7Var;
        return new jdi(this.e, str, this.d, this.c, iw7Var2);
    }
}
