package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class rua implements Future {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ rua(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        switch (this.a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                throw new ExecutionException((tva) obj);
            default:
                return obj;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        switch (this.a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                throw new ExecutionException((tva) obj);
            default:
                return obj;
        }
    }
}
