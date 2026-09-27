package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class lbl implements ndl, scl {
    public final String a;
    public final HashMap b = new HashMap();

    public lbl(String str) {
        this.a = str;
    }

    @Override // defpackage.scl
    public final ndl a(String str) {
        HashMap hashMap = this.b;
        if (hashMap.containsKey(str)) {
            return (ndl) hashMap.get(str);
        }
        return ndl.e1;
    }

    @Override // defpackage.ndl
    public final ndl b(String str, a7h a7hVar, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new del(this.a);
        }
        return scl.c(this, new del(str), a7hVar, arrayList);
    }

    @Override // defpackage.scl
    public final void d(String str, ndl ndlVar) {
        HashMap hashMap = this.b;
        if (ndlVar == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, ndlVar);
        }
    }

    public abstract ndl e(a7h a7hVar, List list);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lbl)) {
            return false;
        }
        lbl lblVar = (lbl) obj;
        String str = this.a;
        if (str == null) {
            return false;
        }
        return str.equals(lblVar.a);
    }

    @Override // defpackage.scl
    public final boolean f(String str) {
        return this.b.containsKey(str);
    }

    public final int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // defpackage.ndl
    public final String zzc() {
        return this.a;
    }

    @Override // defpackage.ndl
    public final Double zzd() {
        return Double.valueOf(Double.NaN);
    }

    @Override // defpackage.ndl
    public final Boolean zze() {
        return Boolean.TRUE;
    }

    @Override // defpackage.ndl
    public final Iterator zzf() {
        return new hcl(this.b.keySet().iterator());
    }

    @Override // defpackage.ndl
    public ndl h() {
        return this;
    }
}
