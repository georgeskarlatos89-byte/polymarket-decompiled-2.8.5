package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class l4 extends AbstractCollection implements Collection, yja {
    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }
}
