package skip.lib;

import defpackage.xja;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: Add missing generic type declarations: [Element] */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004"}, d2 = {"skip/lib/CollectionStorage$iterable$1", "", "iterator", "", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CollectionStorage$iterable$1<Element> implements Iterable<Element>, xja {
    final /* synthetic */ CollectionStorage<Element> this$0;

    public CollectionStorage$iterable$1(CollectionStorage<Element> collectionStorage) {
        this.this$0 = collectionStorage;
    }

    @Override // java.lang.Iterable
    public Iterator<Element> iterator() {
        return new CollectionStorage$iterable$1$iterator$1(this.this$0);
    }
}
