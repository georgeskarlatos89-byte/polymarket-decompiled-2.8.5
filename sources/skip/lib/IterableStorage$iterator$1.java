package skip.lib;

import defpackage.xja;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: Add missing generic type declarations: [Element] */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0002\u001a\u00020\u0003H\u0096\u0002J\u000e\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"skip/lib/IterableStorage$iterator$1", "", "hasNext", "", "next", "()Ljava/lang/Object;", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IterableStorage$iterator$1<Element> implements Iterator<Element>, xja {
    final /* synthetic */ Iterator<Element> $iter;

    /* JADX WARN: Multi-variable type inference failed */
    public IterableStorage$iterator$1(Iterator<? extends Element> it) {
        this.$iter = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.$iter.hasNext();
    }

    @Override // java.util.Iterator
    public Element next() {
        return (Element) StructKt.sref$default(this.$iter.next(), null, 1, null);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
