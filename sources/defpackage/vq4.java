package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class vq4 extends e0 {
    public final List e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vq4(aga agaVar, List list) {
        super(agaVar, r0, r2 != null ? r2.c : 0);
        int i;
        agaVar.getClass();
        list.getClass();
        e0 e0Var = (e0) CollectionsKt.firstOrNull(list);
        if (e0Var != null) {
            i = e0Var.b;
        } else {
            i = 0;
        }
        e0 e0Var2 = (e0) CollectionsKt.S(list);
        this.e = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e0 e0Var3 = (e0) it.next();
            if (e0Var3 != null) {
                e0Var3.d = this;
            }
        }
    }

    @Override // defpackage.e0
    public final List a() {
        return this.e;
    }
}
