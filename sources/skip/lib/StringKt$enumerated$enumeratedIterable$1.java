package skip.lib;

import defpackage.aj3;
import defpackage.xja;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\f\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001J\u001b\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0006H\u0096\u0002¨\u0006\u0007"}, d2 = {"skip/lib/StringKt$enumerated$enumeratedIterable$1", "", "Lskip/lib/Tuple2;", "", "", "iterator", "", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StringKt$enumerated$enumeratedIterable$1 implements Iterable<Tuple2<Integer, Character>>, xja {
    final /* synthetic */ Function0<aj3> $stringIterator;

    /* JADX WARN: Multi-variable type inference failed */
    public StringKt$enumerated$enumeratedIterable$1(Function0<? extends aj3> function0) {
        this.$stringIterator = function0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.internal.Ref$b] */
    @Override // java.lang.Iterable
    public Iterator<Tuple2<Integer, Character>> iterator() {
        return new StringKt$enumerated$enumeratedIterable$1$iterator$1(this.$stringIterator.invoke(), new Object());
    }
}
