package defpackage;

import java.util.Arrays;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.BufferOverflow;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class j5 {
    public k5[] a;
    public int b;
    public int c;
    public cbi d;

    public final k5 e() {
        k5 k5Var;
        cbi cbiVar;
        synchronized (this) {
            try {
                k5[] k5VarArr = this.a;
                if (k5VarArr == null) {
                    k5VarArr = h();
                    this.a = k5VarArr;
                } else if (this.b >= k5VarArr.length) {
                    Object[] copyOf = Arrays.copyOf(k5VarArr, k5VarArr.length * 2);
                    this.a = (k5[]) copyOf;
                    k5VarArr = (k5[]) copyOf;
                }
                int i = this.c;
                do {
                    k5Var = k5VarArr[i];
                    if (k5Var == null) {
                        k5Var = f();
                        k5VarArr[i] = k5Var;
                    }
                    i++;
                    if (i >= k5VarArr.length) {
                        i = 0;
                    }
                } while (!k5Var.a(this));
                this.c = i;
                this.b++;
                cbiVar = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (cbiVar != null) {
            cbiVar.x(1);
        }
        return k5Var;
    }

    public abstract k5 f();

    public abstract k5[] h();

    public final void i(k5 k5Var) {
        cbi cbiVar;
        int i;
        Continuation[] b;
        synchronized (this) {
            try {
                int i2 = this.b - 1;
                this.b = i2;
                cbiVar = this.d;
                if (i2 == 0) {
                    this.c = 0;
                }
                k5Var.getClass();
                b = k5Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation continuation : b) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m882constructorimpl(Unit.INSTANCE));
            }
        }
        if (cbiVar != null) {
            cbiVar.x(-1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [k3h, cbi] */
    public final cbi j() {
        cbi cbiVar;
        synchronized (this) {
            cbi cbiVar2 = this.d;
            cbiVar = cbiVar2;
            if (cbiVar2 == null) {
                int i = this.b;
                ?? k3hVar = new k3h(1, bd0.API_PRIORITY_OTHER, BufferOverflow.DROP_OLDEST);
                k3hVar.b(Integer.valueOf(i));
                this.d = k3hVar;
                cbiVar = k3hVar;
            }
        }
        return cbiVar;
    }
}
