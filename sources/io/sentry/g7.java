package io.sentry;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class g7 implements Queue, Collection, Serializable {
    public final h a;
    public final io.sentry.util.a b = new Object();

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, io.sentry.util.a] */
    public g7(h hVar) {
        this.a = hVar;
    }

    @Override // java.util.Queue, java.util.Collection
    public final boolean add(Object obj) {
        io.sentry.util.a aVar = this.b;
        aVar.e();
        try {
            boolean add = this.a.add(obj);
            aVar.close();
            return add;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        io.sentry.util.a aVar = this.b;
        aVar.e();
        try {
            boolean addAll = this.a.addAll(collection);
            aVar.close();
            return addAll;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        io.sentry.util.a aVar = this.b;
        aVar.e();
        try {
            this.a.clear();
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        io.sentry.util.a aVar = this.b;
        aVar.e();
        try {
            boolean contains = this.a.contains(obj);
            aVar.close();
            return contains;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        io.sentry.util.a aVar = this.b;
        aVar.e();
        try {
            boolean containsAll = this.a.containsAll(collection);
            aVar.close();
            return containsAll;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Queue
    public final Object element() {
        io.sentry.util.a aVar = this.b;
        aVar.e();
        try {
            Object element = this.a.element();
            aVar.close();
            return element;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        io.sentry.util.a aVar = this.b;
        aVar.e();
        try {
            boolean equals = this.a.equals(obj);
            aVar.close();
            return equals;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final int hashCode() {
        io.sentry.util.a aVar = this.b;
        aVar.e();
        try {
            int hashCode = this.a.hashCode();
            aVar.close();
            return hashCode;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        io.sentry.util.a aVar = this.b;
        aVar.e();
        try {
            boolean isEmpty = this.a.isEmpty();
            aVar.close();
            return isEmpty;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        io.sentry.util.a aVar = this.b;
        aVar.e();
        try {
            boolean offer = this.a.offer(obj);
            aVar.close();
            return offer;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Queue
    public final Object peek() {
        io.sentry.util.a aVar = this.b;
        aVar.e();
        try {
            Object peek = this.a.peek();
            aVar.close();
            return peek;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Queue
    public final Object poll() {
        io.sentry.util.a aVar = this.b;
        aVar.e();
        try {
            Object poll = this.a.poll();
            aVar.close();
            return poll;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Queue
    public final Object remove() {
        io.sentry.util.a aVar = this.b;
        aVar.e();
        try {
            Object remove = this.a.remove();
            aVar.close();
            return remove;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        io.sentry.util.a aVar = this.b;
        aVar.e();
        try {
            boolean removeAll = this.a.removeAll(collection);
            aVar.close();
            return removeAll;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        io.sentry.util.a aVar = this.b;
        aVar.e();
        try {
            boolean retainAll = this.a.retainAll(collection);
            aVar.close();
            return retainAll;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final int size() {
        io.sentry.util.a aVar = this.b;
        aVar.e();
        try {
            int size = this.a.size();
            aVar.close();
            return size;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        io.sentry.util.a aVar = this.b;
        aVar.e();
        try {
            Object[] array = this.a.toArray();
            aVar.close();
            return array;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final String toString() {
        io.sentry.util.a aVar = this.b;
        aVar.e();
        try {
            String obj = this.a.toString();
            aVar.close();
            return obj;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        io.sentry.util.a aVar = this.b;
        aVar.e();
        try {
            boolean remove = this.a.remove(obj);
            aVar.close();
            return remove;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        io.sentry.util.a aVar = this.b;
        aVar.e();
        try {
            Object[] array = this.a.toArray(objArr);
            aVar.close();
            return array;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
