package defpackage;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class jxh implements Runnable {
    public static final Object h = new Object();
    public final Executor a;
    public final sfd b;
    public final AtomicReference d;
    public final AtomicBoolean c = new AtomicBoolean(true);
    public Object e = h;
    public int f = -1;
    public boolean g = false;

    public jxh(AtomicReference atomicReference, Executor executor, sfd sfdVar) {
        this.d = atomicReference;
        this.a = executor;
        this.b = sfdVar;
    }

    public final void a(int i) {
        synchronized (this) {
            try {
                if (!this.c.get()) {
                    return;
                }
                if (i <= this.f) {
                    return;
                }
                this.f = i;
                if (this.g) {
                    return;
                }
                this.g = true;
                try {
                    this.a.execute(this);
                } catch (Throwable unused) {
                    synchronized (this) {
                        this.g = false;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this) {
            try {
                if (!this.c.get()) {
                    this.g = false;
                    return;
                }
                Object obj = this.d.get();
                int i = this.f;
                while (true) {
                    if (!Objects.equals(this.e, obj)) {
                        this.e = obj;
                        boolean z = obj instanceof ay0;
                        sfd sfdVar = this.b;
                        if (z) {
                            sfdVar.onError(null);
                        } else {
                            sfdVar.a(obj);
                        }
                    }
                    synchronized (this) {
                        try {
                            if (i == this.f || !this.c.get()) {
                                break;
                            }
                            obj = this.d.get();
                            i = this.f;
                        } finally {
                        }
                    }
                }
                this.g = false;
            } finally {
            }
        }
    }
}
