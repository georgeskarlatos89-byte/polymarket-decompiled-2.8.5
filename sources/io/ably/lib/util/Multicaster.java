package io.ably.lib.util;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class Multicaster<T> {
    private final List<T> members = new ArrayList();

    public Multicaster(T... tArr) {
        for (T t : tArr) {
            this.members.add(t);
        }
    }

    public synchronized void add(T t) {
        this.members.add(t);
    }

    public synchronized void clear() {
        this.members.clear();
    }

    public synchronized List<T> getMembers() {
        return new ArrayList(this.members);
    }

    public synchronized boolean isEmpty() {
        return this.members.isEmpty();
    }

    public synchronized void remove(T t) {
        this.members.remove(t);
    }

    public synchronized int size() {
        return this.members.size();
    }
}
