package defpackage;

import com.socure.docv.capturesdk.api.Keys;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class l81 implements Continuation, v85, Serializable {
    private final Continuation<Object> completion;

    public l81(Continuation continuation) {
        this.completion = continuation;
    }

    public Continuation<Unit> create(Continuation<?> continuation) {
        continuation.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // defpackage.v85
    public v85 getCallerFrame() {
        Continuation<Object> continuation = this.completion;
        if (continuation instanceof v85) {
            return (v85) continuation;
        }
        return null;
    }

    public final Continuation<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        Object obj;
        Integer num;
        int i2;
        kw5 kw5Var = (kw5) getClass().getAnnotation(kw5.class);
        String str2 = null;
        if (kw5Var == null || kw5Var.v() < 1) {
            return null;
        }
        int i3 = -1;
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(this);
            if (obj2 instanceof Integer) {
                num = (Integer) obj2;
            } else {
                num = null;
            }
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            i = i2 - 1;
        } catch (Exception unused) {
            i = -1;
        }
        if (i >= 0) {
            i3 = kw5Var.l()[i];
        }
        yjc.a.getClass();
        x99 x99Var = yjc.c;
        x99 x99Var2 = yjc.b;
        if (x99Var == null) {
            try {
                x99 x99Var3 = new x99(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(Keys.KEY_NAME, null), 10);
                yjc.c = x99Var3;
                x99Var = x99Var3;
            } catch (Exception unused2) {
                yjc.c = x99Var2;
                x99Var = x99Var2;
            }
        }
        if (x99Var != x99Var2 && (method = (Method) x99Var.b) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = (Method) x99Var.c) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = (Method) x99Var.d;
            if (method3 != null) {
                obj = method3.invoke(invoke2, null);
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str2 = (String) obj;
            }
        }
        if (str2 == null) {
            str = kw5Var.c();
        } else {
            str = str2 + '/' + kw5Var.c();
        }
        return new StackTraceElement(str, kw5Var.m(), kw5Var.f(), i3);
    }

    public abstract Object invokeSuspend(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.Continuation, java.lang.Object, kotlin.coroutines.Continuation<java.lang.Object>] */
    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Object invokeSuspend;
        while (true) {
            l81 l81Var = this;
            ?? r0 = l81Var.completion;
            r0.getClass();
            try {
                invokeSuspend = l81Var.invokeSuspend(obj);
            } catch (Throwable th) {
                Result.Companion companion = Result.INSTANCE;
                obj = Result.m882constructorimpl(ResultKt.createFailure(th));
            }
            if (invokeSuspend == u85.COROUTINE_SUSPENDED) {
                return;
            }
            obj = Result.m882constructorimpl(invokeSuspend);
            l81Var.releaseIntercepted();
            if (r0 instanceof l81) {
                this = r0;
            } else {
                r0.resumeWith(obj);
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        continuation.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
