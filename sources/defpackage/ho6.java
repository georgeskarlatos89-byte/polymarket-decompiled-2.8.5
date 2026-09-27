package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class ho6 implements ec0 {
    public static final /* synthetic */ vka[] b = {new vcf(ho6.class, "annotations", "getAnnotations()Ljava/util/List;", 0)};
    public final jqb a;

    /* JADX WARN: Type inference failed for: r0v0, types: [jqb, iqb] */
    public ho6(azh azhVar, Function0 function0) {
        azhVar.getClass();
        this.a = new iqb((nqb) azhVar, function0);
    }

    @Override // defpackage.ec0
    public final /* bridge */ sb0 A0(xl8 xl8Var) {
        return zdn.b(this, xl8Var);
    }

    @Override // defpackage.ec0
    public boolean isEmpty() {
        b[0].getClass();
        return ((List) this.a.invoke()).isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b[0].getClass();
        return ((List) this.a.invoke()).iterator();
    }

    @Override // defpackage.ec0
    public final /* bridge */ boolean p0(xl8 xl8Var) {
        return zdn.c(this, xl8Var);
    }
}
