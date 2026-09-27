package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class fp0 {
    public volatile Object a;

    static {
        AtomicReferenceFieldUpdater.newUpdater(fp0.class, Object.class, "a");
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
