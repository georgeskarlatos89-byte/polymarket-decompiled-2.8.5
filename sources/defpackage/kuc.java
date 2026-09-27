package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.collection.SparseArrayCompat;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class kuc extends ztc implements Iterable, xja {
    public static final /* synthetic */ int h = 0;
    public final x8j g;

    public kuc(bxc bxcVar) {
        super(bxcVar);
        this.g = new x8j(this);
    }

    @Override // defpackage.ztc
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof kuc) && super.equals(obj)) {
                x8j x8jVar = this.g;
                int n = ((SparseArrayCompat) x8jVar.d).n();
                x8j x8jVar2 = ((kuc) obj).g;
                if (n == ((SparseArrayCompat) x8jVar2.d).n() && x8jVar.b == x8jVar2.b) {
                    Iterator it = lwg.b(new fgh((SparseArrayCompat) x8jVar.d)).iterator();
                    while (it.hasNext()) {
                        ztc ztcVar = (ztc) it.next();
                        if (!Intrinsics.areEqual(ztcVar, ((SparseArrayCompat) x8jVar2.d).e(ztcVar.b.b))) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.ztc
    public final ytc h(x99 x99Var) {
        ytc h2 = super.h(x99Var);
        x8j x8jVar = this.g;
        x8jVar.getClass();
        return x8jVar.v(h2, x99Var, false, (kuc) x8jVar.c);
    }

    @Override // defpackage.ztc
    public final int hashCode() {
        x8j x8jVar = this.g;
        int i = x8jVar.b;
        SparseArrayCompat sparseArrayCompat = (SparseArrayCompat) x8jVar.d;
        int n = sparseArrayCompat.n();
        for (int i2 = 0; i2 < n; i2++) {
            i = (((i * 31) + sparseArrayCompat.j(i2)) * 31) + ((ztc) sparseArrayCompat.o(i2)).hashCode();
        }
        return i;
    }

    @Override // defpackage.ztc
    public final void i(Context context, AttributeSet attributeSet) {
        String valueOf;
        context.getClass();
        attributeSet.getClass();
        super.i(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, tlf.d);
        obtainAttributes.getClass();
        int resourceId = obtainAttributes.getResourceId(0, 0);
        x8j x8jVar = this.g;
        x8jVar.w(resourceId);
        int i = x8jVar.b;
        if (i <= 16777215) {
            valueOf = String.valueOf(i);
        } else {
            try {
                valueOf = context.getResources().getResourceName(i);
                valueOf.getClass();
            } catch (Resources.NotFoundException unused) {
                valueOf = String.valueOf(i);
            }
        }
        x8jVar.e = valueOf;
        obtainAttributes.recycle();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        x8j x8jVar = this.g;
        x8jVar.getClass();
        return new nwc(x8jVar);
    }

    public final ytc l(x99 x99Var, ztc ztcVar) {
        ztcVar.getClass();
        return this.g.v(super.h(x99Var), x99Var, true, ztcVar);
    }

    public final ytc m(String str, boolean z, ztc ztcVar) {
        ytc ytcVar;
        str.getClass();
        ztcVar.getClass();
        x8j x8jVar = this.g;
        x8jVar.getClass();
        kuc kucVar = (kuc) x8jVar.c;
        ytc g = kucVar.b.g(str);
        ArrayList arrayList = new ArrayList();
        Iterator it = kucVar.iterator();
        while (true) {
            nwc nwcVar = (nwc) it;
            ytcVar = null;
            if (!nwcVar.hasNext()) {
                break;
            }
            ztc ztcVar2 = (ztc) nwcVar.next();
            if (!Intrinsics.areEqual(ztcVar2, ztcVar)) {
                if (ztcVar2 instanceof kuc) {
                    ytcVar = ((kuc) ztcVar2).m(str, false, kucVar);
                } else {
                    ztcVar2.getClass();
                    ytcVar = ztcVar2.b.g(str);
                }
            }
            if (ytcVar != null) {
                arrayList.add(ytcVar);
            }
        }
        ytc ytcVar2 = (ytc) CollectionsKt.W(arrayList);
        kuc kucVar2 = kucVar.c;
        if (kucVar2 != null && z && !Intrinsics.areEqual(kucVar2, ztcVar)) {
            ytcVar = kucVar2.m(str, true, kucVar);
        }
        return (ytc) CollectionsKt.W(CollectionsKt.U(g, ytcVar2, ytcVar));
    }

    @Override // defpackage.ztc
    public final String toString() {
        ztc ztcVar;
        StringBuilder sb = new StringBuilder(super.toString());
        x8j x8jVar = this.g;
        String str = (String) x8jVar.f;
        x8jVar.getClass();
        if (str != null && !StringsKt.T(str)) {
            ztcVar = x8jVar.i(str, true);
        } else {
            ztcVar = null;
        }
        if (ztcVar == null) {
            ztcVar = x8jVar.h(x8jVar.b);
        }
        sb.append(" startDestination=");
        if (ztcVar == null) {
            String str2 = (String) x8jVar.f;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = (String) x8jVar.e;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(x8jVar.b));
                }
            }
        } else {
            sb.append("{");
            sb.append(ztcVar.toString());
            sb.append("}");
        }
        return sb.toString();
    }
}
