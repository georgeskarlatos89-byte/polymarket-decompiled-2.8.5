package defpackage;

import android.os.SystemClock;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class pul implements Runnable {
    public final long a;
    public final long b;
    public final boolean c;
    public final /* synthetic */ iwl d;

    public pul(iwl iwlVar, boolean z) {
        Objects.requireNonNull(iwlVar);
        this.d = iwlVar;
        this.a = System.currentTimeMillis();
        this.b = SystemClock.elapsedRealtime();
        this.c = z;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        iwl iwlVar = this.d;
        if (iwlVar.d) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e) {
            iwlVar.b(e, false, this.c);
            b();
        }
    }

    public void b() {
    }
}
