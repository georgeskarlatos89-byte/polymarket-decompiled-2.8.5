package androidx.fragment.app;

import androidx.lifecycle.ViewModelStore;
import defpackage.dak;
import defpackage.ym8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class b0 extends dak {
    public static final ym8 h = new ym8(0);
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;

    public b0(boolean z) {
        this.e = z;
    }

    public final void A(String str, boolean z) {
        HashMap hashMap = this.c;
        b0 b0Var = (b0) hashMap.get(str);
        if (b0Var != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(b0Var.c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    b0Var.z((String) it.next(), true);
                }
            }
            b0Var.onCleared();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.d;
        ViewModelStore viewModelStore = (ViewModelStore) hashMap2.get(str);
        if (viewModelStore != null) {
            viewModelStore.a();
            hashMap2.remove(str);
        }
    }

    public final void B(o oVar) {
        if (this.g) {
            a0.L(2);
        } else if (this.b.remove(oVar.mWho) != null && a0.L(2)) {
            oVar.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && b0.class == obj.getClass()) {
                b0 b0Var = (b0) obj;
                if (this.b.equals(b0Var.b) && this.c.equals(b0Var.c) && this.d.equals(b0Var.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    @Override // defpackage.dak
    public final void onCleared() {
        if (a0.L(3)) {
            toString();
        }
        this.f = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public final void x(o oVar) {
        if (this.g) {
            a0.L(2);
            return;
        }
        String str = oVar.mWho;
        HashMap hashMap = this.b;
        if (!hashMap.containsKey(str)) {
            hashMap.put(oVar.mWho, oVar);
            if (a0.L(2)) {
                oVar.toString();
            }
        }
    }

    public final void z(String str, boolean z) {
        a0.L(3);
        A(str, z);
    }
}
