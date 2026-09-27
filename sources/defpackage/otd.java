package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class otd {
    private final e8a invalidateCallbackTracker = new e8a(new ajd(16));

    public final boolean getInvalid() {
        return this.invalidateCallbackTracker.d;
    }

    public final int getInvalidateCallbackCount$paging_common() {
        return this.invalidateCallbackTracker.c.size();
    }

    public boolean getJumpingSupported() {
        return false;
    }

    public boolean getKeyReuseSupported() {
        return false;
    }

    public abstract Object getRefreshKey(ptd ptdVar);

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invalidate() {
        boolean z;
        e8a e8aVar = this.invalidateCallbackTracker;
        boolean z2 = true;
        if (!e8aVar.d) {
            synchronized (e8aVar.b) {
                if (!e8aVar.d) {
                    e8aVar.d = true;
                    List M0 = CollectionsKt.M0(e8aVar.c);
                    e8aVar.c.clear();
                    ajd ajdVar = e8aVar.a;
                    Iterator it = M0.iterator();
                    while (it.hasNext()) {
                        ajdVar.invoke(it.next());
                    }
                    z = true;
                }
            }
            if (!z) {
                if (Build.ID == null || !Log.isLoggable("Paging", 3)) {
                    z2 = false;
                }
                if (z2) {
                    toString();
                    return;
                }
                return;
            }
            return;
        }
        z = false;
        if (!z) {
        }
    }

    public abstract Object load(ktd ktdVar, Continuation continuation);

    public final void registerInvalidatedCallback(Function0<Unit> function0) {
        boolean z;
        function0.getClass();
        e8a e8aVar = this.invalidateCallbackTracker;
        e8aVar.getClass();
        if (e8aVar.d) {
            e8aVar.a.invoke(function0);
            return;
        }
        synchronized (e8aVar.b) {
            if (e8aVar.d) {
                z = true;
            } else {
                e8aVar.c.add(function0);
                z = false;
            }
        }
        if (z) {
            e8aVar.a.invoke(function0);
        }
    }

    public final void unregisterInvalidatedCallback(Function0<Unit> function0) {
        function0.getClass();
        e8a e8aVar = this.invalidateCallbackTracker;
        synchronized (e8aVar.b) {
            e8aVar.c.remove(function0);
        }
    }
}
