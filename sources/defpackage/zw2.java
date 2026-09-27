package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class zw2 implements jw2 {
    public final Member a;
    public final Type b;
    public final Class c;
    public final List d;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
    
        if (r1 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zw2(Member member, Type type, Class cls, Type[] typeArr) {
        List e0;
        this.a = member;
        this.b = type;
        this.c = cls;
        if (cls != null) {
            sd7 sd7Var = new sd7(2);
            ArrayList arrayList = sd7Var.a;
            sd7Var.f(cls);
            sd7Var.i(typeArr);
            e0 = CollectionsKt.listOf(arrayList.toArray(new Type[arrayList.size()]));
        }
        e0 = ArraysKt.e0(typeArr);
        this.d = e0;
    }

    @Override // defpackage.jw2
    public final List a() {
        return this.d;
    }

    @Override // defpackage.jw2
    public final Member b() {
        return this.a;
    }

    @Override // defpackage.jw2
    public final boolean c() {
        return false;
    }

    public void d(Object[] objArr) {
        objArr.getClass();
        List list = this.d;
        if (list.size() == objArr.length) {
            return;
        }
        StringBuilder sb = new StringBuilder("Callable expects ");
        sb.append(list.size());
        sb.append(" arguments, but ");
        dmk.v(ix2.i(objArr.length, " were provided.", sb));
    }

    public final void e(Object obj) {
        if (obj != null && this.a.getDeclaringClass().isInstance(obj)) {
            return;
        }
        dmk.v("An object member requires the object instance passed as the first argument.");
    }

    @Override // defpackage.jw2
    public final Type getReturnType() {
        return this.b;
    }
}
