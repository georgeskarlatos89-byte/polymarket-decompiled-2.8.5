package defpackage;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class dzi implements ThreadFactory {
    public final /* synthetic */ ThreadFactory a;
    public final /* synthetic */ String b;
    public final /* synthetic */ AtomicLong c;
    public final /* synthetic */ Boolean d;
    public final /* synthetic */ Integer e;

    public dzi(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num) {
        this.a = threadFactory;
        this.b = str;
        this.c = atomicLong;
        this.d = bool;
        this.e = num;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.a.newThread(runnable);
        Objects.requireNonNull(newThread);
        String str = this.b;
        if (str != null) {
            AtomicLong atomicLong = this.c;
            Objects.requireNonNull(atomicLong);
            newThread.setName(String.format(Locale.ROOT, str, Long.valueOf(atomicLong.getAndIncrement())));
        }
        Boolean bool = this.d;
        if (bool != null) {
            newThread.setDaemon(bool.booleanValue());
        }
        Integer num = this.e;
        if (num != null) {
            newThread.setPriority(num.intValue());
        }
        return newThread;
    }
}
