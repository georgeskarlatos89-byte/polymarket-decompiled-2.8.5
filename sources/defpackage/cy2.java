package defpackage;

import android.os.SystemClock;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.sentry.android.core.anr.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class cy2 {
    public long a;
    public long b;
    public Object c;

    public cy2(List list) {
        this.c = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (fVar != null) {
                ((ArrayList) this.c).add(fVar);
            }
        }
        Collections.sort((ArrayList) this.c);
        if (!((ArrayList) this.c).isEmpty()) {
            this.a = ((f) ((ArrayList) this.c).get(0)).b;
            this.b = ((f) m51.h(1, (ArrayList) this.c)).b + 10000;
        } else {
            this.a = 0L;
            this.b = 0L;
        }
    }

    public synchronized Object a(Object obj) {
        Object obj2;
        dxb dxbVar = (dxb) ((LinkedHashMap) this.c).get(obj);
        if (dxbVar != null) {
            obj2 = dxbVar.a;
        } else {
            obj2 = null;
        }
        return obj2;
    }

    public int b() {
        if (!((ey2) this.c).c()) {
            return 700;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.b;
        if (j == -1) {
            this.b = uptimeMillis;
            j = uptimeMillis;
        }
        long j2 = uptimeMillis - j;
        if (j2 <= 120000) {
            return 1000;
        }
        if (j2 <= AudioConstants.MAX_RECORDING_DURATION_MS) {
            return 2000;
        }
        return 4000;
    }

    public int c() {
        boolean c = ((ey2) this.c).c();
        long j = this.a;
        if (!c) {
            if (j <= 0) {
                return 10000;
            }
            return Math.min((int) j, 10000);
        }
        if (j <= 0) {
            return 1800000;
        }
        return Math.min((int) j, 1800000);
    }

    public int d(Object obj) {
        return 1;
    }

    public synchronized Object f(Object obj, Object obj2) {
        dxb dxbVar;
        int d = d(obj2);
        long j = d;
        Object obj3 = null;
        if (j >= this.a) {
            e(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.b += j;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
        if (obj2 == null) {
            dxbVar = null;
        } else {
            dxbVar = new dxb(obj2, d);
        }
        dxb dxbVar2 = (dxb) linkedHashMap.put(obj, dxbVar);
        if (dxbVar2 != null) {
            this.b -= dxbVar2.b;
            if (!dxbVar2.a.equals(obj2)) {
                e(obj, dxbVar2.a);
            }
        }
        h(this.a);
        if (dxbVar2 != null) {
            obj3 = dxbVar2.a;
        }
        return obj3;
    }

    public void g(Exception exc) {
        boolean z;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.c) == null) {
            this.c = exc;
        }
        if (this.a == -9223372036854775807L) {
            synchronized (jz5.j0) {
                if (jz5.l0 > 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (!z) {
                this.a = 200 + elapsedRealtime;
            }
        }
        long j = this.a;
        if (j != -9223372036854775807L && elapsedRealtime >= j) {
            Exception exc2 = (Exception) this.c;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.c;
            this.c = null;
            this.a = -9223372036854775807L;
            this.b = -9223372036854775807L;
            throw exc3;
        }
        this.b = elapsedRealtime + 50;
    }

    public synchronized void h(long j) {
        while (this.b > j) {
            Iterator it = ((LinkedHashMap) this.c).entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            dxb dxbVar = (dxb) entry.getValue();
            this.b -= dxbVar.b;
            Object key = entry.getKey();
            it.remove();
            e(key, dxbVar.a);
        }
    }

    public void e(Object obj, Object obj2) {
    }

    public cy2(long j) {
        this.c = new LinkedHashMap(100, 0.75f, true);
        this.a = j;
    }

    public cy2() {
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }
}
