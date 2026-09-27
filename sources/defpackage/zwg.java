package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class zwg implements SerialDescriptor, zt2 {
    public final String a;
    public final o5l b;
    public final int c;
    public final List d;
    public final HashSet e;
    public final String[] f;
    public final SerialDescriptor[] g;
    public final List[] h;
    public final boolean[] i;
    public final Map j;
    public final SerialDescriptor[] k;
    public final Lazy l;

    public zwg(String str, o5l o5lVar, int i, List list, m44 m44Var) {
        list.getClass();
        this.a = str;
        this.b = o5lVar;
        this.c = i;
        this.d = m44Var.b;
        ArrayList arrayList = m44Var.c;
        this.e = CollectionsKt.K0(arrayList);
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f = strArr;
        this.g = dwm.b(m44Var.e);
        this.h = (List[]) m44Var.f.toArray(new List[0]);
        this.i = CollectionsKt.G0(m44Var.g);
        strArr.getClass();
        sl0 sl0Var = new sl0(new ke(strArr, 13), 2);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.w(sl0Var));
        Iterator it = sl0Var.iterator();
        while (true) {
            c cVar = (c) it;
            if (cVar.a.hasNext()) {
                IndexedValue indexedValue = (IndexedValue) cVar.next();
                arrayList2.add(new Pair(indexedValue.b, Integer.valueOf(indexedValue.a)));
            } else {
                this.j = d1c.n(arrayList2);
                this.k = dwm.b(list);
                this.l = LazyKt.lazy(new gpf(this, 21));
                return;
            }
        }
    }

    @Override // defpackage.zt2
    public final Set a() {
        return this.e;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        str.getClass();
        Integer num = (Integer) this.j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d() {
        return this.c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e(int i) {
        return this.f[i];
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zwg) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (Intrinsics.areEqual(this.a, serialDescriptor.h()) && Arrays.equals(this.k, ((zwg) obj).k)) {
                    int d = serialDescriptor.d();
                    int i = this.c;
                    if (i == d) {
                        for (int i2 = 0; i2 < i; i2++) {
                            SerialDescriptor[] serialDescriptorArr = this.g;
                            if (Intrinsics.areEqual(serialDescriptorArr[i2].h(), serialDescriptor.g(i2).h()) && Intrinsics.areEqual(serialDescriptorArr[i2].getKind(), serialDescriptor.g(i2).getKind())) {
                            }
                        }
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List f(int i) {
        return this.h[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor g(int i) {
        return this.g[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final o5l getKind() {
        return this.b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        return this.i[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return eqn.g(this);
    }
}
