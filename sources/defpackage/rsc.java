package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class rsc implements ThreadFactory {
    public final String a;
    public final ThreadFactory b = Executors.defaultThreadFactory();

    public rsc(String str) {
        this.a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.b.newThread(new h9(runnable, 5));
        newThread.setName(this.a);
        return newThread;
    }
}
