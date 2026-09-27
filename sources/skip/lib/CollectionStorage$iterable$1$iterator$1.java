package skip.lib;

import defpackage.xja;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: Add missing generic type declarations: [Element] */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0004\u001a\u00020\u0005H\u0096\u0002J\u000e\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"skip/lib/CollectionStorage$iterable$1$iterator$1", "", "index", "", "hasNext", "", "next", "()Ljava/lang/Object;", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CollectionStorage$iterable$1$iterator$1<Element> implements Iterator<Element>, xja {
    private int index;
    final /* synthetic */ CollectionStorage<Element> this$0;

    public CollectionStorage$iterable$1$iterator$1(CollectionStorage<Element> collectionStorage) {
        this.this$0 = collectionStorage;
        this.index = collectionStorage.getStorageStartIndex();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.index < this.this$0.getEffectiveStorageEndIndex()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Element next() {
        java.util.Collection<Element> collection = this.this$0.getCollection();
        int i = this.index;
        this.index = i + 1;
        return (Element) kotlin.collections.CollectionsKt.B(i, collection);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
