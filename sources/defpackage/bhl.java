package defpackage;

import java.io.File;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class bhl {
    public static final vl4 a = new vl4(new lm4(5), false, -1003162420);

    public static final boolean a(bdb bdbVar) {
        bdbVar.getClass();
        String countryCode = bdbVar.a.getCountryCode();
        s95.Companion.getClass();
        return !Intrinsics.areEqual(countryCode, s95.b.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(File file, Function1 function1, q55 q55Var) {
        q08 q08Var;
        int i;
        try {
            if (q55Var instanceof q08) {
                q08 q08Var2 = (q08) q55Var;
                int i2 = q08Var2.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    q08Var2.m = i2 - Integer.MIN_VALUE;
                    q08Var = q08Var2;
                    Object obj = q08Var.l;
                    u85 u85Var = u85.COROUTINE_SUSPENDED;
                    i = q08Var.m;
                    if (i == 0) {
                        if (i == 1) {
                            File file2 = q08Var.k;
                            ResultKt.a(obj);
                            return obj;
                        }
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.a(obj);
                    q08Var.k = file;
                    q08Var.m = 1;
                    Object invoke = function1.invoke(q08Var);
                    if (invoke == u85Var) {
                        return u85Var;
                    }
                    return invoke;
                }
            }
            if (i == 0) {
            }
        } catch (IOException e) {
            if (!(e instanceof e95)) {
                file.getClass();
                if (file.exists()) {
                    if (file.isFile()) {
                        if (file.canRead()) {
                            if (file.canWrite()) {
                                throw vgl.i(file, e);
                            }
                            throw vgl.i(file, e);
                        }
                        if (file.canWrite()) {
                            throw vgl.i(file, e);
                        }
                        throw vgl.i(file, e);
                    }
                    if (file.canRead()) {
                        if (file.canWrite()) {
                            throw vgl.i(file, e);
                        }
                        throw vgl.i(file, e);
                    }
                    if (file.canWrite()) {
                        throw vgl.i(file, e);
                    }
                    throw vgl.i(file, e);
                }
                throw vgl.i(file, e);
            }
            throw e;
        }
        q08Var = new q55(q55Var);
        Object obj2 = q08Var.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = q08Var.m;
    }
}
