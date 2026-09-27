package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.reflect.jvm.internal.ReflectKCallable;
import kotlin.reflect.jvm.internal.ReflectKProperty;
import kotlin.reflect.jvm.internal.UtilKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class aun {
    public static void a(gp5 gp5Var) {
        if (gp5Var != null) {
            try {
                gp5Var.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final Field b(vka vkaVar) {
        vkaVar.getClass();
        ReflectKProperty<?> asReflectProperty = UtilKt.asReflectProperty(vkaVar);
        if (asReflectProperty != null) {
            return asReflectProperty.getJavaField();
        }
        return null;
    }

    public static final Method c(vja vjaVar) {
        Member member;
        jw2 caller;
        vjaVar.getClass();
        ReflectKCallable<?> asReflectCallable = UtilKt.asReflectCallable(vjaVar);
        if (asReflectCallable != null && (caller = asReflectCallable.getCaller()) != null) {
            member = caller.b();
        } else {
            member = null;
        }
        if (!(member instanceof Method)) {
            return null;
        }
        return (Method) member;
    }
}
