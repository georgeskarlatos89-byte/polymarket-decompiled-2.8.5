package skip.lib;

import defpackage.xja;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0096\u0002¨\u0006\u0005"}, d2 = {"skip/lib/Collection$indices$indicesIterable$1", "", "", "iterator", "", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Collection$indices$indicesIterable$1 implements Iterable<Integer>, xja {
    final /* synthetic */ Collection<Element> this$0;

    public Collection$indices$indicesIterable$1(Collection<Element> collection) {
        this.this$0 = collection;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.internal.Ref$b] */
    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        return new Collection$indices$indicesIterable$1$iterator$1(new Object(), this.this$0);
    }
}
