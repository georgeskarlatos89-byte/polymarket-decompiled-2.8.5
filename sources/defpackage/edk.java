package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class edk {
    public static final boolean c = fdk.a;
    public final ArrayList a = new ArrayList();
    public boolean b = false;

    public final synchronized void a(long j, String str) {
        if (!this.b) {
            this.a.add(new ddk(str, j, SystemClock.elapsedRealtime()));
        } else {
            throw new IllegalStateException("Marker added to finished log");
        }
    }

    public final synchronized void b(String str) {
        long j;
        this.b = true;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            j = 0;
        } else {
            j = ((ddk) arrayList.get(arrayList.size() - 1)).c - ((ddk) arrayList.get(0)).c;
        }
        if (j <= 0) {
            return;
        }
        long j2 = ((ddk) this.a.get(0)).c;
        fdk.a("(%-4d ms) %s", Long.valueOf(j), str);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ddk ddkVar = (ddk) it.next();
            long j3 = ddkVar.c;
            fdk.a("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(ddkVar.b), ddkVar.a);
            j2 = j3;
        }
    }

    public final void finalize() {
        if (!this.b) {
            b("Request on the loose");
            fdk.b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }
}
