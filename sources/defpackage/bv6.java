package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class bv6 {
    public boolean b;
    public boolean c;
    public boolean a = true;
    private final Queue<Runnable> d = new ArrayDeque();

    /* JADX WARN: Removed duplicated region for block: B:17:0x0020 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:7:0x0007, B:8:0x0009, B:10:0x0011, B:12:0x0015, B:17:0x0020, B:20:0x002a), top: B:6:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x001f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z;
        if (this.c) {
            return;
        }
        try {
            this.c = true;
            while (!this.d.isEmpty()) {
                if (!this.b && this.a) {
                    z = false;
                    if (z) {
                        break;
                    }
                    Runnable poll = this.d.poll();
                    if (poll != null) {
                        poll.run();
                    }
                }
                z = true;
                if (z) {
                }
            }
        } finally {
            this.c = false;
        }
    }

    public final void b(Runnable runnable) {
        if (this.d.offer(runnable)) {
            a();
        } else {
            dmk.n("cannot enqueue any more runnables");
        }
    }
}
