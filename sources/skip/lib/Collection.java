package skip.lib;

import defpackage.gb4;
import defpackage.lnf;
import defpackage.pu2;
import defpackage.py2;
import defpackage.t54;
import defpackage.ta4;
import defpackage.u0a;
import defpackage.y60;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0016J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005H\u0016J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0016J\u0016\u0010\u0019\u001a\u00020\u001a2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u001bH\u0016J\u001e\u0010\u0019\u001a\u00020\u001a2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u001b2\u0006\u0010\u0014\u001a\u00020\u0005H\u0016J!\u0010\u001c\u001a\u0004\u0018\u00018\u00002\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001bH\u0016¢\u0006\u0002\u0010\u001fJ\u000f\u0010 \u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010!J\r\u0010\"\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u0005H\u0016J\"\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000'2\u0006\u0010(\u001a\u00020\u00052\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*H\u0016J.\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000'2\u0006\u0010+\u001a\u00020\u00052\n\b\u0002\u0010,\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010*H\u0016J\"\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000'2\u0006\u0010\u0016\u001a\u00020\u00052\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0017\u0010/\u001a\u0004\u0018\u00010\u00052\u0006\u00100\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00101J#\u0010/\u001a\u0004\u0018\u00010\u00052\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e03H\u0016¢\u0006\u0002\u00104J\u0017\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00106\u001a\u000207H\u0096\u0002J\u0012\u00108\u001a\u00020\u001a2\b\b\u0002\u00109\u001a\u00020\u000eH\u0016J\u001a\u0010:\u001a\u00020\u001a2\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001bH\u0016J\b\u0010;\u001a\u00020\u001aH\u0016J\"\u0010;\u001a\u00020\u001a2\u0018\u0010<\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0=H\u0016J\"\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000'2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e03H\u0016J\u001c\u0010@\u001a\u00020\u001a2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e03H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007R\u0016\u0010$\u001a\u0004\u0018\u00018\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010!¨\u0006AÀ\u0006\u0003"}, d2 = {"Lskip/lib/Collection;", "Element", "Lskip/lib/Sequence;", "Lskip/lib/CollectionStorage;", "startIndex", "", "getStartIndex", "()I", "endIndex", "getEndIndex", "indices", "getIndices", "()Lskip/lib/Sequence;", "isEmpty", "", "()Z", "count", "getCount", "index", "i", "offsetBy", "distance", TicketDetailDestinationKt.LAUNCHED_FROM, "to", "after", "formIndex", "", "Lskip/lib/InOut;", "randomElement", "using", "Lskip/lib/RandomNumberGenerator;", "(Lskip/lib/InOut;)Ljava/lang/Object;", "popFirst", "()Ljava/lang/Object;", "removeFirst", "k", "first", "getFirst", "prefix", "Lskip/lib/Array;", "upTo", "unusedp", "", "through", "unusedp0", "unusedp1", "suffix", "firstIndex", "of", "(Ljava/lang/Object;)Ljava/lang/Integer;", "where", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Integer;", "get", "range", "Lkotlin/ranges/IntRange;", "removeAll", "keepingCapacity", "shuffle", "sort", "by", "Lkotlin/Function2;", "trimmingPrefix", "while_", "trimPrefix", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface Collection<Element> extends Sequence<Element>, CollectionStorage<Element> {
    static /* synthetic */ Iterable G(Iterable iterable, Function1 function1) {
        return trimmingPrefix$lambda$3(function1, iterable);
    }

    static /* synthetic */ Unit K(InOut inOut, List list) {
        return shuffle$lambda$0(inOut, list);
    }

    static /* synthetic */ Unit X0(List list, Function1 function1) {
        return trimPrefix$lambda$4(function1, list);
    }

    static /* synthetic */ boolean access$allSatisfy$jd(Collection collection, Function1 function1) {
        return super.allSatisfy(function1);
    }

    static /* synthetic */ Array access$compactMap$jd(Collection collection, Function1 function1) {
        return super.compactMap(function1);
    }

    static /* synthetic */ boolean access$contains$jd(Collection collection, Object obj) {
        return super.contains((Collection) obj);
    }

    static /* synthetic */ int access$count$jd(Collection collection, Function1 function1) {
        return super.count(function1);
    }

    static /* synthetic */ void access$didMutateStorage$jd(Collection collection) {
        super.didMutateStorage();
    }

    static /* synthetic */ int access$distance$jd(Collection collection, int i, int i2) {
        return super.distance(i, i2);
    }

    static /* synthetic */ Array access$drop$jd(Collection collection, Function1 function1) {
        return super.drop(function1);
    }

    static /* synthetic */ Array access$dropFirst$jd(Collection collection, int i) {
        return super.dropFirst(i);
    }

    static /* synthetic */ Array access$dropLast$jd(Collection collection, int i) {
        return super.dropLast(i);
    }

    static /* synthetic */ boolean access$elementsEqual$jd(Collection collection, Sequence sequence, Function2 function2) {
        return super.elementsEqual(sequence, function2);
    }

    static /* synthetic */ Sequence access$enumerated$jd(Collection collection) {
        return super.enumerated();
    }

    static /* synthetic */ Object access$first$jd(Collection collection, Function1 function1) {
        return super.first(function1);
    }

    static /* synthetic */ Integer access$firstIndex$jd(Collection collection, Object obj) {
        return super.firstIndex((Collection) obj);
    }

    static /* synthetic */ Array access$flatMap$jd(Collection collection, Function1 function1) {
        return super.flatMap(function1);
    }

    static /* synthetic */ void access$forEach$jd(Collection collection, Function1 function1) {
        super.forEach(function1);
    }

    static /* synthetic */ void access$formIndex$jd(Collection collection, InOut inOut) {
        super.formIndex(inOut);
    }

    static /* synthetic */ Collection access$get$jd(Collection collection, IntRange intRange) {
        return super.get(intRange);
    }

    static /* synthetic */ java.util.Collection access$getCollection$jd(Collection collection) {
        return super.getCollection();
    }

    static /* synthetic */ int access$getCount$jd(Collection collection) {
        return super.getCount();
    }

    static /* synthetic */ int access$getEffectiveStorageEndIndex$jd(Collection collection) {
        return super.getEffectiveStorageEndIndex();
    }

    static /* synthetic */ int access$getEndIndex$jd(Collection collection) {
        return super.getEndIndex();
    }

    static /* synthetic */ Object access$getFirst$jd(Collection collection) {
        return super.getFirst();
    }

    static /* synthetic */ Sequence access$getIndices$jd(Collection collection) {
        return super.getIndices();
    }

    static /* synthetic */ Iterable access$getIterable$jd(Collection collection) {
        return super.getIterable();
    }

    static /* synthetic */ int access$getStartIndex$jd(Collection collection) {
        return super.getStartIndex();
    }

    static /* synthetic */ Integer access$getStorageEndIndex$jd(Collection collection) {
        return super.getStorageEndIndex();
    }

    static /* synthetic */ int access$getStorageStartIndex$jd(Collection collection) {
        return super.getStorageStartIndex();
    }

    static /* synthetic */ int access$getUnderestimatedCount$jd(Collection collection) {
        return super.getUnderestimatedCount();
    }

    static /* synthetic */ int access$index$jd(Collection collection, int i) {
        return super.index(i);
    }

    static /* synthetic */ boolean access$isEmpty$jd(Collection collection) {
        return super.isEmpty();
    }

    static /* synthetic */ Iterator access$iterator$jd(Collection collection) {
        return super.iterator();
    }

    static /* synthetic */ IteratorProtocol access$makeIterator$jd(Collection collection) {
        return super.makeIterator();
    }

    static /* synthetic */ Array access$map$jd(Collection collection, Function1 function1) {
        return super.map(function1);
    }

    static /* synthetic */ Object access$max$jd(Collection collection) {
        return super.max();
    }

    static /* synthetic */ Object access$min$jd(Collection collection) {
        return super.min();
    }

    static /* synthetic */ Object access$popFirst$jd(Collection collection) {
        return super.popFirst();
    }

    static /* synthetic */ Array access$prefix$jd(Collection collection, int i) {
        return super.prefix(i);
    }

    static /* synthetic */ Object access$randomElement$jd(Collection collection, InOut inOut) {
        return super.randomElement(inOut);
    }

    static /* synthetic */ Object access$reduce$jd(Collection collection, Object obj, Function2 function2) {
        return super.reduce(obj, function2);
    }

    static /* synthetic */ void access$removeAll$jd(Collection collection, boolean z) {
        super.removeAll(z);
    }

    static /* synthetic */ Object access$removeFirst$jd(Collection collection) {
        return super.removeFirst();
    }

    static /* synthetic */ Array access$reversed$jd(Collection collection) {
        return super.reversed();
    }

    static /* synthetic */ void access$shuffle$jd(Collection collection, InOut inOut) {
        super.shuffle(inOut);
    }

    static /* synthetic */ Array access$shuffled$jd(Collection collection, InOut inOut) {
        return super.shuffled(inOut);
    }

    static /* synthetic */ void access$sort$jd(Collection collection) {
        super.sort();
    }

    static /* synthetic */ Array access$sorted$jd(Collection collection) {
        return super.sorted();
    }

    static /* synthetic */ boolean access$starts$jd(Collection collection, Sequence sequence) {
        return super.starts(sequence);
    }

    static /* synthetic */ Array access$suffix$jd(Collection collection, int i) {
        return super.suffix(i);
    }

    static /* synthetic */ void access$trimPrefix$jd(Collection collection, Function1 function1) {
        super.trimPrefix(function1);
    }

    static /* synthetic */ Array access$trimmingPrefix$jd(Collection collection, Function1 function1) {
        return super.trimmingPrefix(function1);
    }

    static /* synthetic */ void access$willMutateStorage$jd(Collection collection) {
        super.willMutateStorage();
    }

    static /* synthetic */ void access$willSliceStorage$jd(Collection collection) {
        super.willSliceStorage();
    }

    static /* synthetic */ Object access$withContiguousStorageIfAvailable$jd(Collection collection, Function1 function1) {
        return super.withContiguousStorageIfAvailable(function1);
    }

    static /* synthetic */ Unit f1(Function2 function2, List list) {
        return sort$lambda$2(function2, list);
    }

    static /* synthetic */ boolean o(Object obj, Object obj2) {
        return sort$lambda$1(obj, obj2);
    }

    static /* synthetic */ Array prefix$default(Collection collection, int i, Object obj, Object obj2, int i2, Object obj3) {
        if (obj3 == null) {
            if ((i2 & 2) != 0) {
                obj = null;
            }
            if ((i2 & 4) != 0) {
                obj2 = null;
            }
            return collection.prefix(i, obj, obj2);
        }
        py2.f("Super calls with default arguments not supported in this target, function: prefix");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object randomElement$default(Collection collection, InOut inOut, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                inOut = null;
            }
            return collection.randomElement(inOut);
        }
        py2.f("Super calls with default arguments not supported in this target, function: randomElement");
        return null;
    }

    static /* synthetic */ void removeAll$default(Collection collection, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            collection.removeAll(z);
            return;
        }
        py2.f("Super calls with default arguments not supported in this target, function: removeAll");
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void shuffle$default(Collection collection, InOut inOut, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                inOut = null;
            }
            collection.shuffle(inOut);
            return;
        }
        py2.f("Super calls with default arguments not supported in this target, function: shuffle");
    }

    private static Unit shuffle$lambda$0(InOut inOut, List list) {
        list.getClass();
        CollectionsKt.shuffle(list, inOut);
        return Unit.INSTANCE;
    }

    private static boolean sort$lambda$1(Object obj, Object obj2) {
        obj.getClass();
        if (((Comparable) obj).compareTo(obj2) < 0) {
            return true;
        }
        return false;
    }

    private static Unit sort$lambda$2(Function2 function2, List list) {
        list.getClass();
        gb4.g(list, new PredicateComparator(function2));
        return Unit.INSTANCE;
    }

    static /* synthetic */ Array suffix$default(Collection collection, int i, Object obj, int i2, Object obj2) {
        if (obj2 == null) {
            if ((i2 & 2) != 0) {
                obj = null;
            }
            return collection.suffix(i, obj);
        }
        py2.f("Super calls with default arguments not supported in this target, function: suffix");
        return null;
    }

    private static Unit trimPrefix$lambda$4(Function1 function1, List list) {
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext() && ((Boolean) function1.invoke(it.next())).booleanValue()) {
            it.remove();
        }
        return Unit.INSTANCE;
    }

    private static Iterable trimmingPrefix$lambda$3(Function1 function1, Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (Object obj : iterable) {
            if (z) {
                arrayList.add(obj);
            } else if (!((Boolean) function1.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
                z = true;
            }
        }
        return arrayList;
    }

    default int distance(int from, int to) {
        return to - from;
    }

    default Integer firstIndex(Function1<? super Element, Boolean> where) {
        where.getClass();
        Iterator<Element> it = iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                Element next = it.next();
                if (i < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                if (where.invoke(next).booleanValue()) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1) {
            return null;
        }
        return Integer.valueOf(i);
    }

    default void formIndex(InOut<Integer> after) {
        after.getClass();
        after.setValue(Integer.valueOf(after.getValue().intValue() + 1));
    }

    default Collection<Element> get(IntRange range) {
        final int i;
        final Integer valueOf;
        range.getClass();
        int i2 = range.a;
        int i3 = range.b;
        u0a u0aVar = u0a.a;
        if (i2 == NumbersKt.getMin(u0aVar)) {
            i = 0;
        } else {
            i = range.a;
        }
        if (i3 == NumbersKt.getMax(u0aVar)) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(i3 + 1);
        }
        willSliceStorage();
        return new Collection<Element>(this, i, valueOf) { // from class: skip.lib.Collection$get$1
            private final java.util.Collection<Element> collection;
            private final Integer storageEndIndex;
            private final int storageStartIndex;

            {
                this.collection = this.getCollection();
                this.storageStartIndex = i;
                this.storageEndIndex = valueOf;
            }

            @Override // skip.lib.Sequence
            public boolean allSatisfy(Function1<? super Element, Boolean> function1) {
                return super.allSatisfy(function1);
            }

            @Override // skip.lib.Sequence
            public <RE> Array<RE> compactMap(Function1<? super Element, ? extends RE> function1) {
                return super.compactMap(function1);
            }

            @Override // skip.lib.Sequence
            public boolean contains(Element element) {
                return super.contains((Collection$get$1<Element>) element);
            }

            @Override // skip.lib.Sequence
            public int count(Function1<? super Element, Boolean> function1) {
                return super.count(function1);
            }

            @Override // skip.lib.CollectionStorage
            public void didMutateStorage() {
                super.didMutateStorage();
            }

            @Override // skip.lib.Collection
            public int distance(int i4, int i5) {
                return super.distance(i4, i5);
            }

            @Override // skip.lib.Sequence
            public Array<Element> drop(Function1<? super Element, Boolean> function1) {
                return super.drop(function1);
            }

            @Override // skip.lib.Sequence
            public Array<Element> dropFirst(int i4) {
                return super.dropFirst(i4);
            }

            @Override // skip.lib.Sequence
            public Array<Element> dropLast(int i4) {
                return super.dropLast(i4);
            }

            @Override // skip.lib.Sequence
            public boolean elementsEqual(Sequence<Element> sequence, Function2<? super Element, ? super Element, Boolean> function2) {
                return super.elementsEqual(sequence, function2);
            }

            @Override // skip.lib.Sequence
            public Sequence<Tuple2<Integer, Element>> enumerated() {
                return super.enumerated();
            }

            @Override // skip.lib.Sequence
            public Element first(Function1<? super Element, Boolean> function1) {
                return (Element) super.first(function1);
            }

            @Override // skip.lib.Collection
            public Integer firstIndex(Element element) {
                return super.firstIndex((Collection$get$1<Element>) element);
            }

            @Override // skip.lib.Sequence
            public <RE> Array<RE> flatMap(Function1<? super Element, ? extends Sequence<RE>> function1) {
                return super.flatMap(function1);
            }

            @Override // skip.lib.Sequence
            public void forEach(Function1<? super Element, Unit> function1) {
                super.forEach(function1);
            }

            @Override // skip.lib.Collection
            public void formIndex(InOut<Integer> inOut) {
                super.formIndex(inOut);
            }

            @Override // skip.lib.Collection
            public Collection<Element> get(IntRange intRange) {
                return super.get(intRange);
            }

            @Override // skip.lib.CollectionStorage
            public java.util.Collection<Element> getCollection() {
                return this.collection;
            }

            @Override // skip.lib.Collection
            public int getCount() {
                return super.getCount();
            }

            @Override // skip.lib.CollectionStorage
            public int getEffectiveStorageEndIndex() {
                return super.getEffectiveStorageEndIndex();
            }

            @Override // skip.lib.Collection
            public int getEndIndex() {
                return super.getEndIndex();
            }

            @Override // skip.lib.Collection
            public Element getFirst() {
                return (Element) super.getFirst();
            }

            @Override // skip.lib.Collection
            public Sequence<Integer> getIndices() {
                return super.getIndices();
            }

            @Override // skip.lib.IterableStorage, skip.lib.CollectionStorage
            public Iterable<Element> getIterable() {
                return super.getIterable();
            }

            @Override // skip.lib.CollectionStorage, skip.lib.MutableListStorage
            public java.util.Collection<Element> getMutableCollection() {
                throw new UnsupportedOperationException();
            }

            @Override // skip.lib.Collection
            public int getStartIndex() {
                return super.getStartIndex();
            }

            @Override // skip.lib.CollectionStorage
            public Integer getStorageEndIndex() {
                return this.storageEndIndex;
            }

            @Override // skip.lib.CollectionStorage
            public int getStorageStartIndex() {
                return this.storageStartIndex;
            }

            @Override // skip.lib.Sequence
            public int getUnderestimatedCount() {
                return super.getUnderestimatedCount();
            }

            @Override // skip.lib.Collection
            public int index(int i4) {
                return super.index(i4);
            }

            @Override // skip.lib.Collection
            public boolean isEmpty() {
                return super.isEmpty();
            }

            @Override // skip.lib.IterableStorage, java.lang.Iterable
            public Iterator<Element> iterator() {
                return super.iterator();
            }

            @Override // skip.lib.Sequence
            public IteratorProtocol<Element> makeIterator() {
                return super.makeIterator();
            }

            @Override // skip.lib.Sequence
            public <RE> Array<RE> map(Function1<? super Element, ? extends RE> function1) {
                return super.map(function1);
            }

            @Override // skip.lib.Sequence
            public Element max() {
                return (Element) super.max();
            }

            @Override // skip.lib.Sequence
            public Element min() {
                return (Element) super.min();
            }

            @Override // skip.lib.Collection
            public Element popFirst() {
                return (Element) super.popFirst();
            }

            @Override // skip.lib.Sequence
            public Array<Element> prefix(int i4) {
                return super.prefix(i4);
            }

            @Override // skip.lib.Collection
            public Element randomElement(InOut<RandomNumberGenerator> inOut) {
                return (Element) super.randomElement(inOut);
            }

            @Override // skip.lib.Sequence
            public <R> R reduce(R r, Function2<? super R, ? super Element, ? extends R> function2) {
                return (R) super.reduce(r, function2);
            }

            @Override // skip.lib.Collection
            public void removeAll(boolean z) {
                super.removeAll(z);
            }

            @Override // skip.lib.Collection
            public Element removeFirst() {
                return (Element) super.removeFirst();
            }

            @Override // skip.lib.Sequence
            public Array<Element> reversed() {
                return super.reversed();
            }

            @Override // skip.lib.Collection
            public void shuffle(InOut<RandomNumberGenerator> inOut) {
                super.shuffle(inOut);
            }

            @Override // skip.lib.Sequence
            public Array<Element> shuffled(InOut<RandomNumberGenerator> inOut) {
                return super.shuffled(inOut);
            }

            @Override // skip.lib.Collection
            public void sort() {
                super.sort();
            }

            @Override // skip.lib.Sequence
            public Array<Element> sorted() {
                return super.sorted();
            }

            @Override // skip.lib.Sequence
            public boolean starts(Sequence<Element> sequence) {
                return super.starts(sequence);
            }

            @Override // skip.lib.Sequence
            public Array<Element> suffix(int i4) {
                return super.suffix(i4);
            }

            @Override // skip.lib.Collection
            public void trimPrefix(Function1<? super Element, Boolean> function1) {
                super.trimPrefix(function1);
            }

            @Override // skip.lib.Collection
            public Array<Element> trimmingPrefix(Function1<? super Element, Boolean> function1) {
                return super.trimmingPrefix(function1);
            }

            @Override // skip.lib.CollectionStorage
            public void willMutateStorage() {
                super.willMutateStorage();
            }

            @Override // skip.lib.CollectionStorage
            public void willSliceStorage() {
                super.willSliceStorage();
            }

            @Override // skip.lib.Sequence
            public <T> T withContiguousStorageIfAvailable(Function1<Object, ? extends T> function1) {
                return (T) super.withContiguousStorageIfAvailable(function1);
            }

            @Override // skip.lib.Collection
            public void formIndex(InOut<Integer> inOut, int i4) {
                super.formIndex(inOut, i4);
            }

            @Override // skip.lib.Collection
            public void sort(Function2<? super Element, ? super Element, Boolean> function2) {
                super.sort(function2);
            }

            @Override // skip.lib.Sequence
            public boolean contains(Function1<? super Element, Boolean> function1) {
                return super.contains((Function1) function1);
            }

            @Override // skip.lib.Collection
            public Integer firstIndex(Function1<? super Element, Boolean> function1) {
                return super.firstIndex((Function1) function1);
            }

            @Override // skip.lib.Collection
            public int index(int i4, int i5) {
                return super.index(i4, i5);
            }

            @Override // skip.lib.Sequence
            public Element max(Function2<? super Element, ? super Element, Boolean> function2) {
                return (Element) super.max(function2);
            }

            @Override // skip.lib.Sequence
            public Element min(Function2<? super Element, ? super Element, Boolean> function2) {
                return (Element) super.min(function2);
            }

            @Override // skip.lib.Collection
            public Array<Element> prefix(int i4, Object obj) {
                return super.prefix(i4, obj);
            }

            @Override // skip.lib.Sequence
            public <R> R reduce(Void r1, R r, Function2<? super InOut<R>, ? super Element, Unit> function2) {
                return (R) super.reduce(r1, r, function2);
            }

            @Override // skip.lib.Collection
            public void removeFirst(int i4) {
                super.removeFirst(i4);
            }

            @Override // skip.lib.Sequence
            public Array<Element> sorted(Function2<? super Element, ? super Element, Boolean> function2) {
                return super.sorted(function2);
            }

            @Override // skip.lib.Sequence
            public boolean starts(Sequence<Element> sequence, Function2<? super Element, ? super Element, Boolean> function2) {
                return super.starts(sequence, function2);
            }

            @Override // skip.lib.Collection
            public Array<Element> suffix(int i4, Object obj) {
                return super.suffix(i4, obj);
            }

            @Override // skip.lib.Collection
            public Array<Element> prefix(int i4, Object obj, Object obj2) {
                return super.prefix(i4, obj, obj2);
            }

            @Override // skip.lib.Sequence
            public Array<Element> prefix(Function1<? super Element, Boolean> function1) {
                return super.prefix(function1);
            }
        };
    }

    default int getCount() {
        return getEffectiveStorageEndIndex() - getStorageStartIndex();
    }

    default int getEndIndex() {
        Integer storageEndIndex = getStorageEndIndex();
        if (storageEndIndex != null) {
            return storageEndIndex.intValue();
        }
        return getCount();
    }

    default Element getFirst() {
        if (isEmpty()) {
            return null;
        }
        return (Element) StructKt.sref$default(kotlin.collections.CollectionsKt.B(getStorageStartIndex(), getCollection()), null, 1, null);
    }

    default Sequence<Integer> getIndices() {
        final Collection$indices$indicesIterable$1 collection$indices$indicesIterable$1 = new Collection$indices$indicesIterable$1(this);
        return new Sequence<Integer>() { // from class: skip.lib.Collection$indices$1
            @Override // skip.lib.Sequence
            public boolean allSatisfy(Function1<? super Integer, Boolean> function1) {
                return super.allSatisfy(function1);
            }

            @Override // skip.lib.Sequence
            public <RE> Array<RE> compactMap(Function1<? super Integer, ? extends RE> function1) {
                return super.compactMap(function1);
            }

            @Override // skip.lib.Sequence
            public /* bridge */ /* synthetic */ boolean contains(Integer num) {
                return contains(num.intValue());
            }

            @Override // skip.lib.Sequence
            public int count(Function1<? super Integer, Boolean> function1) {
                return super.count(function1);
            }

            @Override // skip.lib.Sequence
            public Array<Integer> drop(Function1<? super Integer, Boolean> function1) {
                return super.drop(function1);
            }

            @Override // skip.lib.Sequence
            public Array<Integer> dropFirst(int i) {
                return super.dropFirst(i);
            }

            @Override // skip.lib.Sequence
            public Array<Integer> dropLast(int i) {
                return super.dropLast(i);
            }

            @Override // skip.lib.Sequence
            public boolean elementsEqual(Sequence<Integer> sequence, Function2<? super Integer, ? super Integer, Boolean> function2) {
                return super.elementsEqual(sequence, function2);
            }

            @Override // skip.lib.Sequence
            public Sequence<Tuple2<Integer, Integer>> enumerated() {
                return super.enumerated();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // skip.lib.Sequence
            public Integer first(Function1<? super Integer, Boolean> function1) {
                return (Integer) super.first((Function1) function1);
            }

            @Override // skip.lib.Sequence
            public <RE> Array<RE> flatMap(Function1<? super Integer, ? extends Sequence<RE>> function1) {
                return super.flatMap(function1);
            }

            @Override // skip.lib.Sequence
            public void forEach(Function1<? super Integer, Unit> function1) {
                super.forEach(function1);
            }

            @Override // skip.lib.IterableStorage, skip.lib.CollectionStorage
            public Iterable<Integer> getIterable() {
                return Collection$indices$indicesIterable$1.this;
            }

            @Override // skip.lib.Sequence
            public int getUnderestimatedCount() {
                return super.getUnderestimatedCount();
            }

            @Override // skip.lib.IterableStorage, java.lang.Iterable
            public Iterator<Integer> iterator() {
                return super.iterator();
            }

            @Override // skip.lib.Sequence
            public IteratorProtocol<Integer> makeIterator() {
                return super.makeIterator();
            }

            @Override // skip.lib.Sequence
            public <RE> Array<RE> map(Function1<? super Integer, ? extends RE> function1) {
                return super.map(function1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // skip.lib.Sequence
            public Integer max() {
                return (Integer) super.max();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // skip.lib.Sequence
            public Integer min() {
                return (Integer) super.min();
            }

            @Override // skip.lib.Sequence
            public Array<Integer> prefix(int i) {
                return super.prefix(i);
            }

            @Override // skip.lib.Sequence
            public <R> R reduce(R r, Function2<? super R, ? super Integer, ? extends R> function2) {
                return (R) super.reduce(r, function2);
            }

            @Override // skip.lib.Sequence
            public Array<Integer> reversed() {
                return super.reversed();
            }

            @Override // skip.lib.Sequence
            public Array<Integer> shuffled(InOut<RandomNumberGenerator> inOut) {
                return super.shuffled(inOut);
            }

            @Override // skip.lib.Sequence
            public Array<Integer> sorted() {
                return super.sorted();
            }

            @Override // skip.lib.Sequence
            public boolean starts(Sequence<Integer> sequence) {
                return super.starts(sequence);
            }

            @Override // skip.lib.Sequence
            public Array<Integer> suffix(int i) {
                return super.suffix(i);
            }

            @Override // skip.lib.Sequence
            public <T> T withContiguousStorageIfAvailable(Function1<Object, ? extends T> function1) {
                return (T) super.withContiguousStorageIfAvailable(function1);
            }

            @Override // skip.lib.Sequence
            public Array<Integer> prefix(Function1<? super Integer, Boolean> function1) {
                return super.prefix(function1);
            }

            @Override // skip.lib.Sequence
            public <R> R reduce(Void r1, R r, Function2<? super InOut<R>, ? super Integer, Unit> function2) {
                return (R) super.reduce(r1, r, function2);
            }

            @Override // skip.lib.Sequence
            public Array<Integer> sorted(Function2<? super Integer, ? super Integer, Boolean> function2) {
                return super.sorted(function2);
            }

            @Override // skip.lib.Sequence
            public boolean starts(Sequence<Integer> sequence, Function2<? super Integer, ? super Integer, Boolean> function2) {
                return super.starts(sequence, function2);
            }

            @Override // skip.lib.Sequence
            public /* bridge */ /* synthetic */ Integer first(Function1<? super Integer, Boolean> function1) {
                return first(function1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // skip.lib.Sequence
            public Integer max(Function2<? super Integer, ? super Integer, Boolean> function2) {
                return (Integer) super.max((Function2) function2);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // skip.lib.Sequence
            public Integer min(Function2<? super Integer, ? super Integer, Boolean> function2) {
                return (Integer) super.min((Function2) function2);
            }

            @Override // skip.lib.Sequence
            public /* bridge */ /* synthetic */ Integer max() {
                return max();
            }

            @Override // skip.lib.Sequence
            public /* bridge */ /* synthetic */ Integer min() {
                return min();
            }

            @Override // skip.lib.Sequence
            public /* bridge */ /* synthetic */ Integer max(Function2<? super Integer, ? super Integer, Boolean> function2) {
                return max(function2);
            }

            @Override // skip.lib.Sequence
            public /* bridge */ /* synthetic */ Integer min(Function2<? super Integer, ? super Integer, Boolean> function2) {
                return min(function2);
            }

            public boolean contains(int i) {
                return super.contains((Collection$indices$1) Integer.valueOf(i));
            }

            @Override // skip.lib.Sequence
            public boolean contains(Function1<? super Integer, Boolean> function1) {
                return super.contains((Function1) function1);
            }
        };
    }

    default int getStartIndex() {
        return getStorageStartIndex();
    }

    default int index(int after) {
        return after + 1;
    }

    default boolean isEmpty() {
        if (getStorageStartIndex() >= getEffectiveStorageEndIndex()) {
            return true;
        }
        return false;
    }

    default Element popFirst() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    default Array<Element> prefix(int upTo, Object unusedp) {
        if (upTo <= getStorageStartIndex()) {
            return new Array<>();
        }
        ArrayList arrayList = new ArrayList(upTo - getStartIndex());
        for (int storageStartIndex = getStorageStartIndex(); storageStartIndex < upTo; storageStartIndex++) {
            arrayList.add(kotlin.collections.CollectionsKt.B(storageStartIndex, getCollection()));
        }
        return new Array<>((Iterable) arrayList, true, false, 4, (DefaultConstructorMarker) null);
    }

    default Element randomElement(InOut<RandomNumberGenerator> using) {
        if (isEmpty()) {
            return null;
        }
        return (Element) kotlin.collections.CollectionsKt.B(NumbersKt.random(u0a.a, lnf.k(getStorageStartIndex(), getEffectiveStorageEndIndex()), using), getCollection());
    }

    default void removeAll(boolean keepingCapacity) {
        willMutateStorage();
        getMutableCollection().clear();
        didMutateStorage();
    }

    default void removeFirst(int k) {
        willMutateStorage();
        Iterator<Element> it = getMutableCollection().iterator();
        for (int i = 0; i < k; i++) {
            it.next();
            it.remove();
        }
        didMutateStorage();
    }

    default void shuffle(InOut<RandomNumberGenerator> using) {
        CollectionsKt.transformMutableCollectionAsList(this, new pu2(using, 3));
    }

    default void sort(Function2<? super Element, ? super Element, Boolean> by) {
        by.getClass();
        CollectionsKt.transformMutableCollectionAsList(this, new ta4(0, by));
    }

    default Array<Element> suffix(int from, Object unusedp) {
        if (from >= getEffectiveStorageEndIndex()) {
            return new Array<>();
        }
        ArrayList arrayList = new ArrayList(getEffectiveStorageEndIndex() - from);
        int effectiveStorageEndIndex = getEffectiveStorageEndIndex();
        while (from < effectiveStorageEndIndex) {
            arrayList.add(kotlin.collections.CollectionsKt.B(from, getCollection()));
            from++;
        }
        return new Array<>((Iterable) arrayList, true, false, 4, (DefaultConstructorMarker) null);
    }

    default void trimPrefix(Function1<? super Element, Boolean> while_) {
        while_.getClass();
        CollectionsKt.transformMutableCollectionAsList(this, new y60(while_, 13));
    }

    default Array<Element> trimmingPrefix(Function1<? super Element, Boolean> while_) {
        while_.getClass();
        return CollectionsKt.transformToArray(this, new y60(while_, 12));
    }

    default int index(int i, int offsetBy) {
        return i + offsetBy;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static <Element> boolean allSatisfy(Collection<Element> collection, Function1<? super Element, Boolean> function1) {
            function1.getClass();
            return Collection.access$allSatisfy$jd((Collection) collection, (Function1) function1);
        }

        @Deprecated
        public static <Element, RE> Array<RE> compactMap(Collection<Element> collection, Function1<? super Element, ? extends RE> function1) {
            function1.getClass();
            return Collection.access$compactMap$jd((Collection) collection, (Function1) function1);
        }

        @Deprecated
        public static <Element> boolean contains(Collection<Element> collection, Function1<? super Element, Boolean> function1) {
            function1.getClass();
            return Collection.access$contains$jd((Collection) collection, (Function1) function1);
        }

        @Deprecated
        public static <Element> int count(Collection<Element> collection, Function1<? super Element, Boolean> function1) {
            function1.getClass();
            return Collection.access$count$jd((Collection) collection, (Function1) function1);
        }

        @Deprecated
        public static <Element> void didMutateStorage(Collection<Element> collection) {
            Collection.access$didMutateStorage$jd((Collection) collection);
        }

        @Deprecated
        public static <Element> int distance(Collection<Element> collection, int i, int i2) {
            return Collection.access$distance$jd(collection, i, i2);
        }

        @Deprecated
        public static <Element> Array<Element> drop(Collection<Element> collection, Function1<? super Element, Boolean> function1) {
            function1.getClass();
            return Collection.access$drop$jd((Collection) collection, (Function1) function1);
        }

        @Deprecated
        public static <Element> Array<Element> dropFirst(Collection<Element> collection, int i) {
            return Collection.access$dropFirst$jd((Collection) collection, i);
        }

        @Deprecated
        public static <Element> Array<Element> dropLast(Collection<Element> collection, int i) {
            return Collection.access$dropLast$jd((Collection) collection, i);
        }

        @Deprecated
        public static <Element> boolean elementsEqual(Collection<Element> collection, Sequence<Element> sequence, Function2<? super Element, ? super Element, Boolean> function2) {
            sequence.getClass();
            function2.getClass();
            return Collection.access$elementsEqual$jd((Collection) collection, (Sequence) sequence, (Function2) function2);
        }

        @Deprecated
        public static <Element> Sequence<Tuple2<Integer, Element>> enumerated(Collection<Element> collection) {
            return Collection.access$enumerated$jd((Collection) collection);
        }

        @Deprecated
        public static <Element> Element first(Collection<Element> collection, Function1<? super Element, Boolean> function1) {
            function1.getClass();
            return (Element) Collection.access$first$jd((Collection) collection, (Function1) function1);
        }

        @Deprecated
        public static <Element> Integer firstIndex(Collection<Element> collection, Function1<? super Element, Boolean> function1) {
            function1.getClass();
            return Collection.access$firstIndex$jd((Collection) collection, (Function1) function1);
        }

        @Deprecated
        public static <Element, RE> Array<RE> flatMap(Collection<Element> collection, Function1<? super Element, ? extends Sequence<RE>> function1) {
            function1.getClass();
            return Collection.access$flatMap$jd((Collection) collection, (Function1) function1);
        }

        @Deprecated
        public static <Element> void forEach(Collection<Element> collection, Function1<? super Element, Unit> function1) {
            function1.getClass();
            Collection.access$forEach$jd((Collection) collection, (Function1) function1);
        }

        @Deprecated
        public static <Element> void formIndex(Collection<Element> collection, InOut<Integer> inOut) {
            inOut.getClass();
            Collection.access$formIndex$jd(collection, inOut);
        }

        @Deprecated
        public static <Element> Collection<Element> get(Collection<Element> collection, IntRange intRange) {
            intRange.getClass();
            return Collection.access$get$jd(collection, intRange);
        }

        @Deprecated
        public static <Element> java.util.Collection<Element> getCollection(Collection<Element> collection) {
            return Collection.access$getCollection$jd((Collection) collection);
        }

        @Deprecated
        public static <Element> int getCount(Collection<Element> collection) {
            return Collection.access$getCount$jd(collection);
        }

        @Deprecated
        public static <Element> int getEffectiveStorageEndIndex(Collection<Element> collection) {
            return Collection.access$getEffectiveStorageEndIndex$jd((Collection) collection);
        }

        @Deprecated
        public static <Element> int getEndIndex(Collection<Element> collection) {
            return Collection.access$getEndIndex$jd(collection);
        }

        @Deprecated
        public static <Element> Element getFirst(Collection<Element> collection) {
            return (Element) Collection.access$getFirst$jd(collection);
        }

        @Deprecated
        public static <Element> Sequence<Integer> getIndices(Collection<Element> collection) {
            return Collection.access$getIndices$jd(collection);
        }

        @Deprecated
        public static <Element> Iterable<Element> getIterable(Collection<Element> collection) {
            return Collection.access$getIterable$jd((Collection) collection);
        }

        @Deprecated
        public static <Element> int getStartIndex(Collection<Element> collection) {
            return Collection.access$getStartIndex$jd(collection);
        }

        @Deprecated
        public static <Element> Integer getStorageEndIndex(Collection<Element> collection) {
            return Collection.access$getStorageEndIndex$jd((Collection) collection);
        }

        @Deprecated
        public static <Element> int getStorageStartIndex(Collection<Element> collection) {
            return Collection.access$getStorageStartIndex$jd((Collection) collection);
        }

        @Deprecated
        public static <Element> int getUnderestimatedCount(Collection<Element> collection) {
            return Collection.access$getUnderestimatedCount$jd((Collection) collection);
        }

        @Deprecated
        public static <Element> int index(Collection<Element> collection, int i, int i2) {
            return Collection.access$index$jd(collection, i, i2);
        }

        @Deprecated
        public static <Element> boolean isEmpty(Collection<Element> collection) {
            return Collection.access$isEmpty$jd(collection);
        }

        @Deprecated
        public static <Element> Iterator<Element> iterator(Collection<Element> collection) {
            return Collection.access$iterator$jd((Collection) collection);
        }

        @Deprecated
        public static <Element> IteratorProtocol<Element> makeIterator(Collection<Element> collection) {
            return Collection.access$makeIterator$jd((Collection) collection);
        }

        @Deprecated
        public static <Element, RE> Array<RE> map(Collection<Element> collection, Function1<? super Element, ? extends RE> function1) {
            function1.getClass();
            return Collection.access$map$jd((Collection) collection, (Function1) function1);
        }

        @Deprecated
        public static <Element> Element max(Collection<Element> collection, Function2<? super Element, ? super Element, Boolean> function2) {
            function2.getClass();
            return (Element) Collection.access$max$jd((Collection) collection, (Function2) function2);
        }

        @Deprecated
        public static <Element> Element min(Collection<Element> collection, Function2<? super Element, ? super Element, Boolean> function2) {
            function2.getClass();
            return (Element) Collection.access$min$jd((Collection) collection, (Function2) function2);
        }

        @Deprecated
        public static <Element> Element popFirst(Collection<Element> collection) {
            return (Element) Collection.access$popFirst$jd(collection);
        }

        @Deprecated
        public static <Element> Array<Element> prefix(Collection<Element> collection, Function1<? super Element, Boolean> function1) {
            function1.getClass();
            return Collection.access$prefix$jd((Collection) collection, (Function1) function1);
        }

        public static /* synthetic */ Array prefix$default(Collection collection, int i, Object obj, int i2, Object obj2) {
            return Collection.prefix$default(collection, i, obj, i2, obj2);
        }

        @Deprecated
        public static <Element> Element randomElement(Collection<Element> collection, InOut<RandomNumberGenerator> inOut) {
            return (Element) Collection.access$randomElement$jd(collection, inOut);
        }

        public static /* synthetic */ Object randomElement$default(Collection collection, InOut inOut, int i, Object obj) {
            return Collection.randomElement$default(collection, inOut, i, obj);
        }

        @Deprecated
        public static <Element, R> R reduce(Collection<Element> collection, R r, Function2<? super R, ? super Element, ? extends R> function2) {
            function2.getClass();
            return (R) Collection.access$reduce$jd((Collection) collection, (Object) r, (Function2) function2);
        }

        @Deprecated
        public static <Element> void removeAll(Collection<Element> collection, boolean z) {
            Collection.access$removeAll$jd(collection, z);
        }

        public static /* synthetic */ void removeAll$default(Collection collection, boolean z, int i, Object obj) {
            Collection.removeAll$default(collection, z, i, obj);
        }

        @Deprecated
        public static <Element> Element removeFirst(Collection<Element> collection) {
            return (Element) Collection.access$removeFirst$jd(collection);
        }

        @Deprecated
        public static <Element> Array<Element> reversed(Collection<Element> collection) {
            return Collection.access$reversed$jd((Collection) collection);
        }

        @Deprecated
        public static <Element> void shuffle(Collection<Element> collection, InOut<RandomNumberGenerator> inOut) {
            Collection.access$shuffle$jd(collection, inOut);
        }

        public static /* synthetic */ void shuffle$default(Collection collection, InOut inOut, int i, Object obj) {
            Collection.shuffle$default(collection, inOut, i, obj);
        }

        @Deprecated
        public static <Element> Array<Element> shuffled(Collection<Element> collection, InOut<RandomNumberGenerator> inOut) {
            return Collection.access$shuffled$jd((Collection) collection, (InOut) inOut);
        }

        @Deprecated
        public static <Element> void sort(Collection<Element> collection, Function2<? super Element, ? super Element, Boolean> function2) {
            function2.getClass();
            Collection.access$sort$jd(collection, function2);
        }

        @Deprecated
        public static <Element> Array<Element> sorted(Collection<Element> collection, Function2<? super Element, ? super Element, Boolean> function2) {
            function2.getClass();
            return Collection.access$sorted$jd((Collection) collection, (Function2) function2);
        }

        @Deprecated
        public static <Element> boolean starts(Collection<Element> collection, Sequence<Element> sequence, Function2<? super Element, ? super Element, Boolean> function2) {
            sequence.getClass();
            function2.getClass();
            return Collection.access$starts$jd((Collection) collection, (Sequence) sequence, (Function2) function2);
        }

        @Deprecated
        public static <Element> Array<Element> suffix(Collection<Element> collection, int i) {
            return Collection.access$suffix$jd((Collection) collection, i);
        }

        public static /* synthetic */ Array suffix$default(Collection collection, int i, Object obj, int i2, Object obj2) {
            return Collection.suffix$default(collection, i, obj, i2, obj2);
        }

        @Deprecated
        public static <Element> void trimPrefix(Collection<Element> collection, Function1<? super Element, Boolean> function1) {
            function1.getClass();
            Collection.access$trimPrefix$jd(collection, function1);
        }

        @Deprecated
        public static <Element> Array<Element> trimmingPrefix(Collection<Element> collection, Function1<? super Element, Boolean> function1) {
            function1.getClass();
            return Collection.access$trimmingPrefix$jd(collection, function1);
        }

        @Deprecated
        public static <Element> void willMutateStorage(Collection<Element> collection) {
            Collection.access$willMutateStorage$jd((Collection) collection);
        }

        @Deprecated
        public static <Element> void willSliceStorage(Collection<Element> collection) {
            Collection.access$willSliceStorage$jd((Collection) collection);
        }

        @Deprecated
        public static <Element, T> T withContiguousStorageIfAvailable(Collection<Element> collection, Function1<Object, ? extends T> function1) {
            function1.getClass();
            return (T) Collection.access$withContiguousStorageIfAvailable$jd((Collection) collection, (Function1) function1);
        }

        @Deprecated
        public static <Element> int index(Collection<Element> collection, int i) {
            return Collection.access$index$jd(collection, i);
        }

        public static /* synthetic */ Array prefix$default(Collection collection, int i, Object obj, Object obj2, int i2, Object obj3) {
            return Collection.prefix$default(collection, i, obj, obj2, i2, obj3);
        }

        @Deprecated
        public static <Element> void removeFirst(Collection<Element> collection, int i) {
            Collection.access$removeFirst$jd(collection, i);
        }

        @Deprecated
        public static <Element> Array<Element> suffix(Collection<Element> collection, int i, Object obj) {
            return Collection.access$suffix$jd(collection, i, obj);
        }

        @Deprecated
        public static <Element> void formIndex(Collection<Element> collection, InOut<Integer> inOut, int i) {
            inOut.getClass();
            Collection.access$formIndex$jd(collection, inOut, i);
        }

        @Deprecated
        public static <Element> void sort(Collection<Element> collection) {
            Collection.access$sort$jd(collection);
        }

        @Deprecated
        public static <Element> boolean contains(Collection<Element> collection, Element element) {
            return Collection.access$contains$jd((Collection) collection, (Object) element);
        }

        @Deprecated
        public static <Element> Integer firstIndex(Collection<Element> collection, Element element) {
            return Collection.access$firstIndex$jd(collection, element);
        }

        @Deprecated
        public static <Element> Element max(Collection<Element> collection) {
            return (Element) Collection.access$max$jd((Collection) collection);
        }

        @Deprecated
        public static <Element> Element min(Collection<Element> collection) {
            return (Element) Collection.access$min$jd((Collection) collection);
        }

        @Deprecated
        public static <Element> Array<Element> prefix(Collection<Element> collection, int i) {
            return Collection.access$prefix$jd((Collection) collection, i);
        }

        @Deprecated
        public static <Element, R> R reduce(Collection<Element> collection, Void r1, R r, Function2<? super InOut<R>, ? super Element, Unit> function2) {
            function2.getClass();
            return (R) Collection.access$reduce$jd((Collection) collection, r1, (Object) r, (Function2) function2);
        }

        @Deprecated
        public static <Element> Array<Element> sorted(Collection<Element> collection) {
            return Collection.access$sorted$jd((Collection) collection);
        }

        @Deprecated
        public static <Element> Array<Element> prefix(Collection<Element> collection, int i, Object obj) {
            return Collection.access$prefix$jd(collection, i, obj);
        }

        @Deprecated
        public static <Element> Array<Element> prefix(Collection<Element> collection, int i, Object obj, Object obj2) {
            return Collection.access$prefix$jd(collection, i, obj, obj2);
        }

        @Deprecated
        public static <Element> boolean starts(Collection<Element> collection, Sequence<Element> sequence) {
            sequence.getClass();
            return Collection.access$starts$jd((Collection) collection, (Sequence) sequence);
        }
    }

    static /* synthetic */ void access$formIndex$jd(Collection collection, InOut inOut, int i) {
        super.formIndex(inOut, i);
    }

    static /* synthetic */ void access$sort$jd(Collection collection, Function2 function2) {
        super.sort(function2);
    }

    static /* synthetic */ boolean access$contains$jd(Collection collection, Function1 function1) {
        return super.contains(function1);
    }

    static /* synthetic */ Integer access$firstIndex$jd(Collection collection, Function1 function1) {
        return super.firstIndex(function1);
    }

    static /* synthetic */ int access$index$jd(Collection collection, int i, int i2) {
        return super.index(i, i2);
    }

    static /* synthetic */ Object access$max$jd(Collection collection, Function2 function2) {
        return super.max(function2);
    }

    static /* synthetic */ Object access$min$jd(Collection collection, Function2 function2) {
        return super.min(function2);
    }

    static /* synthetic */ Array access$prefix$jd(Collection collection, int i, Object obj) {
        return super.prefix(i, obj);
    }

    static /* synthetic */ Object access$reduce$jd(Collection collection, Void r1, Object obj, Function2 function2) {
        return super.reduce(r1, obj, function2);
    }

    static /* synthetic */ void access$removeFirst$jd(Collection collection, int i) {
        super.removeFirst(i);
    }

    static /* synthetic */ Array access$sorted$jd(Collection collection, Function2 function2) {
        return super.sorted(function2);
    }

    static /* synthetic */ boolean access$starts$jd(Collection collection, Sequence sequence, Function2 function2) {
        return super.starts(sequence, function2);
    }

    static /* synthetic */ Array access$suffix$jd(Collection collection, int i, Object obj) {
        return super.suffix(i, obj);
    }

    static /* synthetic */ Array access$prefix$jd(Collection collection, int i, Object obj, Object obj2) {
        return super.prefix(i, obj, obj2);
    }

    static /* synthetic */ Array access$prefix$jd(Collection collection, Function1 function1) {
        return super.prefix(function1);
    }

    default void sort() {
        sort(new t54(1, (byte) 0));
    }

    default void formIndex(InOut<Integer> i, int offsetBy) {
        i.getClass();
        i.setValue(Integer.valueOf(i.getValue().intValue() + offsetBy));
    }

    static /* synthetic */ Array prefix$default(Collection collection, int i, Object obj, int i2, Object obj2) {
        if (obj2 != null) {
            py2.f("Super calls with default arguments not supported in this target, function: prefix");
            return null;
        }
        if ((i2 & 2) != 0) {
            obj = null;
        }
        return collection.prefix(i, obj);
    }

    default Element removeFirst() {
        willMutateStorage();
        Iterator<Element> it = getMutableCollection().iterator();
        Element next = it.next();
        it.remove();
        didMutateStorage();
        return next;
    }

    default Integer firstIndex(Element of) {
        int K = kotlin.collections.CollectionsKt.K(this, of);
        if (K == -1) {
            return null;
        }
        return Integer.valueOf(K);
    }

    default Array<Element> prefix(int through, Object unusedp0, Object unusedp1) {
        return prefix$default(this, through + 1, null, 2, null);
    }
}
