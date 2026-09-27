package defpackage;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class pke extends i5 {
    public final /* synthetic */ int b;
    public final lke c;

    public /* synthetic */ pke(lke lkeVar, int i) {
        this.b = i;
        this.c = lkeVar;
    }

    @Override // defpackage.o1, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.b;
        lke lkeVar = this.c;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object obj2 = lkeVar.get(entry.getKey());
                    if (obj2 != null) {
                        return Intrinsics.areEqual(obj2, entry.getValue());
                    }
                    if (entry.getValue() == null) {
                        if (lkeVar.f.containsKey(entry.getKey())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return lkeVar.f.containsKey(obj);
        }
    }

    @Override // defpackage.o1
    public final int getSize() {
        int i = this.b;
        lke lkeVar = this.c;
        switch (i) {
            case 0:
                return lkeVar.f.c();
            default:
                return lkeVar.f.c();
        }
    }

    @Override // defpackage.i5, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.b;
        lke lkeVar = this.c;
        switch (i) {
            case 0:
                return new qke(lkeVar, 0);
            default:
                return new qke(lkeVar, 1);
        }
    }
}
