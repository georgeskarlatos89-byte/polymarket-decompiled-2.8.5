package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class bp0 {
    public volatile int a;

    static {
        AtomicIntegerFieldUpdater.newUpdater(bp0.class, "a");
    }

    public final boolean a() {
        if (this.a != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return String.valueOf(a());
    }
}
