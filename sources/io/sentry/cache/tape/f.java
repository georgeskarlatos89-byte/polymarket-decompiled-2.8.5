package io.sentry.cache.tape;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class f implements Iterable, Closeable {
    public void clear() {
        q1(size());
    }

    public abstract void o1(Comparable comparable);

    public final List p1() {
        int min = Math.min(size(), size());
        ArrayList arrayList = new ArrayList(min);
        Iterator it = iterator();
        for (int i = 0; i < min; i++) {
            arrayList.add(it.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public abstract void q1(int i);

    public abstract int size();

    public void r1() {
    }
}
