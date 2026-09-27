package io.sentry;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class z extends AbstractCollection implements Queue, Serializable {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        return false;
    }

    @Override // java.util.Queue
    public final Object element() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Iterator, java.lang.Object] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new Object();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        return false;
    }

    @Override // java.util.Queue
    public final Object peek() {
        return null;
    }

    @Override // java.util.Queue
    public final Object poll() {
        return null;
    }

    @Override // java.util.Queue
    public final Object remove() {
        throw new NoSuchElementException("queue is disabled");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
    }
}
