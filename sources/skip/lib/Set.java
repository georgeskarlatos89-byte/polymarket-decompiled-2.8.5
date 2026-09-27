package skip.lib;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 U*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0000\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u00042\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005:\u0001UB\u0013\b\u0016\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\t\u0010\u000fB+\b\u0016\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\t\u0010\u0012J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020$H\u0016J\b\u0010&\u001a\u00020$H\u0016J \u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0)J\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\fJ\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\fJ\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\fJ\u0014\u00100\u001a\u00020$2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\fJ\u0014\u00101\u001a\u00020$2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\fJ\u0014\u00102\u001a\u00020$2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\fJ\u001a\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\fJ\u0014\u00104\u001a\u00020\u000e2\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\fJ\u0014\u00106\u001a\u00020\u000e2\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\fJ\u0014\u00108\u001a\u00020\u000e2\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\fJ\u0014\u00109\u001a\u00020$2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\fJ\u0014\u0010:\u001a\u00020\u000e2\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\fJ\u0014\u0010;\u001a\u00020\u000e2\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\fJ\u0015\u0010<\u001a\u00020\u000e2\u0006\u0010=\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010>J\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J!\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u00000@2\u0006\u0010=\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010AJ\u0017\u0010B\u001a\u0004\u0018\u00018\u00002\u0006\u0010=\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010CJ\u0017\u0010D\u001a\u0004\u0018\u00018\u00002\u0006\u00107\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010CJ\u0016\u00100\u001a\u00020$2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u0016\u00101\u001a\u00020$2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u0016\u00102\u001a\u00020$2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u001c\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u0016\u00104\u001a\u00020\u000e2\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u0016\u00106\u001a\u00020\u000e2\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u0016\u00108\u001a\u00020\u000e2\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u0016\u00109\u001a\u00020$2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u0016\u0010:\u001a\u00020\u000e2\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u0016\u0010;\u001a\u00020\u000e2\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u0013\u0010E\u001a\u00020\u000e2\b\u0010-\u001a\u0004\u0018\u00010FH\u0096\u0002J\b\u0010G\u001a\u00020\bH\u0016J\b\u0010H\u001a\u00020IH\u0016J\b\u0010S\u001a\u00020\u0004H\u0016J\u0014\u0010T\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0013\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0015j\b\u0012\u0004\u0012\u00028\u0000`\u0016X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0015j\b\u0012\u0004\u0012\u00028\u0000`\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001fR\u0014\u0010*\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R(\u0010J\u001a\u0010\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020$\u0018\u00010)X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001a\u0010O\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010\n¨\u0006V"}, d2 = {"Lskip/lib/Set;", "Element", "Lskip/lib/Collection;", "Lskip/lib/SetAlgebra;", "Lskip/lib/MutableStruct;", "Lskip/lib/KotlinConverting;", "", "minimumCapacity", "", "<init>", "(I)V", "collection", "Lskip/lib/Sequence;", "nocopy", "", "(Lskip/lib/Sequence;Z)V", "", "shared", "(Ljava/lang/Iterable;ZZ)V", "isStorageShared", PlaceTypes.STORAGE, "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "getStorage$SkipLib", "()Ljava/util/LinkedHashSet;", "setStorage$SkipLib", "(Ljava/util/LinkedHashSet;)V", "mutableStorage", "getMutableStorage$SkipLib", "", "getCollection", "()Ljava/util/Collection;", "mutableCollection", "", "getMutableCollection", "willSliceStorage", "", "willMutateStorage", "didMutateStorage", "filter", "isIncluded", "Lkotlin/Function1;", "isEmpty", "()Z", "union", "other", PlaceTypes.INTERSECTION, "symmetricDifference", "formUnion", "formIntersection", "formSymmetricDifference", "subtracting", "isSubset", "of", "isDisjoint", "with", "isSuperset", "subtract", "isStrictSubset", "isStrictSuperset", "contains", "element", "(Ljava/lang/Object;)Z", "insert", "Lskip/lib/Tuple2;", "(Ljava/lang/Object;)Lskip/lib/Tuple2;", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", "update", "equals", "", "hashCode", "toString", "", "supdate", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "scopy", "kotlin", "Companion", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Set<Element> implements Collection<Element>, SetAlgebra<Set<Element>, Element>, MutableStruct, KotlinConverting<java.util.Set<?>> {
    private boolean isStorageShared;
    private int smutatingcount;
    private LinkedHashSet<Element> storage;
    private Function1<Object, Unit> supdate;

    public Set(Iterable<? extends Element> iterable, boolean z, boolean z2) {
        iterable.getClass();
        if (z && (iterable instanceof LinkedHashSet)) {
            this.storage = (LinkedHashSet) iterable;
            this.isStorageShared = z2;
            return;
        }
        LinkedHashSet<Element> linkedHashSet = new LinkedHashSet<>();
        this.storage = linkedHashSet;
        if (z) {
            kotlin.collections.CollectionsKt.o(linkedHashSet, iterable);
            return;
        }
        Iterator<? extends Element> it = iterable.iterator();
        while (it.hasNext()) {
            this.storage.add(StructKt.sref$default(it.next(), null, 1, null));
        }
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
        return this.storage.contains(element);
    }

    @Override // skip.lib.Sequence
    public int count(Function1<? super Element, Boolean> function1) {
        return super.count(function1);
    }

    @Override // skip.lib.CollectionStorage
    public void didMutateStorage() {
        didmutate();
    }

    @Override // skip.lib.MutableStruct
    public void didmutate() {
        super.didmutate();
    }

    @Override // skip.lib.Collection
    public int distance(int i, int i2) {
        return super.distance(i, i2);
    }

    @Override // skip.lib.Sequence
    public Array<Element> drop(Function1<? super Element, Boolean> function1) {
        return super.drop(function1);
    }

    @Override // skip.lib.Sequence
    public Array<Element> dropFirst(int i) {
        return super.dropFirst(i);
    }

    @Override // skip.lib.Sequence
    public Array<Element> dropLast(int i) {
        return super.dropLast(i);
    }

    @Override // skip.lib.Sequence
    public boolean elementsEqual(Sequence<Element> sequence, Function2<? super Element, ? super Element, Boolean> function2) {
        return super.elementsEqual(sequence, function2);
    }

    @Override // skip.lib.Sequence
    public Sequence<Tuple2<Integer, Element>> enumerated() {
        return super.enumerated();
    }

    public boolean equals(Object other) {
        Set set;
        if (other == this) {
            return true;
        }
        if (other instanceof Set) {
            set = (Set) other;
        } else {
            set = null;
        }
        if (set == null) {
            return false;
        }
        return Intrinsics.areEqual(((Set) other).storage, this.storage);
    }

    public final Set<Element> filter(Function1<? super Element, Boolean> isIncluded) {
        isIncluded.getClass();
        LinkedHashSet<Element> linkedHashSet = this.storage;
        ArrayList arrayList = new ArrayList();
        for (Element element : linkedHashSet) {
            if (isIncluded.invoke(element).booleanValue()) {
                arrayList.add(element);
            }
        }
        return new Set<>(arrayList, true, false, 4, null);
    }

    @Override // skip.lib.Sequence
    public Element first(Function1<? super Element, Boolean> function1) {
        return (Element) super.first(function1);
    }

    @Override // skip.lib.Collection
    public Integer firstIndex(Element element) {
        return super.firstIndex((Set<Element>) element);
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

    public final void formIntersection(Sequence<Element> other) {
        other.getClass();
        willmutate();
        Iterator<Element> it = other.getIterable().iterator();
        while (it.hasNext()) {
            getMutableStorage$SkipLib().remove(it.next());
        }
        didmutate();
    }

    public final void formSymmetricDifference(Sequence<Element> other) {
        other.getClass();
        willmutate();
        for (Element element : other.getIterable()) {
            if (!getMutableStorage$SkipLib().remove(element)) {
                getMutableStorage$SkipLib().add(StructKt.sref$default(element, null, 1, null));
            }
        }
        didmutate();
    }

    public final void formUnion(Sequence<Element> other) {
        other.getClass();
        willmutate();
        Iterator<Element> it = other.getIterable().iterator();
        while (it.hasNext()) {
            getMutableStorage$SkipLib().add(StructKt.sref$default(it.next(), null, 1, null));
        }
        didmutate();
    }

    @Override // skip.lib.Collection
    public Collection<Element> get(IntRange intRange) {
        return super.get(intRange);
    }

    @Override // skip.lib.CollectionStorage
    public java.util.Collection<Element> getCollection() {
        return this.storage;
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
        return getMutableStorage$SkipLib();
    }

    public final LinkedHashSet<Element> getMutableStorage$SkipLib() {
        if (this.isStorageShared) {
            this.storage = new LinkedHashSet<>(this.storage);
            this.isStorageShared = false;
        }
        return this.storage;
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    @Override // skip.lib.Collection
    public int getStartIndex() {
        return super.getStartIndex();
    }

    public final LinkedHashSet<Element> getStorage$SkipLib() {
        return this.storage;
    }

    @Override // skip.lib.CollectionStorage
    public Integer getStorageEndIndex() {
        return super.getStorageEndIndex();
    }

    @Override // skip.lib.CollectionStorage
    public int getStorageStartIndex() {
        return super.getStorageStartIndex();
    }

    @Override // skip.lib.MutableStruct
    public Function1<Object, Unit> getSupdate() {
        return this.supdate;
    }

    @Override // skip.lib.Sequence
    public int getUnderestimatedCount() {
        return super.getUnderestimatedCount();
    }

    public int hashCode() {
        return this.storage.hashCode();
    }

    @Override // skip.lib.Collection
    public int index(int i) {
        return super.index(i);
    }

    @Override // skip.lib.SetAlgebra
    public Tuple2<Boolean, Element> insert(Element element) {
        int K = kotlin.collections.CollectionsKt.K(this.storage, element);
        if (K != -1) {
            return new Tuple2<>(Boolean.FALSE, kotlin.collections.CollectionsKt.B(K, this.storage));
        }
        willmutate();
        getMutableStorage$SkipLib().add(StructKt.sref$default(element, null, 1, null));
        didmutate();
        return new Tuple2<>(Boolean.TRUE, element);
    }

    public final Set<Element> intersection(Sequence<Element> other) {
        other.getClass();
        return new Set<>(kotlin.collections.CollectionsKt.L(this.storage, other.getIterable()), true, false, 4, null);
    }

    public final boolean isDisjoint(Sequence<Element> with) {
        with.getClass();
        Iterator<Element> it = with.getIterable().iterator();
        while (it.hasNext()) {
            if (contains((Set<Element>) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // skip.lib.Collection
    public boolean isEmpty() {
        if (getCount() == 0) {
            return true;
        }
        return false;
    }

    public final boolean isStrictSubset(Sequence<Element> of) {
        of.getClass();
        if (getCount() < kotlin.collections.CollectionsKt.y(of.getIterable()) && isSubset(of)) {
            return true;
        }
        return false;
    }

    public final boolean isStrictSuperset(Sequence<Element> of) {
        of.getClass();
        if (getCount() > kotlin.collections.CollectionsKt.y(of.getIterable()) && isSuperset(of)) {
            return true;
        }
        return false;
    }

    public final boolean isSubset(Sequence<Element> of) {
        of.getClass();
        Iterator<Element> it = this.storage.iterator();
        it.getClass();
        while (it.hasNext()) {
            if (!of.contains((Sequence<Element>) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean isSuperset(Sequence<Element> of) {
        of.getClass();
        Iterator<Element> it = of.getIterable().iterator();
        while (it.hasNext()) {
            if (!this.storage.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // skip.lib.IterableStorage, java.lang.Iterable
    public Iterator<Element> iterator() {
        return super.iterator();
    }

    @Override // skip.lib.KotlinConverting
    /* renamed from: kotlin, reason: avoid collision after fix types in other method */
    public java.util.Set<?> kotlin2(boolean nocopy) {
        if (nocopy) {
            return getMutableStorage$SkipLib();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<Element> it = this.storage.iterator();
        it.getClass();
        while (it.hasNext()) {
            Element next = it.next();
            Object obj = null;
            if (next != null) {
                obj = KotlinSupportKt.kotlin$default(next, false, 1, null);
            }
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
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
    public Array<Element> prefix(int i) {
        return super.prefix(i);
    }

    @Override // skip.lib.Collection
    public Element randomElement(InOut<RandomNumberGenerator> inOut) {
        return (Element) super.randomElement(inOut);
    }

    @Override // skip.lib.Sequence
    public <R> R reduce(R r, Function2<? super R, ? super Element, ? extends R> function2) {
        return (R) super.reduce(r, function2);
    }

    @Override // skip.lib.SetAlgebra
    public Element remove(Element element) {
        Element element2;
        willmutate();
        int K = kotlin.collections.CollectionsKt.K(this.storage, element);
        if (K == -1) {
            element2 = null;
        } else {
            Object B = kotlin.collections.CollectionsKt.B(K, this.storage);
            getMutableStorage$SkipLib().remove(element);
            element2 = (Element) B;
        }
        didmutate();
        return element2;
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

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new Set(this, true);
    }

    @Override // skip.lib.MutableStruct
    public void setSmutatingcount(int i) {
        this.smutatingcount = i;
    }

    public final void setStorage$SkipLib(LinkedHashSet<Element> linkedHashSet) {
        linkedHashSet.getClass();
        this.storage = linkedHashSet;
    }

    @Override // skip.lib.MutableStruct
    public void setSupdate(Function1<Object, Unit> function1) {
        this.supdate = function1;
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

    public final void subtract(Sequence<Element> other) {
        other.getClass();
        willmutate();
        kotlin.collections.CollectionsKt.m0(getMutableStorage$SkipLib(), other.getIterable());
        didmutate();
    }

    public final Set<Element> subtracting(Sequence<Element> other) {
        other.getClass();
        return new Set<>(kotlin.collections.CollectionsKt.A0(this.storage, other.getIterable()), true, false, 4, null);
    }

    @Override // skip.lib.Sequence
    public Array<Element> suffix(int i) {
        return super.suffix(i);
    }

    public final Set<Element> symmetricDifference(Sequence<Element> other) {
        other.getClass();
        Set<Element> set = new Set<>(other, false, 2, null);
        Iterator<Element> it = this.storage.iterator();
        it.getClass();
        while (it.hasNext()) {
            Element next = it.next();
            if (set.remove(next) == null) {
                set.insert(next);
            }
        }
        return set;
    }

    public String toString() {
        String obj = this.storage.toString();
        obj.getClass();
        return obj;
    }

    @Override // skip.lib.Collection
    public void trimPrefix(Function1<? super Element, Boolean> function1) {
        super.trimPrefix(function1);
    }

    @Override // skip.lib.Collection
    public Array<Element> trimmingPrefix(Function1<? super Element, Boolean> function1) {
        return super.trimmingPrefix(function1);
    }

    public final Set<Element> union(Sequence<Element> other) {
        other.getClass();
        return new Set<>(kotlin.collections.CollectionsKt.R0(this.storage, other.getIterable()), true, false, 4, null);
    }

    @Override // skip.lib.SetAlgebra
    public Element update(Element with) {
        Element element;
        willmutate();
        int K = kotlin.collections.CollectionsKt.K(this.storage, with);
        if (K == -1) {
            element = null;
        } else {
            element = (Element) kotlin.collections.CollectionsKt.B(K, this.storage);
            getMutableStorage$SkipLib().remove(with);
        }
        getMutableStorage$SkipLib().add(StructKt.sref$default(with, null, 1, null));
        didmutate();
        return element;
    }

    @Override // skip.lib.CollectionStorage
    public void willMutateStorage() {
        willmutate();
    }

    @Override // skip.lib.CollectionStorage
    public void willSliceStorage() {
        this.isStorageShared = true;
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    @Override // skip.lib.Sequence
    public <T> T withContiguousStorageIfAvailable(Function1<Object, ? extends T> function1) {
        return (T) super.withContiguousStorageIfAvailable(function1);
    }

    @Override // skip.lib.Collection
    public void formIndex(InOut<Integer> inOut, int i) {
        super.formIndex(inOut, i);
    }

    @Override // skip.lib.Collection
    public void sort(Function2<? super Element, ? super Element, Boolean> function2) {
        super.sort(function2);
    }

    @Override // skip.lib.Collection
    public Integer firstIndex(Function1<? super Element, Boolean> function1) {
        return super.firstIndex((Function1) function1);
    }

    @Override // skip.lib.Collection
    public int index(int i, int i2) {
        return super.index(i, i2);
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
    public Array<Element> prefix(int i, Object obj) {
        return super.prefix(i, obj);
    }

    @Override // skip.lib.Sequence
    public <R> R reduce(Void r1, R r, Function2<? super InOut<R>, ? super Element, Unit> function2) {
        return (R) super.reduce(r1, r, function2);
    }

    @Override // skip.lib.Collection
    public void removeFirst(int i) {
        super.removeFirst(i);
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
    public Array<Element> suffix(int i, Object obj) {
        return super.suffix(i, obj);
    }

    @Override // skip.lib.Collection
    public Array<Element> prefix(int i, Object obj, Object obj2) {
        return super.prefix(i, obj, obj2);
    }

    @Override // skip.lib.Sequence
    public boolean contains(Function1<? super Element, Boolean> function1) {
        return super.contains((Function1) function1);
    }

    @Override // skip.lib.Sequence
    public Array<Element> prefix(Function1<? super Element, Boolean> function1) {
        return super.prefix(function1);
    }

    @Override // skip.lib.SetAlgebra
    public /* bridge */ /* synthetic */ void subtract(SetAlgebra setAlgebra) {
        subtract((Set) setAlgebra);
    }

    public void subtract(Set<Element> other) {
        other.getClass();
        subtract((Sequence) other);
    }

    @Override // skip.lib.SetAlgebra
    public /* bridge */ /* synthetic */ SetAlgebra intersection(SetAlgebra setAlgebra) {
        return intersection((Set) setAlgebra);
    }

    @Override // skip.lib.SetAlgebra
    public /* bridge */ /* synthetic */ SetAlgebra subtracting(SetAlgebra setAlgebra) {
        return subtracting((Set) setAlgebra);
    }

    @Override // skip.lib.SetAlgebra
    public /* bridge */ /* synthetic */ SetAlgebra union(SetAlgebra setAlgebra) {
        return union((Set) setAlgebra);
    }

    public Set<Element> intersection(Set<Element> other) {
        other.getClass();
        return intersection((Sequence) other);
    }

    public Set<Element> subtracting(Set<Element> other) {
        other.getClass();
        return subtracting((Sequence) other);
    }

    public Set<Element> union(Set<Element> other) {
        other.getClass();
        return union((Sequence) other);
    }

    @Override // skip.lib.SetAlgebra
    public /* bridge */ /* synthetic */ boolean isStrictSubset(SetAlgebra setAlgebra) {
        return isStrictSubset((Set) setAlgebra);
    }

    @Override // skip.lib.SetAlgebra
    public /* bridge */ /* synthetic */ boolean isStrictSuperset(SetAlgebra setAlgebra) {
        return isStrictSuperset((Set) setAlgebra);
    }

    public boolean isStrictSubset(Set<Element> of) {
        of.getClass();
        return isStrictSubset((Sequence) of);
    }

    public boolean isStrictSuperset(Set<Element> of) {
        of.getClass();
        return isStrictSuperset((Sequence) of);
    }

    @Override // skip.lib.SetAlgebra
    public /* bridge */ /* synthetic */ boolean isDisjoint(SetAlgebra setAlgebra) {
        return isDisjoint((Set) setAlgebra);
    }

    public boolean isDisjoint(Set<Element> with) {
        with.getClass();
        return isDisjoint((Sequence) with);
    }

    @Override // skip.lib.SetAlgebra
    public /* bridge */ /* synthetic */ boolean isSubset(SetAlgebra setAlgebra) {
        return isSubset((Set) setAlgebra);
    }

    public boolean isSubset(Set<Element> of) {
        of.getClass();
        return isSubset((Sequence) of);
    }

    @Override // skip.lib.SetAlgebra
    public /* bridge */ /* synthetic */ boolean isSuperset(SetAlgebra setAlgebra) {
        return isSuperset((Set) setAlgebra);
    }

    public boolean isSuperset(Set<Element> of) {
        of.getClass();
        return isSuperset((Sequence) of);
    }

    @Override // skip.lib.SetAlgebra
    public /* bridge */ /* synthetic */ void formIntersection(SetAlgebra setAlgebra) {
        formIntersection((Set) setAlgebra);
    }

    public void formIntersection(Set<Element> other) {
        other.getClass();
        formIntersection((Sequence) other);
    }

    @Override // skip.lib.SetAlgebra
    public /* bridge */ /* synthetic */ SetAlgebra symmetricDifference(SetAlgebra setAlgebra) {
        return symmetricDifference((Set) setAlgebra);
    }

    @Override // skip.lib.SetAlgebra
    public /* bridge */ /* synthetic */ void formUnion(SetAlgebra setAlgebra) {
        formUnion((Set) setAlgebra);
    }

    public Set<Element> symmetricDifference(Set<Element> other) {
        other.getClass();
        return symmetricDifference((Sequence) other);
    }

    public void formUnion(Set<Element> other) {
        other.getClass();
        formUnion((Sequence) other);
    }

    @Override // skip.lib.KotlinConverting
    public /* bridge */ /* synthetic */ java.util.Set<?> kotlin(boolean z) {
        return kotlin2(z);
    }

    @Override // skip.lib.SetAlgebra
    public /* bridge */ /* synthetic */ void formSymmetricDifference(SetAlgebra setAlgebra) {
        formSymmetricDifference((Set) setAlgebra);
    }

    public void formSymmetricDifference(Set<Element> other) {
        other.getClass();
        formSymmetricDifference((Sequence) other);
    }

    public /* synthetic */ Set(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public Set(Sequence<Element> sequence, boolean z) {
        sequence.getClass();
        if (z && (sequence instanceof Set)) {
            Set set = (Set) sequence;
            this.storage = set.storage;
            set.isStorageShared = true;
            this.isStorageShared = true;
            return;
        }
        LinkedHashSet<Element> linkedHashSet = new LinkedHashSet<>();
        this.storage = linkedHashSet;
        kotlin.collections.CollectionsKt.o(linkedHashSet, sequence);
    }

    public /* synthetic */ Set(Sequence sequence, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sequence, (i & 2) != 0 ? false : z);
    }

    public Set(int i) {
        this.storage = new LinkedHashSet<>();
    }

    public /* synthetic */ Set(Iterable iterable, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(iterable, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }
}
