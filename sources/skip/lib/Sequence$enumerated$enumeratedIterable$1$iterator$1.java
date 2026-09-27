package skip.lib;

import defpackage.xja;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;

/* JADX INFO: Add missing generic type declarations: [Element] */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0005H\u0096\u0002J\u0015\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¨\u0006\u0007"}, d2 = {"skip/lib/Sequence$enumerated$enumeratedIterable$1$iterator$1", "", "Lskip/lib/Tuple2;", "", "hasNext", "", "next", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Sequence$enumerated$enumeratedIterable$1$iterator$1<Element> implements Iterator<Tuple2<Integer, Element>>, xja {
    final /* synthetic */ Iterator<Element> $iter;
    final /* synthetic */ Ref.b $offset;

    /* JADX WARN: Multi-variable type inference failed */
    public Sequence$enumerated$enumeratedIterable$1$iterator$1(Iterator<? extends Element> it, Ref.b bVar) {
        this.$iter = it;
        this.$offset = bVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.$iter.hasNext();
    }

    @Override // java.util.Iterator
    public Tuple2<Integer, Element> next() {
        Ref.b bVar = this.$offset;
        int i = bVar.a;
        bVar.a = i + 1;
        return new Tuple2<>(Integer.valueOf(i), this.$iter.next());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return next();
    }
}
