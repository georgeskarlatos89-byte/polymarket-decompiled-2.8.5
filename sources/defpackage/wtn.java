package defpackage;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.a;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class wtn {
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x005e  */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.ranges.a, kotlin.ranges.IntRange] */
    /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.ranges.a, kotlin.ranges.IntRange] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static bpb c(v0h v0hVar) {
        bpb bpbVar;
        v0hVar.getClass();
        int i = v0hVar.b;
        bpb c = r7n.c(v0hVar);
        aga agaVar = h8m.p;
        if (c != null) {
            v0h b = c.a.b();
            if (Intrinsics.areEqual(b.p(), agaVar)) {
                b = b.b();
            }
            bpb b2 = r7n.b(b);
            if (b2 != null) {
                v0h v0hVar2 = b2.a;
                bpbVar = new bpb(v0hVar2, (Collection) CollectionsKt.plus(CollectionsKt.i0(c.b, b2.b), new wwg(new a(i, v0hVar2.b + 1, 1), b8m.s)), (Collection) CollectionsKt.i0(c.c, b2.c));
                if (bpbVar != null) {
                    bpb b3 = r7n.b(v0hVar);
                    if (b3 == null) {
                        return null;
                    }
                    v0h v0hVar3 = b3.a;
                    v0h b4 = v0hVar3.b();
                    if (Intrinsics.areEqual(b4.p(), agaVar)) {
                        b4 = b4.b();
                    }
                    if (Intrinsics.areEqual(b4.p(), h8m.i) && Intrinsics.areEqual(b4.t(), h8m.j)) {
                        v0hVar3 = b4.b();
                    }
                    return new bpb(v0hVar3, CollectionsKt.plus(b3.b, new wwg(new a(i, v0hVar3.b + 1, 1), b8m.t)), b3.c);
                }
                return bpbVar;
            }
        }
        bpbVar = null;
        if (bpbVar != null) {
        }
    }

    public abstract boolean b(Object obj);

    public abstract Object d();

    public void a(Object obj) {
    }
}
