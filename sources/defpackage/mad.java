package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class mad {
    public boolean a;
    public Bundle b;
    public boolean c;
    public boolean d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public mad(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        this.a = true;
        this.c = true;
        this.e = iconCompat;
        this.f = tad.b(charSequence);
        this.g = pendingIntent;
        this.b = bundle;
        this.h = null;
        this.a = true;
        this.c = true;
        this.d = false;
    }

    public nad a() {
        boolean z = this.d;
        Object obj = this.g;
        azf[] azfVarArr = null;
        if (!z || ((PendingIntent) obj) != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = (ArrayList) this.h;
            if (arrayList3 != null) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    azf azfVar = (azf) it.next();
                    azfVar.getClass();
                    arrayList2.add(azfVar);
                }
            }
            if (!arrayList.isEmpty()) {
            }
            if (!arrayList2.isEmpty()) {
                azfVarArr = (azf[]) arrayList2.toArray(new azf[arrayList2.size()]);
            }
            return new nad((IconCompat) this.e, (CharSequence) this.f, (PendingIntent) obj, this.b, azfVarArr, this.a, this.c, this.d);
        }
        dmk.s("Contextual Actions must contain a valid PendingIntent");
        return null;
    }

    public void b() {
        ngg nggVar = (ngg) this.e;
        if (nggVar.getLifecycle().b() == n6b.INITIALIZED) {
            if (!this.a) {
                ((gpf) this.f).invoke();
                nggVar.getLifecycle().a(new j7(this, 8));
                this.a = true;
                return;
            }
            dmk.n("SavedStateRegistry was already attached.");
            return;
        }
        dmk.n("Restarter must be created only during owner's initialization stage");
    }

    public mad(ngg nggVar, gpf gpfVar) {
        this.e = nggVar;
        this.f = gpfVar;
        this.g = new Object();
        this.h = new LinkedHashMap();
        this.d = true;
    }
}
