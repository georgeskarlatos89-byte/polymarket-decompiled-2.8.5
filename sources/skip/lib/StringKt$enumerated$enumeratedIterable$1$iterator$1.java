package skip.lib;

import defpackage.aj3;
import defpackage.xja;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0002J\u0015\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0096\u0002¨\u0006\b"}, d2 = {"skip/lib/StringKt$enumerated$enumeratedIterable$1$iterator$1", "", "Lskip/lib/Tuple2;", "", "", "hasNext", "", "next", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StringKt$enumerated$enumeratedIterable$1$iterator$1 implements Iterator<Tuple2<Integer, Character>>, xja {
    final /* synthetic */ aj3 $iter;
    final /* synthetic */ Ref.b $offset;

    public StringKt$enumerated$enumeratedIterable$1$iterator$1(aj3 aj3Var, Ref.b bVar) {
        this.$iter = aj3Var;
        this.$offset = bVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.$iter.hasNext();
    }

    @Override // java.util.Iterator
    /* renamed from: next, reason: avoid collision after fix types in other method */
    public Tuple2<Integer, Character> next2() {
        Ref.b bVar = this.$offset;
        int i = bVar.a;
        bVar.a = i + 1;
        return new Tuple2<>(Integer.valueOf(i), Character.valueOf(this.$iter.a()));
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Tuple2<Integer, Character> next() {
        return next2();
    }
}
