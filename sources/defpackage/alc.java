package defpackage;

import com.squareup.moshi.JsonAdapter;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class alc {
    public final ArrayList a = new ArrayList();
    public final ArrayDeque b = new ArrayDeque();
    public boolean c;
    public final /* synthetic */ blc d;

    public alc(blc blcVar) {
        this.d = blcVar;
    }

    public final IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        if (!this.c) {
            this.c = true;
            ArrayDeque arrayDeque = this.b;
            if (arrayDeque.size() != 1 || ((zkc) arrayDeque.getFirst()).i != null) {
                StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
                Iterator descendingIterator = arrayDeque.descendingIterator();
                while (descendingIterator.hasNext()) {
                    zkc zkcVar = (zkc) descendingIterator.next();
                    sb.append("\nfor ");
                    Type type = zkcVar.h;
                    String str = zkcVar.i;
                    sb.append(type);
                    if (str != null) {
                        sb.append(' ');
                        sb.append(str);
                    }
                }
                return new IllegalArgumentException(sb.toString(), illegalArgumentException);
            }
        }
        return illegalArgumentException;
    }

    public final void b(boolean z) {
        this.b.removeLast();
        if (this.b.isEmpty()) {
            this.d.c.remove();
            if (z) {
                synchronized (this.d.d) {
                    try {
                        int size = this.a.size();
                        for (int i = 0; i < size; i++) {
                            zkc zkcVar = (zkc) this.a.get(i);
                            JsonAdapter jsonAdapter = (JsonAdapter) this.d.d.put(zkcVar.j, zkcVar.k);
                            if (jsonAdapter != null) {
                                zkcVar.k = jsonAdapter;
                                this.d.d.put(zkcVar.j, jsonAdapter);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }
}
