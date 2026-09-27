package skip.lib;

import defpackage.xja;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0004\n\u0002\u0010(\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0096\u0002R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lskip/lib/IterableStorage;", "Element", "", "iterable", "getIterable", "()Ljava/lang/Iterable;", "iterator", "", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface IterableStorage<Element> extends Iterable<Element>, xja {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static <Element> Iterator<Element> iterator(IterableStorage<Element> iterableStorage) {
            return IterableStorage.access$iterator$jd(iterableStorage);
        }
    }

    static /* synthetic */ Iterator access$iterator$jd(IterableStorage iterableStorage) {
        return super.iterator();
    }

    Iterable<Element> getIterable();

    @Override // java.lang.Iterable
    default Iterator<Element> iterator() {
        return new IterableStorage$iterator$1(getIterable().iterator());
    }
}
