package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class q6a implements jw2 {
    public final Method a;
    public final List b;
    public final Class c;

    public q6a(Method method, List list) {
        this.a = method;
        this.b = list;
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        this.c = returnType;
    }

    @Override // defpackage.jw2
    public final List a() {
        return this.b;
    }

    @Override // defpackage.jw2
    public final Member b() {
        return null;
    }

    @Override // defpackage.jw2
    public final boolean c() {
        return false;
    }

    public final void d(Object[] objArr) {
        objArr.getClass();
        List list = this.b;
        if (list.size() == objArr.length) {
            return;
        }
        StringBuilder sb = new StringBuilder("Callable expects ");
        sb.append(list.size());
        sb.append(" arguments, but ");
        dmk.v(ix2.i(objArr.length, " were provided.", sb));
    }

    @Override // defpackage.jw2
    public final Type getReturnType() {
        return this.c;
    }
}
