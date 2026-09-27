package skip.lib;

import defpackage.xja;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0010(\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0004H\u0096\u0002J\u000e\u0010\u0005\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"skip/lib/Collection$indices$indicesIterable$1$iterator$1", "", "", "hasNext", "", "next", "()Ljava/lang/Integer;", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Collection$indices$indicesIterable$1$iterator$1 implements Iterator<Integer>, xja {
    final /* synthetic */ Ref.b $index;
    final /* synthetic */ Collection<Element> this$0;

    public Collection$indices$indicesIterable$1$iterator$1(Ref.b bVar, Collection<Element> collection) {
        this.$index = bVar;
        this.this$0 = collection;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.$index.a < this.this$0.getCount()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public Integer next() {
        Ref.b bVar = this.$index;
        int i = bVar.a;
        bVar.a = i + 1;
        return Integer.valueOf(i);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Integer next() {
        return next();
    }
}
