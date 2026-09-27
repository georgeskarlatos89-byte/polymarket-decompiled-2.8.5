package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class lgg {
    public final mad a;
    public ef0 b;

    public lgg(mad madVar) {
        this.a = madVar;
    }

    public final Bundle a(String str) {
        Bundle bundle;
        mad madVar = this.a;
        if (madVar.c) {
            Bundle bundle2 = madVar.b;
            if (bundle2 == null) {
                return null;
            }
            if (bundle2.containsKey(str)) {
                bundle = iyn.i(bundle2, str);
            } else {
                bundle = null;
            }
            bundle2.remove(str);
            if (bundle2.isEmpty()) {
                madVar.b = null;
            }
            return bundle;
        }
        dmk.n("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        return null;
    }

    public final kgg b(String str) {
        kgg kggVar;
        mad madVar = this.a;
        synchronized (((pf5) madVar.g)) {
            Iterator it = ((LinkedHashMap) madVar.h).entrySet().iterator();
            do {
                kggVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                kgg kggVar2 = (kgg) entry.getValue();
                if (Intrinsics.areEqual(str2, str)) {
                    kggVar = kggVar2;
                }
            } while (kggVar == null);
        }
        return kggVar;
    }

    public final void c(String str, kgg kggVar) {
        mad madVar = this.a;
        synchronized (((pf5) madVar.g)) {
            if (!((LinkedHashMap) madVar.h).containsKey(str)) {
                ((LinkedHashMap) madVar.h).put(str, kggVar);
            } else {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
        }
    }

    public final void d() {
        if (this.a.d) {
            ef0 ef0Var = this.b;
            if (ef0Var == null) {
                ef0Var = new ef0(this);
            }
            this.b = ef0Var;
            try {
                s5b.class.getDeclaredConstructor(null);
                ef0 ef0Var2 = this.b;
                if (ef0Var2 != null) {
                    ((LinkedHashSet) ef0Var2.b).add(s5b.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class " + s5b.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        }
        dmk.n("Can not perform this action after onSaveInstanceState");
    }
}
