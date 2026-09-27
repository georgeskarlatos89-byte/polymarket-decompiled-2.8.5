package skip.lib;

import defpackage.hhj;
import defpackage.ok0;
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
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 >*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u00052\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006:\u0001>B\t\b\u0016¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\b\u0010\rB+\b\u0016\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\b\u0010\u0013B+\b\u0016\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\b\u0010\u0015J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020!H\u0016J\b\u0010#\u001a\u00020!H\u0016J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086\u0002J\u0016\u0010&\u001a\u00028\u00002\u0006\u0010'\u001a\u00020\fH\u0086\u0002¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\u00112\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001a\u00020\fH\u0016J\b\u0010-\u001a\u00020.H\u0016J\b\u0010:\u001a\u00020\u0005H\u0016J\u0014\u0010;\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010<\u001a\u00020!2\u0006\u0010=\u001a\u00020\fR\u000e\u0010\u0016\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR(\u0010/\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020!\u0018\u000100X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u00105\u001a\u00020\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006?"}, d2 = {"Lskip/lib/Array;", "Element", "Lskip/lib/RandomAccessCollection;", "Lskip/lib/RangeReplaceableCollection;", "Lskip/lib/MutableCollection;", "Lskip/lib/MutableStruct;", "Lskip/lib/KotlinConverting;", "", "<init>", "()V", "repeating", "count", "", "(Ljava/lang/Object;I)V", "collection", "Lskip/lib/Sequence;", "nocopy", "", "shared", "(Lskip/lib/Sequence;ZZ)V", "", "(Ljava/lang/Iterable;ZZ)V", "isStorageShared", "_mutableList", "_collection", "", "", "getCollection", "()Ljava/util/Collection;", "mutableList", "getMutableList", "()Ljava/util/List;", "willSliceStorage", "", "willMutateStorage", "didMutateStorage", "plus", "array", "get", "position", "(I)Ljava/lang/Object;", "equals", "other", "", "hashCode", "toString", "", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "kotlin", "reserveCapacity", "n", "Companion", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Array<Element> implements RandomAccessCollection<Element>, RangeReplaceableCollection<Element>, MutableCollection<Element>, MutableStruct, KotlinConverting<List<?>> {
    private List<? extends Element> _collection;
    private List<Element> _mutableList;
    private boolean isStorageShared;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    public Array(Sequence<Element> sequence, boolean z, boolean z2) {
        sequence.getClass();
        if (z) {
            if (sequence instanceof Array) {
                Array array = (Array) sequence;
                List<Element> list = array._mutableList;
                if (list != null) {
                    if (z2) {
                        array.isStorageShared = true;
                        this.isStorageShared = true;
                    }
                    this._mutableList = list;
                } else {
                    this._collection = array._collection;
                }
            } else {
                if (sequence instanceof MutableListStorage) {
                    MutableListStorage mutableListStorage = (MutableListStorage) sequence;
                    if (mutableListStorage.getStorageStartIndex() == 0 && mutableListStorage.getStorageEndIndex() == null) {
                        List<Element> mutableList = mutableListStorage.getMutableList();
                        mutableList.getClass();
                        this._mutableList = hhj.b(mutableList);
                        this.isStorageShared = z2;
                    }
                }
                if (sequence instanceof CollectionStorage) {
                    CollectionStorage collectionStorage = (CollectionStorage) sequence;
                    if (collectionStorage.getStorageStartIndex() == 0 && collectionStorage.getStorageEndIndex() == null) {
                        java.util.Collection<Element> collection = collectionStorage.getCollection();
                        if (collection instanceof List) {
                            this._collection = (List) collection;
                        }
                    }
                }
            }
        }
        if (this._mutableList == null && this._collection == null) {
            ArrayList arrayList = new ArrayList();
            kotlin.collections.CollectionsKt.o(arrayList, sequence);
            this._mutableList = arrayList;
        }
    }

    public static /* synthetic */ Unit a(Array array, int i, Object obj) {
        return get$lambda$2(array, i, obj);
    }

    private static final Unit get$lambda$2(Array array, int i, Object obj) {
        array.set(i, (int) obj);
        return Unit.INSTANCE;
    }

    @Override // skip.lib.Sequence
    public boolean allSatisfy(Function1<? super Element, Boolean> function1) {
        return super.allSatisfy(function1);
    }

    @Override // skip.lib.RangeReplaceableCollection
    public void append(Element element) {
        super.append((Array<Element>) element);
    }

    @Override // skip.lib.Sequence
    public <RE> Array<RE> compactMap(Function1<? super Element, ? extends RE> function1) {
        return super.compactMap(function1);
    }

    @Override // skip.lib.Sequence
    public boolean contains(Element element) {
        return super.contains((Array<Element>) element);
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
        if (other == this) {
            return true;
        }
        if (!(other instanceof Sequence)) {
            return false;
        }
        return Sequence.elementsEqual$default(this, (Sequence) other, null, 2, null);
    }

    @Override // skip.lib.Sequence
    public Element first(Function1<? super Element, Boolean> function1) {
        return (Element) super.first(function1);
    }

    @Override // skip.lib.Collection
    public Integer firstIndex(Element element) {
        return super.firstIndex((Array<Element>) element);
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

    public final Element get(int position) {
        return (Element) StructKt.sref(kotlin.collections.CollectionsKt.B(position, getCollection()), new ok0(this, position, 0));
    }

    @Override // skip.lib.CollectionStorage
    public java.util.Collection<Element> getCollection() {
        List<Element> list = this._mutableList;
        if (list != null) {
            return list;
        }
        List<? extends Element> list2 = this._collection;
        list2.getClass();
        return list2;
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

    @Override // skip.lib.BidirectionalCollection
    public Element getLast() {
        return (Element) super.getLast();
    }

    @Override // skip.lib.CollectionStorage, skip.lib.MutableListStorage
    public java.util.Collection<Element> getMutableCollection() {
        return super.getMutableCollection();
    }

    @Override // skip.lib.MutableListStorage
    public List<Element> getMutableList() {
        List<Element> list;
        if (!this.isStorageShared && (list = this._mutableList) != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(getCollection());
        this.isStorageShared = false;
        this._mutableList = arrayList;
        this._collection = null;
        return arrayList;
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    @Override // skip.lib.Collection
    public int getStartIndex() {
        return super.getStartIndex();
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
        return getCollection().hashCode();
    }

    @Override // skip.lib.Collection
    public int index(int i) {
        return super.index(i);
    }

    @Override // skip.lib.RangeReplaceableCollection
    public void insert(Element element, int i) {
        super.insert((Array<Element>) element, i);
    }

    @Override // skip.lib.Collection
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // skip.lib.IterableStorage, java.lang.Iterable
    public Iterator<Element> iterator() {
        return super.iterator();
    }

    @Override // skip.lib.KotlinConverting
    /* renamed from: kotlin, reason: avoid collision after fix types in other method */
    public List<?> kotlin2(boolean nocopy) {
        if (nocopy) {
            return getMutableList();
        }
        ArrayList arrayList = new ArrayList();
        for (Element element : getCollection()) {
            Object obj = null;
            if (element != null) {
                obj = KotlinSupportKt.kotlin$default(element, false, 1, null);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    @Override // skip.lib.BidirectionalCollection
    public Element last(Function1<? super Element, Boolean> function1) {
        return (Element) super.last(function1);
    }

    @Override // skip.lib.BidirectionalCollection
    public Integer lastIndex(Element element) {
        return super.lastIndex((Array<Element>) element);
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

    public final Array<Element> plus(Array<Element> array) {
        array.getClass();
        if (array.isEmpty()) {
            return this;
        }
        if (isEmpty()) {
            return array;
        }
        Array<Element> array2 = new Array<>((Sequence) this, false, false, 6, (DefaultConstructorMarker) null);
        array2.append((Sequence) array);
        return array2;
    }

    @Override // skip.lib.Collection
    public Element popFirst() {
        return (Element) super.popFirst();
    }

    @Override // skip.lib.BidirectionalCollection
    public Element popLast() {
        return (Element) super.popLast();
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

    @Override // skip.lib.RangeReplaceableCollection
    public Element remove(int i) {
        return (Element) super.remove(i);
    }

    @Override // skip.lib.RangeReplaceableCollection
    public void removeAll(Function1<? super Element, Boolean> function1) {
        super.removeAll(function1);
    }

    @Override // skip.lib.Collection
    public Element removeFirst() {
        return (Element) super.removeFirst();
    }

    @Override // skip.lib.BidirectionalCollection
    public Element removeLast() {
        return (Element) super.removeLast();
    }

    public final void reserveCapacity(int n) {
        List<Element> mutableList = getMutableList();
        if (mutableList instanceof ArrayList) {
            ((ArrayList) mutableList).ensureCapacity(n);
        }
    }

    @Override // skip.lib.MutableCollection
    public void reverse() {
        super.reverse();
    }

    @Override // skip.lib.Sequence
    public Array<Element> reversed() {
        return super.reversed();
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new Array((Sequence) this, true, true);
    }

    @Override // skip.lib.MutableCollection
    public void set(int i, Element element) {
        super.set(i, (int) element);
    }

    @Override // skip.lib.MutableStruct
    public void setSmutatingcount(int i) {
        this.smutatingcount = i;
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

    @Override // skip.lib.Sequence
    public Array<Element> suffix(int i) {
        return super.suffix(i);
    }

    @Override // skip.lib.MutableCollection
    public void swapAt(int i, int i2) {
        super.swapAt(i, i2);
    }

    public String toString() {
        return kotlin.collections.CollectionsKt.N(getCollection(), null, null, null, null, 63);
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

    @Override // skip.lib.RangeReplaceableCollection
    public void append(Sequence<Element> sequence) {
        super.append((Sequence) sequence);
    }

    @Override // skip.lib.Collection
    public void formIndex(InOut<Integer> inOut, int i) {
        super.formIndex(inOut, i);
    }

    @Override // skip.lib.RangeReplaceableCollection
    public void insert(Sequence<Element> sequence, int i) {
        super.insert((Sequence) sequence, i);
    }

    @Override // skip.lib.Collection
    public void removeAll(boolean z) {
        super.removeAll(z);
    }

    @Override // skip.lib.MutableCollection
    public void set(IntRange intRange, Collection<Element> collection) {
        super.set(intRange, collection);
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

    @Override // skip.lib.BidirectionalCollection
    public void formIndex(InOut<Integer> inOut, Object obj) {
        super.formIndex(inOut, obj);
    }

    @Override // skip.lib.Collection
    public int index(int i, int i2) {
        return super.index(i, i2);
    }

    @Override // skip.lib.BidirectionalCollection
    public Integer lastIndex(Function1<? super Element, Boolean> function1) {
        return super.lastIndex((Function1) function1);
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

    @Override // skip.lib.BidirectionalCollection
    public void removeLast(int i) {
        super.removeLast(i);
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

    @Override // skip.lib.BidirectionalCollection
    public int index(int i, Object obj) {
        return super.index(i, obj);
    }

    @Override // skip.lib.Collection
    public Array<Element> prefix(int i, Object obj, Object obj2) {
        return super.prefix(i, obj, obj2);
    }

    @Override // skip.lib.Sequence
    public Array<Element> prefix(Function1<? super Element, Boolean> function1) {
        return super.prefix(function1);
    }

    @Override // skip.lib.Collection
    public Collection<Element> get(IntRange intRange) {
        return super.get(intRange);
    }

    @Override // skip.lib.KotlinConverting
    public /* bridge */ /* synthetic */ List<?> kotlin(boolean z) {
        return kotlin2(z);
    }

    public Array(Element element, int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(element);
        }
        this._collection = arrayList;
    }

    public /* synthetic */ Array(Sequence sequence, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sequence, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }

    public Array() {
        this._mutableList = new ArrayList();
    }

    public Array(Iterable<? extends Element> iterable, boolean z, boolean z2) {
        iterable.getClass();
        if (z) {
            if (hhj.g(iterable)) {
                this._mutableList = (List) iterable;
                this.isStorageShared = z2;
            } else if (iterable instanceof List) {
                this._collection = (List) iterable;
            }
        }
        if (this._mutableList == null && this._collection == null) {
            ArrayList arrayList = new ArrayList();
            Iterator<? extends Element> it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(StructKt.sref$default(it.next(), null, 1, null));
            }
            this._mutableList = arrayList;
        }
    }

    public /* synthetic */ Array(Iterable iterable, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(iterable, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }
}
