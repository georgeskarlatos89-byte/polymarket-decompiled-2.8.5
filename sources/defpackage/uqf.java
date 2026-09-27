package defpackage;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class uqf {
    public final LinkedHashMap a;
    public int b;

    public uqf(int i) {
        switch (i) {
            case 1:
                this.a = new LinkedHashMap();
                return;
            default:
                this.a = new LinkedHashMap();
                return;
        }
    }

    public void a() {
        Bitmap bitmap;
        this.b = 0;
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                tqf tqfVar = (tqf) CollectionsKt.firstOrNull(arrayList);
                if (tqfVar != null) {
                    bitmap = (Bitmap) tqfVar.b.get();
                } else {
                    bitmap = null;
                }
                if (bitmap == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = i2 - i;
                    if (((tqf) arrayList.get(i3)).b.get() == null) {
                        arrayList.remove(i3);
                        i++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    public void b() {
        km9 km9Var;
        int i = this.b;
        this.b = i + 1;
        if (i >= 10) {
            this.b = 0;
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) it.next();
                if (arrayList.size() <= 1) {
                    sqf sqfVar = (sqf) CollectionsKt.firstOrNull(arrayList);
                    if (sqfVar != null) {
                        km9Var = (km9) sqfVar.a.get();
                    } else {
                        km9Var = null;
                    }
                    if (km9Var == null) {
                        it.remove();
                    }
                } else {
                    int size = arrayList.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        int i4 = i3 - i2;
                        if (((sqf) arrayList.get(i4)).a.get() == null) {
                            arrayList.remove(i4);
                            i2++;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        it.remove();
                    }
                }
            }
        }
    }

    public void c(r9c r9cVar, km9 km9Var, Map map, long j) {
        LinkedHashMap linkedHashMap = this.a;
        Object obj = linkedHashMap.get(r9cVar);
        if (obj == null) {
            obj = new ArrayList();
            linkedHashMap.put(r9cVar, obj);
        }
        ArrayList arrayList = (ArrayList) obj;
        sqf sqfVar = new sqf(new WeakReference(km9Var), map, j);
        if (arrayList.isEmpty()) {
            arrayList.add(sqfVar);
        } else {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                sqf sqfVar2 = (sqf) arrayList.get(i);
                if (j >= sqfVar2.c) {
                    if (sqfVar2.a.get() == km9Var) {
                        arrayList.set(i, sqfVar);
                    } else {
                        arrayList.add(i, sqfVar);
                    }
                } else {
                    i++;
                }
            }
        }
        b();
    }

    public synchronized void d(s9c s9cVar, Bitmap bitmap, Map map, int i) {
        try {
            LinkedHashMap linkedHashMap = this.a;
            Object obj = linkedHashMap.get(s9cVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(s9cVar, obj);
            }
            ArrayList arrayList = (ArrayList) obj;
            int identityHashCode = System.identityHashCode(bitmap);
            tqf tqfVar = new tqf(identityHashCode, new WeakReference(bitmap), map, i);
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    tqf tqfVar2 = (tqf) arrayList.get(i2);
                    if (i >= tqfVar2.d) {
                        if (tqfVar2.a == identityHashCode && tqfVar2.b.get() == bitmap) {
                            arrayList.set(i2, tqfVar);
                        } else {
                            arrayList.add(i2, tqfVar);
                        }
                    } else {
                        i2++;
                    }
                } else {
                    arrayList.add(tqfVar);
                    break;
                }
            }
            int i3 = this.b;
            this.b = i3 + 1;
            if (i3 >= 10) {
                a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
