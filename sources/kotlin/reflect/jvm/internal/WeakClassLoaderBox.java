package kotlin.reflect.jvm.internal;

import java.lang.ref.WeakReference;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0015\u001a\u00020\u000bH\u0096\u0080\u0004J\n\u0010\u0016\u001a\u00020\u0017H\u0096\u0080\u0004R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0005¨\u0006\u0018"}, d2 = {"Lkotlin/reflect/jvm/internal/WeakClassLoaderBox;", "", "classLoader", "Ljava/lang/ClassLoader;", "<init>", "(Ljava/lang/ClassLoader;)V", "ref", "Ljava/lang/ref/WeakReference;", "getRef", "()Ljava/lang/ref/WeakReference;", "identityHashCode", "", "getIdentityHashCode", "()I", "temporaryStrongRef", "getTemporaryStrongRef", "()Ljava/lang/ClassLoader;", "setTemporaryStrongRef", "equals", "", "other", "hashCode", "toString", "", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
final class WeakClassLoaderBox {
    private final int identityHashCode;
    private final WeakReference<ClassLoader> ref;
    private ClassLoader temporaryStrongRef;

    public WeakClassLoaderBox(ClassLoader classLoader) {
        classLoader.getClass();
        this.ref = new WeakReference<>(classLoader);
        this.identityHashCode = System.identityHashCode(classLoader);
        this.temporaryStrongRef = classLoader;
    }

    public boolean equals(Object other) {
        if ((other instanceof WeakClassLoaderBox) && this.ref.get() == ((WeakClassLoaderBox) other).ref.get()) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode, reason: from getter */
    public int getIdentityHashCode() {
        return this.identityHashCode;
    }

    public final void setTemporaryStrongRef(ClassLoader classLoader) {
        this.temporaryStrongRef = classLoader;
    }

    public String toString() {
        String obj;
        ClassLoader classLoader = this.ref.get();
        if (classLoader != null && (obj = classLoader.toString()) != null) {
            return obj;
        }
        return "<null>";
    }
}
