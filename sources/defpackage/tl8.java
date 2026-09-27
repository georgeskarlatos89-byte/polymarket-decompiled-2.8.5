package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class tl8 extends b3j {
    public b3j a;

    public tl8(b3j b3jVar) {
        b3jVar.getClass();
        this.a = b3jVar;
    }

    @Override // defpackage.b3j
    public final void awaitSignal(Condition condition) {
        condition.getClass();
        this.a.awaitSignal(condition);
    }

    @Override // defpackage.b3j
    public final void cancel() {
        this.a.cancel();
    }

    @Override // defpackage.b3j
    public final b3j clearDeadline() {
        return this.a.clearDeadline();
    }

    @Override // defpackage.b3j
    public final b3j clearTimeout() {
        return this.a.clearTimeout();
    }

    @Override // defpackage.b3j
    public final long deadlineNanoTime() {
        return this.a.deadlineNanoTime();
    }

    @Override // defpackage.b3j
    public final boolean hasDeadline() {
        return this.a.hasDeadline();
    }

    @Override // defpackage.b3j
    public final void throwIfReached() {
        this.a.throwIfReached();
    }

    @Override // defpackage.b3j
    public final b3j timeout(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.a.timeout(j, timeUnit);
    }

    @Override // defpackage.b3j
    public final long timeoutNanos() {
        return this.a.timeoutNanos();
    }

    @Override // defpackage.b3j
    public final void waitUntilNotified(Object obj) {
        obj.getClass();
        this.a.waitUntilNotified(obj);
    }

    @Override // defpackage.b3j
    public final b3j deadlineNanoTime(long j) {
        return this.a.deadlineNanoTime(j);
    }
}
