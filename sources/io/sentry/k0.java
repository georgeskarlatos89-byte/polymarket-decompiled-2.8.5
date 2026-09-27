package io.sentry;

import defpackage.dw8;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class k0 implements ThreadFactory {
    public final /* synthetic */ int a;
    public int b;

    public /* synthetic */ k0(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("SentryHostnameCache-");
                int i = this.b;
                this.b = i + 1;
                sb.append(i);
                Thread thread = new Thread(runnable, sb.toString());
                thread.setDaemon(true);
                return thread;
            case 1:
                StringBuilder sb2 = new StringBuilder("SentryExecutorServiceThreadFactory-");
                int i2 = this.b;
                this.b = i2 + 1;
                sb2.append(i2);
                dw8 dw8Var = new dw8(runnable, sb2.toString(), 2);
                dw8Var.setDaemon(true);
                return dw8Var;
            case 2:
                runnable.getClass();
                StringBuilder sb3 = new StringBuilder("SentryReplayIntegration-");
                int i3 = this.b;
                this.b = i3 + 1;
                sb3.append(i3);
                Thread thread2 = new Thread(runnable, sb3.toString());
                thread2.setDaemon(true);
                return thread2;
            case 3:
                runnable.getClass();
                StringBuilder sb4 = new StringBuilder("SentryReplayPersister-");
                int i4 = this.b;
                this.b = i4 + 1;
                sb4.append(i4);
                Thread thread3 = new Thread(runnable, sb4.toString());
                thread3.setDaemon(true);
                return thread3;
            default:
                StringBuilder sb5 = new StringBuilder("SentryAsyncConnection-");
                int i5 = this.b;
                this.b = i5 + 1;
                sb5.append(i5);
                Thread thread4 = new Thread(runnable, sb5.toString());
                thread4.setDaemon(true);
                return thread4;
        }
    }
}
