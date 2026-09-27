package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.functions.Function1;
import okhttp3.Call;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class an0 implements Future {
    public final Call a;
    public final Function1 b;
    public volatile LinkedHashMap c;
    public volatile boolean d;
    public volatile Throwable e;
    public final Object f = new Object();

    public an0(Call call, t36 t36Var) {
        this.a = call;
        this.b = t36Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x001e, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0025, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(LinkedHashMap linkedHashMap) {
        try {
            if (!this.d) {
                this.c = linkedHashMap;
                synchronized (this.f) {
                    this.d = true;
                    Function1 function1 = this.b;
                    if (function1 != null) {
                        function1.invoke(linkedHashMap);
                    }
                    this.f.notifyAll();
                }
            }
        } finally {
        }
    }

    public final synchronized void b(Exception exc) {
        try {
            exc.getClass();
            if (!this.d) {
                this.e = exc;
                synchronized (this.f) {
                    this.d = true;
                    this.f.notifyAll();
                }
            }
        } finally {
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Call call = this.a;
        if (call != null) {
            call.cancel();
            return true;
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        long nanos = timeUnit.toNanos(j);
        long nanoTime = System.nanoTime() + nanos;
        synchronized (this.f) {
            while (!this.d && nanos > 0) {
                TimeUnit.NANOSECONDS.timedWait(this.f, nanos);
                nanos = nanoTime - System.nanoTime();
            }
        }
        if (this.d) {
            if (this.e == null) {
                LinkedHashMap linkedHashMap = this.c;
                if (linkedHashMap != null) {
                    return linkedHashMap;
                }
                throw new ExecutionException(new NullPointerException("Future value must not be null"));
            }
            throw new ExecutionException(this.e);
        }
        throw new TimeoutException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        Call call = this.a;
        if (call != null) {
            return call.isCanceled();
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.d;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        synchronized (this.f) {
            while (!this.d) {
                this.f.wait();
            }
        }
        if (this.e == null) {
            LinkedHashMap linkedHashMap = this.c;
            if (linkedHashMap != null) {
                return linkedHashMap;
            }
            throw new ExecutionException(new NullPointerException("Future value must not be null"));
        }
        throw new ExecutionException(this.e);
    }
}
