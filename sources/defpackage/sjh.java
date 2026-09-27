package defpackage;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class sjh extends wfj {
    public static final ml0 c = new ml0(6);
    public final /* synthetic */ int a;
    public final wfj b;

    public /* synthetic */ sjh(wfj wfjVar, int i) {
        this.a = i;
        this.b = wfjVar;
    }

    @Override // defpackage.wfj
    public final Object b(ufa ufaVar) {
        int i = this.a;
        wfj wfjVar = this.b;
        switch (i) {
            case 0:
                Date date = (Date) wfjVar.b(ufaVar);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            case 1:
                return new AtomicLong(((Number) wfjVar.b(ufaVar)).longValue());
            default:
                ArrayList arrayList = new ArrayList();
                ufaVar.beginArray();
                while (ufaVar.hasNext()) {
                    arrayList.add(Long.valueOf(((Number) wfjVar.b(ufaVar)).longValue()));
                }
                ufaVar.endArray();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
                }
                return atomicLongArray;
        }
    }

    @Override // defpackage.wfj
    public final void c(xga xgaVar, Object obj) {
        int i = this.a;
        wfj wfjVar = this.b;
        switch (i) {
            case 0:
                wfjVar.c(xgaVar, (Timestamp) obj);
                return;
            case 1:
                wfjVar.c(xgaVar, Long.valueOf(((AtomicLong) obj).get()));
                return;
            default:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                xgaVar.beginArray();
                int length = atomicLongArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    wfjVar.c(xgaVar, Long.valueOf(atomicLongArray.get(i2)));
                }
                xgaVar.endArray();
                return;
        }
    }
}
