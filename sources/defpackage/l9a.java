package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class l9a implements Iterator {
    private static final /* synthetic */ l9a[] $VALUES;
    public static final l9a INSTANCE;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, l9a] */
    static {
        ?? r0 = new Enum("INSTANCE", 0);
        INSTANCE = r0;
        $VALUES = new l9a[]{r0};
    }

    public static l9a valueOf(String str) {
        return (l9a) Enum.valueOf(l9a.class, str);
    }

    public static l9a[] values() {
        return (l9a[]) $VALUES.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        brn.r("no calls to next() since the last call to remove()", false);
    }
}
