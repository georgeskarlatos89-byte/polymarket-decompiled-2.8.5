package defpackage;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import io.sentry.android.core.m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class sa {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();

    public final boolean a(int i, int i2, Intent intent) {
        da daVar;
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        pa paVar = (pa) this.e.get(str);
        if (paVar != null) {
            daVar = paVar.a;
        } else {
            daVar = null;
        }
        if (daVar != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                paVar.a.onActivityResult(paVar.b.parseResult(i2, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new ca(i2, intent));
        return true;
    }

    public abstract void b(int i, ga gaVar, Object obj, r9 r9Var);

    public final ra c(String str, ga gaVar, da daVar) {
        str.getClass();
        gaVar.getClass();
        e(str);
        this.e.put(str, new pa(gaVar, daVar));
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            daVar.onActivityResult(obj);
        }
        Bundle bundle = this.g;
        ca caVar = (ca) din.b(bundle, str, ca.class);
        if (caVar != null) {
            bundle.remove(str);
            daVar.onActivityResult(gaVar.parseResult(caVar.a, caVar.b));
        }
        return new ra(this, str, gaVar, 1);
    }

    public final ra d(String str, LifecycleOwner lifecycleOwner, ga gaVar, da daVar) {
        str.getClass();
        gaVar.getClass();
        daVar.getClass();
        p6b lifecycle = lifecycleOwner.getLifecycle();
        if (!lifecycle.b().a(n6b.STARTED)) {
            e(str);
            LinkedHashMap linkedHashMap = this.c;
            qa qaVar = (qa) linkedHashMap.get(str);
            if (qaVar == null) {
                qaVar = new qa(lifecycle);
            }
            na naVar = new na(this, str, daVar, gaVar, 0);
            qaVar.a.a(naVar);
            qaVar.b.add(naVar);
            linkedHashMap.put(str, qaVar);
            return new ra(this, str, gaVar, 0);
        }
        StringBuilder sb = new StringBuilder("LifecycleOwner ");
        sb.append(lifecycleOwner);
        n6b b = lifecycle.b();
        sb.append(" is attempting to register while current state is ");
        sb.append(b);
        sb.append(". LifecycleOwners must call register before they are STARTED.");
        throw new IllegalStateException(sb.toString().toString());
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        Iterator it = lwg.e(new oa(0)).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            Integer valueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.a;
            if (!linkedHashMap2.containsKey(valueOf)) {
                int intValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(intValue), str);
                linkedHashMap.put(str, Integer.valueOf(intValue));
                return;
            }
        }
        ahh.i("Sequence contains no element matching the predicate.");
    }

    public final void f(String str) {
        Integer num;
        str.getClass();
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder s = ix2.s("Dropping pending result for request ", str, ": ");
            s.append(linkedHashMap.get(str));
            m0.p("ActivityResultRegistry", s.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            m0.p("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((ca) din.b(bundle, str, ca.class)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.c;
        qa qaVar = (qa) linkedHashMap2.get(str);
        if (qaVar != null) {
            ArrayList arrayList = qaVar.b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                qaVar.a.c((h7b) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
