package skip.lib;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lskip/lib/MutableListStorage;", "Element", "Lskip/lib/CollectionStorage;", "mutableList", "", "getMutableList", "()Ljava/util/List;", "mutableCollection", "", "getMutableCollection", "()Ljava/util/Collection;", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface MutableListStorage<Element> extends CollectionStorage<Element> {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static <Element> void didMutateStorage(MutableListStorage<Element> mutableListStorage) {
            MutableListStorage.access$didMutateStorage$jd((MutableListStorage) mutableListStorage);
        }

        @Deprecated
        public static <Element> java.util.Collection<Element> getCollection(MutableListStorage<Element> mutableListStorage) {
            return MutableListStorage.access$getCollection$jd((MutableListStorage) mutableListStorage);
        }

        @Deprecated
        public static <Element> int getEffectiveStorageEndIndex(MutableListStorage<Element> mutableListStorage) {
            return MutableListStorage.access$getEffectiveStorageEndIndex$jd((MutableListStorage) mutableListStorage);
        }

        @Deprecated
        public static <Element> Iterable<Element> getIterable(MutableListStorage<Element> mutableListStorage) {
            return MutableListStorage.access$getIterable$jd((MutableListStorage) mutableListStorage);
        }

        @Deprecated
        public static <Element> java.util.Collection<Element> getMutableCollection(MutableListStorage<Element> mutableListStorage) {
            return MutableListStorage.access$getMutableCollection$jd(mutableListStorage);
        }

        @Deprecated
        public static <Element> Integer getStorageEndIndex(MutableListStorage<Element> mutableListStorage) {
            return MutableListStorage.access$getStorageEndIndex$jd((MutableListStorage) mutableListStorage);
        }

        @Deprecated
        public static <Element> int getStorageStartIndex(MutableListStorage<Element> mutableListStorage) {
            return MutableListStorage.access$getStorageStartIndex$jd((MutableListStorage) mutableListStorage);
        }

        @Deprecated
        public static <Element> Iterator<Element> iterator(MutableListStorage<Element> mutableListStorage) {
            return MutableListStorage.access$iterator$jd((MutableListStorage) mutableListStorage);
        }

        @Deprecated
        public static <Element> void willMutateStorage(MutableListStorage<Element> mutableListStorage) {
            MutableListStorage.access$willMutateStorage$jd((MutableListStorage) mutableListStorage);
        }

        @Deprecated
        public static <Element> void willSliceStorage(MutableListStorage<Element> mutableListStorage) {
            MutableListStorage.access$willSliceStorage$jd((MutableListStorage) mutableListStorage);
        }
    }

    static /* synthetic */ void access$didMutateStorage$jd(MutableListStorage mutableListStorage) {
        super.didMutateStorage();
    }

    static /* synthetic */ java.util.Collection access$getCollection$jd(MutableListStorage mutableListStorage) {
        return super.getCollection();
    }

    static /* synthetic */ int access$getEffectiveStorageEndIndex$jd(MutableListStorage mutableListStorage) {
        return super.getEffectiveStorageEndIndex();
    }

    static /* synthetic */ Iterable access$getIterable$jd(MutableListStorage mutableListStorage) {
        return super.getIterable();
    }

    static /* synthetic */ java.util.Collection access$getMutableCollection$jd(MutableListStorage mutableListStorage) {
        return super.getMutableCollection();
    }

    static /* synthetic */ Integer access$getStorageEndIndex$jd(MutableListStorage mutableListStorage) {
        return super.getStorageEndIndex();
    }

    static /* synthetic */ int access$getStorageStartIndex$jd(MutableListStorage mutableListStorage) {
        return super.getStorageStartIndex();
    }

    static /* synthetic */ Iterator access$iterator$jd(MutableListStorage mutableListStorage) {
        return super.iterator();
    }

    static /* synthetic */ void access$willMutateStorage$jd(MutableListStorage mutableListStorage) {
        super.willMutateStorage();
    }

    static /* synthetic */ void access$willSliceStorage$jd(MutableListStorage mutableListStorage) {
        super.willSliceStorage();
    }

    default java.util.Collection<Element> getMutableCollection() {
        return getMutableList();
    }

    List<Element> getMutableList();
}
