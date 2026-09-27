package skip.lib;

import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0016R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\rR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001bÀ\u0006\u0003"}, d2 = {"Lskip/lib/CollectionStorage;", "Element", "Lskip/lib/IterableStorage;", "collection", "", "getCollection", "()Ljava/util/Collection;", "mutableCollection", "", "getMutableCollection", "storageStartIndex", "", "getStorageStartIndex", "()I", "storageEndIndex", "getStorageEndIndex", "()Ljava/lang/Integer;", "effectiveStorageEndIndex", "getEffectiveStorageEndIndex", "willSliceStorage", "", "willMutateStorage", "didMutateStorage", "iterable", "", "getIterable", "()Ljava/lang/Iterable;", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface CollectionStorage<Element> extends IterableStorage<Element> {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static <Element> void didMutateStorage(CollectionStorage<Element> collectionStorage) {
            CollectionStorage.access$didMutateStorage$jd(collectionStorage);
        }

        @Deprecated
        public static <Element> java.util.Collection<Element> getCollection(CollectionStorage<Element> collectionStorage) {
            return CollectionStorage.access$getCollection$jd(collectionStorage);
        }

        @Deprecated
        public static <Element> int getEffectiveStorageEndIndex(CollectionStorage<Element> collectionStorage) {
            return CollectionStorage.access$getEffectiveStorageEndIndex$jd(collectionStorage);
        }

        @Deprecated
        public static <Element> Iterable<Element> getIterable(CollectionStorage<Element> collectionStorage) {
            return CollectionStorage.access$getIterable$jd(collectionStorage);
        }

        @Deprecated
        public static <Element> Integer getStorageEndIndex(CollectionStorage<Element> collectionStorage) {
            return CollectionStorage.access$getStorageEndIndex$jd(collectionStorage);
        }

        @Deprecated
        public static <Element> int getStorageStartIndex(CollectionStorage<Element> collectionStorage) {
            return CollectionStorage.access$getStorageStartIndex$jd(collectionStorage);
        }

        @Deprecated
        public static <Element> Iterator<Element> iterator(CollectionStorage<Element> collectionStorage) {
            return CollectionStorage.access$iterator$jd((CollectionStorage) collectionStorage);
        }

        @Deprecated
        public static <Element> void willMutateStorage(CollectionStorage<Element> collectionStorage) {
            CollectionStorage.access$willMutateStorage$jd(collectionStorage);
        }

        @Deprecated
        public static <Element> void willSliceStorage(CollectionStorage<Element> collectionStorage) {
            CollectionStorage.access$willSliceStorage$jd(collectionStorage);
        }
    }

    static /* synthetic */ void access$didMutateStorage$jd(CollectionStorage collectionStorage) {
        super.didMutateStorage();
    }

    static /* synthetic */ java.util.Collection access$getCollection$jd(CollectionStorage collectionStorage) {
        return super.getCollection();
    }

    static /* synthetic */ int access$getEffectiveStorageEndIndex$jd(CollectionStorage collectionStorage) {
        return super.getEffectiveStorageEndIndex();
    }

    static /* synthetic */ Iterable access$getIterable$jd(CollectionStorage collectionStorage) {
        return super.getIterable();
    }

    static /* synthetic */ Integer access$getStorageEndIndex$jd(CollectionStorage collectionStorage) {
        return super.getStorageEndIndex();
    }

    static /* synthetic */ int access$getStorageStartIndex$jd(CollectionStorage collectionStorage) {
        return super.getStorageStartIndex();
    }

    static /* synthetic */ Iterator access$iterator$jd(CollectionStorage collectionStorage) {
        return super.iterator();
    }

    static /* synthetic */ void access$willMutateStorage$jd(CollectionStorage collectionStorage) {
        super.willMutateStorage();
    }

    static /* synthetic */ void access$willSliceStorage$jd(CollectionStorage collectionStorage) {
        super.willSliceStorage();
    }

    default java.util.Collection<Element> getCollection() {
        return getMutableCollection();
    }

    default int getEffectiveStorageEndIndex() {
        Integer storageEndIndex = getStorageEndIndex();
        if (storageEndIndex != null) {
            return storageEndIndex.intValue();
        }
        return getCollection().size();
    }

    default Iterable<Element> getIterable() {
        if (getStorageStartIndex() == 0 && getStorageEndIndex() == null) {
            return getCollection();
        }
        return new CollectionStorage$iterable$1(this);
    }

    java.util.Collection<Element> getMutableCollection();

    default Integer getStorageEndIndex() {
        return null;
    }

    default int getStorageStartIndex() {
        return 0;
    }

    default void didMutateStorage() {
    }

    default void willMutateStorage() {
    }

    default void willSliceStorage() {
    }
}
