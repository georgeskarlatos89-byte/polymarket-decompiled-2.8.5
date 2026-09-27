package skip.lib;

import defpackage.xja;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: Add missing generic type declarations: [V] */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0002\u001a\u00020\u0003H\u0096\u0002J\u000e\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"skip/lib/Dictionary$ValueCollection$iterator$1", "", "hasNext", "", "next", "()Ljava/lang/Object;", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Dictionary$ValueCollection$iterator$1<V> implements Iterator<V>, xja {
    final /* synthetic */ Iterator<Map.Entry<K, V>> $storageIterator;

    /* JADX WARN: Multi-variable type inference failed */
    public Dictionary$ValueCollection$iterator$1(Iterator<? extends Map.Entry<K, V>> it) {
        this.$storageIterator = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.$storageIterator.hasNext();
    }

    @Override // java.util.Iterator
    public V next() {
        return (V) ((Map.Entry) this.$storageIterator.next()).getValue();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
