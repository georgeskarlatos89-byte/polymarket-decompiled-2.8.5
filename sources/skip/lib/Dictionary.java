package skip.lib;

import com.google.android.libraries.places.api.model.PlaceTypes;
import defpackage.c1c;
import defpackage.l4;
import defpackage.o1;
import defpackage.os6;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import skip.lib.Dictionary;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u0000 X*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00040\u00032\u00020\u00052\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00070\u0006:\u0004XYZ[B\u0013\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bB-\b\u0016\u0012\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\n\u0010\u0010B1\b\u0016\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\n\u0010\u0014J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020)H\u0016J\b\u0010+\u001a\u00020)H\u0016J2\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u001e\u0010-\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00020\u000f0.J\u0018\u0010/\u001a\u0004\u0018\u00018\u00012\u0006\u00100\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u00101J \u00102\u001a\u00020)2\u0006\u00100\u001a\u00028\u00002\b\u00103\u001a\u0004\u0018\u00018\u0001H\u0086\u0002¢\u0006\u0002\u00104J$\u0010/\u001a\u00028\u00012\u0006\u00100\u001a\u00028\u00002\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u000106H\u0086\u0002¢\u0006\u0002\u00107J.\u00102\u001a\u00020)2\u0006\u00100\u001a\u00028\u00002\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u0001062\b\u00103\u001a\u0004\u0018\u00018\u0001H\u0086\u0002¢\u0006\u0002\u00108J\u001b\u00109\u001a\u00020)2\u0006\u00100\u001a\u00028\u00002\u0006\u00103\u001a\u00028\u0001¢\u0006\u0002\u00104J,\u0010:\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H;0\u0000\"\u0004\b\u0002\u0010;2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H;0.J.\u0010=\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H;0\u0000\"\u0004\b\u0002\u0010;2\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u0001H;0.J\u001d\u0010>\u001a\u0004\u0018\u00018\u00012\u0006\u00103\u001a\u00028\u00012\u0006\u0010?\u001a\u00028\u0000¢\u0006\u0002\u0010@J\u0015\u0010A\u001a\u0004\u0018\u00018\u00012\u0006\u0010?\u001a\u00028\u0000¢\u0006\u0002\u00101J\u0013\u0010G\u001a\u00020\u000f2\b\u0010H\u001a\u0004\u0018\u00010IH\u0096\u0002J\b\u0010J\u001a\u00020\tH\u0016J\b\u0010K\u001a\u00020LH\u0016J\b\u0010V\u001a\u00020\u0005H\u0016J\u0018\u0010W\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0015\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R6\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0017j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0018X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR0\u0010\u001d\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0017j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00188@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001aR\u001a\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R&\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010$R\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0017\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038F¢\u0006\u0006\u001a\u0004\bF\u0010DR(\u0010M\u001a\u0010\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020)\u0018\u00010.X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001a\u0010R\u001a\u00020\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010\u000b¨\u0006\\"}, d2 = {"Lskip/lib/Dictionary;", "K", "V", "Lskip/lib/Collection;", "Lskip/lib/Tuple2;", "Lskip/lib/MutableStruct;", "Lskip/lib/KotlinConverting;", "", "minimumCapacity", "", "<init>", "(I)V", "uniqueKeysWithValues", "Lskip/lib/Sequence;", "nocopy", "", "(Lskip/lib/Sequence;Z)V", "map", "", "shared", "(Ljava/util/Map;ZZ)V", "isStorageShared", PlaceTypes.STORAGE, "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "getStorage$SkipLib", "()Ljava/util/LinkedHashMap;", "setStorage$SkipLib", "(Ljava/util/LinkedHashMap;)V", "mutableStorage", "getMutableStorage$SkipLib", "_entryCollection", "Lskip/lib/Dictionary$EntryCollection;", "collection", "", "getCollection", "()Ljava/util/Collection;", "mutableCollection", "", "getMutableCollection", "willSliceStorage", "", "willMutateStorage", "didMutateStorage", "filter", "isIncluded", "Lkotlin/Function1;", "get", "key", "(Ljava/lang/Object;)Ljava/lang/Object;", "set", "value", "(Ljava/lang/Object;Ljava/lang/Object;)V", "default", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Ljava/lang/Object;)V", "put", "mapValues", "T", "transform", "compactMapValues", "updateValue", "forKey", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "removeValue", "keys", "getKeys", "()Lskip/lib/Collection;", "values", "getValues", "equals", "other", "", "hashCode", "toString", "", "supdate", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "scopy", "kotlin", "Companion", "EntryCollection", "KeyCollection", "ValueCollection", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Dictionary<K, V> implements Collection<Tuple2<K, V>>, MutableStruct, KotlinConverting<Map<?, ?>> {
    private final EntryCollection<K, V> _entryCollection;
    private boolean isStorageShared;
    private int smutatingcount;
    private LinkedHashMap<K, V> storage;
    private Function1<Object, Unit> supdate;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\b\u0012\u0004\u0012\u00028\u00020\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lskip/lib/Dictionary$KeyCollection;", "K", "V", "Lo1;", "Lskip/lib/Dictionary;", "dictionary", "<init>", "(Lskip/lib/Dictionary;)V", "", "iterator", "()Ljava/util/Iterator;", "element", "", "contains", "(Ljava/lang/Object;)Z", "Lskip/lib/Dictionary;", "getDictionary", "()Lskip/lib/Dictionary;", "", "getSize", "()I", "size", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class KeyCollection<K, V> extends o1 {
        private final Dictionary<K, V> dictionary;

        public KeyCollection(Dictionary<K, V> dictionary) {
            dictionary.getClass();
            this.dictionary = dictionary;
        }

        @Override // defpackage.o1, java.util.Collection, java.util.Set
        public boolean contains(Object element) {
            return this.dictionary.getStorage$SkipLib().containsKey(element);
        }

        public final Dictionary<K, V> getDictionary() {
            return this.dictionary;
        }

        @Override // defpackage.o1
        public int getSize() {
            return this.dictionary.getStorage$SkipLib().size();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new Dictionary$KeyCollection$iterator$1(this.dictionary.getStorage$SkipLib().entrySet().iterator());
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\b\u0012\u0004\u0012\u00028\u00030\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00030\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lskip/lib/Dictionary$ValueCollection;", "K", "V", "Lo1;", "Lskip/lib/Dictionary;", "dictionary", "<init>", "(Lskip/lib/Dictionary;)V", "", "iterator", "()Ljava/util/Iterator;", "element", "", "contains", "(Ljava/lang/Object;)Z", "Lskip/lib/Dictionary;", "getDictionary", "()Lskip/lib/Dictionary;", "", "getSize", "()I", "size", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ValueCollection<K, V> extends o1 {
        private final Dictionary<K, V> dictionary;

        public ValueCollection(Dictionary<K, V> dictionary) {
            dictionary.getClass();
            this.dictionary = dictionary;
        }

        @Override // defpackage.o1, java.util.Collection, java.util.Set
        public boolean contains(Object element) {
            return this.dictionary.getStorage$SkipLib().containsValue(element);
        }

        public final Dictionary<K, V> getDictionary() {
            return this.dictionary;
        }

        @Override // defpackage.o1
        public int getSize() {
            return this.dictionary.getStorage$SkipLib().size();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new Dictionary$ValueCollection$iterator$1(this.dictionary.getStorage$SkipLib().entrySet().iterator());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Dictionary(Sequence<Tuple2<K, V>> sequence, boolean z) {
        sequence.getClass();
        if (z && (sequence instanceof Dictionary)) {
            Dictionary dictionary = (Dictionary) sequence;
            this.storage = dictionary.storage;
            dictionary.isStorageShared = true;
            this.isStorageShared = true;
        } else if (z && (sequence instanceof EntryCollection)) {
            EntryCollection entryCollection = (EntryCollection) sequence;
            this.storage = entryCollection.getDictionary().storage;
            entryCollection.getDictionary().isStorageShared = true;
            this.isStorageShared = true;
        } else {
            this.storage = new LinkedHashMap<>();
            for (Tuple2 tuple2 : sequence.getIterable()) {
                LinkedHashMap<K, V> linkedHashMap = this.storage;
                if (z) {
                    linkedHashMap.put(tuple2.get_e0(), tuple2.get_e1());
                } else {
                    linkedHashMap.put(tuple2.getElement0(), tuple2.getElement1());
                }
            }
        }
        this._entryCollection = new EntryCollection<>(this);
    }

    public static /* synthetic */ Unit a(Dictionary dictionary, Object obj, Object obj2) {
        return get$lambda$1(dictionary, obj, obj2);
    }

    public static /* synthetic */ Unit b(Dictionary dictionary, Object obj, Object obj2) {
        return get$lambda$2(dictionary, obj, obj2);
    }

    private static final Unit get$lambda$1(Dictionary dictionary, Object obj, Object obj2) {
        obj2.getClass();
        dictionary.set(obj, obj2);
        return Unit.INSTANCE;
    }

    private static final Unit get$lambda$2(Dictionary dictionary, Object obj, Object obj2) {
        dictionary.set(obj, obj2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // skip.lib.Sequence
    public boolean allSatisfy(Function1<? super Tuple2<K, V>, Boolean> function1) {
        return super.allSatisfy(function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // skip.lib.Sequence
    public <RE> Array<RE> compactMap(Function1<? super Tuple2<K, V>, ? extends RE> function1) {
        return super.compactMap(function1);
    }

    public final <T> Dictionary<K, T> compactMapValues(Function1<? super V, ? extends T> transform) {
        transform.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, V> entry : this.storage.entrySet()) {
            T invoke = transform.invoke(entry.getValue());
            if (invoke != null) {
                linkedHashMap.put(entry.getKey(), invoke);
            }
        }
        return new Dictionary<>(linkedHashMap, true, false, 4, null);
    }

    @Override // skip.lib.Sequence
    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return contains((Tuple2) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // skip.lib.Sequence
    public int count(Function1<? super Tuple2<K, V>, Boolean> function1) {
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // skip.lib.Sequence
    public Array<Tuple2<K, V>> drop(Function1<? super Tuple2<K, V>, Boolean> function1) {
        return super.drop(function1);
    }

    @Override // skip.lib.Sequence
    public Array<Tuple2<K, V>> dropFirst(int i) {
        return super.dropFirst(i);
    }

    @Override // skip.lib.Sequence
    public Array<Tuple2<K, V>> dropLast(int i) {
        return super.dropLast(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // skip.lib.Sequence
    public boolean elementsEqual(Sequence<Tuple2<K, V>> sequence, Function2<? super Tuple2<K, V>, ? super Tuple2<K, V>, Boolean> function2) {
        return super.elementsEqual(sequence, function2);
    }

    @Override // skip.lib.Sequence
    public Sequence<Tuple2<Integer, Tuple2<K, V>>> enumerated() {
        return super.enumerated();
    }

    public boolean equals(Object other) {
        Dictionary dictionary;
        if (other == this) {
            return true;
        }
        if (other instanceof Dictionary) {
            dictionary = (Dictionary) other;
        } else {
            dictionary = null;
        }
        if (dictionary == null) {
            return false;
        }
        return Intrinsics.areEqual(((Dictionary) other).storage, this.storage);
    }

    public final Dictionary<K, V> filter(Function1<? super Tuple2<K, V>, Boolean> isIncluded) {
        isIncluded.getClass();
        LinkedHashMap<K, V> linkedHashMap = this.storage;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<K, V> entry : linkedHashMap.entrySet()) {
            if (isIncluded.invoke(new Tuple2(entry.getKey(), entry.getValue())).booleanValue()) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        return new Dictionary<>(linkedHashMap2, true, false, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // skip.lib.Sequence
    public Tuple2<K, V> first(Function1<? super Tuple2<K, V>, Boolean> function1) {
        return (Tuple2) super.first((Function1) function1);
    }

    @Override // skip.lib.Collection
    public /* bridge */ /* synthetic */ Integer firstIndex(Object obj) {
        return firstIndex((Tuple2) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // skip.lib.Sequence
    public <RE> Array<RE> flatMap(Function1<? super Tuple2<K, V>, ? extends Sequence<RE>> function1) {
        return super.flatMap(function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // skip.lib.Sequence
    public void forEach(Function1<? super Tuple2<K, V>, Unit> function1) {
        super.forEach(function1);
    }

    @Override // skip.lib.Collection
    public void formIndex(InOut<Integer> inOut) {
        super.formIndex(inOut);
    }

    public final V get(K key, Function0<? extends V> r4) {
        r4.getClass();
        V v = get((Dictionary<K, V>) key);
        if (v == null) {
            return (V) StructKt.sref(r4.invoke(), new os6(this, key, 1));
        }
        return v;
    }

    @Override // skip.lib.CollectionStorage
    public java.util.Collection<Tuple2<K, V>> getCollection() {
        return this._entryCollection;
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
    public Tuple2<K, V> getFirst() {
        return (Tuple2) super.getFirst();
    }

    @Override // skip.lib.Collection
    public Sequence<Integer> getIndices() {
        return super.getIndices();
    }

    @Override // skip.lib.IterableStorage, skip.lib.CollectionStorage
    public Iterable<Tuple2<K, V>> getIterable() {
        return super.getIterable();
    }

    public final Collection<K> getKeys() {
        return new Collection<K>(this) { // from class: skip.lib.Dictionary$keys$1
            private final Dictionary.KeyCollection<K, V> collection;

            {
                this.collection = new Dictionary.KeyCollection<>(this);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Sequence
            public boolean allSatisfy(Function1<? super K, Boolean> function1) {
                return super.allSatisfy(function1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Sequence
            public <RE> Array<RE> compactMap(Function1<? super K, ? extends RE> function1) {
                return super.compactMap(function1);
            }

            @Override // skip.lib.Sequence
            public boolean contains(K k) {
                return super.contains((Dictionary$keys$1<K>) k);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Sequence
            public int count(Function1<? super K, Boolean> function1) {
                return super.count(function1);
            }

            @Override // skip.lib.CollectionStorage
            public void didMutateStorage() {
                super.didMutateStorage();
            }

            @Override // skip.lib.Collection
            public int distance(int i, int i2) {
                return super.distance(i, i2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Sequence
            public Array<K> drop(Function1<? super K, Boolean> function1) {
                return super.drop(function1);
            }

            @Override // skip.lib.Sequence
            public Array<K> dropFirst(int i) {
                return super.dropFirst(i);
            }

            @Override // skip.lib.Sequence
            public Array<K> dropLast(int i) {
                return super.dropLast(i);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Sequence
            public boolean elementsEqual(Sequence<K> sequence, Function2<? super K, ? super K, Boolean> function2) {
                return super.elementsEqual(sequence, function2);
            }

            @Override // skip.lib.Sequence
            public Sequence<Tuple2<Integer, K>> enumerated() {
                return super.enumerated();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Sequence
            public K first(Function1<? super K, Boolean> function1) {
                return (K) super.first(function1);
            }

            @Override // skip.lib.Collection
            public Integer firstIndex(K k) {
                return super.firstIndex((Dictionary$keys$1<K>) k);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Sequence
            public <RE> Array<RE> flatMap(Function1<? super K, ? extends Sequence<RE>> function1) {
                return super.flatMap(function1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Sequence
            public void forEach(Function1<? super K, Unit> function1) {
                super.forEach(function1);
            }

            @Override // skip.lib.Collection
            public void formIndex(InOut<Integer> inOut) {
                super.formIndex(inOut);
            }

            @Override // skip.lib.Collection
            public Collection<K> get(IntRange intRange) {
                return super.get(intRange);
            }

            @Override // skip.lib.CollectionStorage
            public /* bridge */ /* synthetic */ java.util.Collection getCollection() {
                return getCollection();
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
            public K getFirst() {
                return (K) super.getFirst();
            }

            @Override // skip.lib.Collection
            public Sequence<Integer> getIndices() {
                return super.getIndices();
            }

            @Override // skip.lib.IterableStorage, skip.lib.CollectionStorage
            public Iterable<K> getIterable() {
                return super.getIterable();
            }

            @Override // skip.lib.CollectionStorage, skip.lib.MutableListStorage
            public java.util.Collection<K> getMutableCollection() {
                throw new UnsupportedOperationException();
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

            @Override // skip.lib.Sequence
            public int getUnderestimatedCount() {
                return super.getUnderestimatedCount();
            }

            @Override // skip.lib.Collection
            public int index(int i) {
                return super.index(i);
            }

            @Override // skip.lib.Collection
            public boolean isEmpty() {
                return super.isEmpty();
            }

            @Override // skip.lib.IterableStorage, java.lang.Iterable
            public Iterator<K> iterator() {
                return super.iterator();
            }

            @Override // skip.lib.Sequence
            public IteratorProtocol<K> makeIterator() {
                return super.makeIterator();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Sequence
            public <RE> Array<RE> map(Function1<? super K, ? extends RE> function1) {
                return super.map(function1);
            }

            @Override // skip.lib.Sequence
            public K max() {
                return (K) super.max();
            }

            @Override // skip.lib.Sequence
            public K min() {
                return (K) super.min();
            }

            @Override // skip.lib.Collection
            public K popFirst() {
                return (K) super.popFirst();
            }

            @Override // skip.lib.Sequence
            public Array<K> prefix(int i) {
                return super.prefix(i);
            }

            @Override // skip.lib.Collection
            public K randomElement(InOut<RandomNumberGenerator> inOut) {
                return (K) super.randomElement(inOut);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Sequence
            public <R> R reduce(R r, Function2<? super R, ? super K, ? extends R> function2) {
                return (R) super.reduce(r, function2);
            }

            @Override // skip.lib.Collection
            public void removeAll(boolean z) {
                super.removeAll(z);
            }

            @Override // skip.lib.Collection
            public K removeFirst() {
                return (K) super.removeFirst();
            }

            @Override // skip.lib.Sequence
            public Array<K> reversed() {
                return super.reversed();
            }

            @Override // skip.lib.Collection
            public void shuffle(InOut<RandomNumberGenerator> inOut) {
                super.shuffle(inOut);
            }

            @Override // skip.lib.Sequence
            public Array<K> shuffled(InOut<RandomNumberGenerator> inOut) {
                return super.shuffled(inOut);
            }

            @Override // skip.lib.Collection
            public void sort() {
                super.sort();
            }

            @Override // skip.lib.Sequence
            public Array<K> sorted() {
                return super.sorted();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Sequence
            public boolean starts(Sequence<K> sequence) {
                return super.starts(sequence);
            }

            @Override // skip.lib.Sequence
            public Array<K> suffix(int i) {
                return super.suffix(i);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Collection
            public void trimPrefix(Function1<? super K, Boolean> function1) {
                super.trimPrefix(function1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Collection
            public Array<K> trimmingPrefix(Function1<? super K, Boolean> function1) {
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
            public void formIndex(InOut<Integer> inOut, int i) {
                super.formIndex(inOut, i);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Collection
            public void sort(Function2<? super K, ? super K, Boolean> function2) {
                super.sort(function2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Sequence
            public boolean contains(Function1<? super K, Boolean> function1) {
                return super.contains((Function1) function1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Collection
            public Integer firstIndex(Function1<? super K, Boolean> function1) {
                return super.firstIndex((Function1) function1);
            }

            @Override // skip.lib.CollectionStorage
            public Dictionary.KeyCollection<K, V> getCollection() {
                return this.collection;
            }

            @Override // skip.lib.Collection
            public int index(int i, int i2) {
                return super.index(i, i2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Sequence
            public K max(Function2<? super K, ? super K, Boolean> function2) {
                return (K) super.max(function2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Sequence
            public K min(Function2<? super K, ? super K, Boolean> function2) {
                return (K) super.min(function2);
            }

            @Override // skip.lib.Collection
            public Array<K> prefix(int i, Object obj) {
                return super.prefix(i, obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Sequence
            public <R> R reduce(Void r1, R r, Function2<? super InOut<R>, ? super K, Unit> function2) {
                return (R) super.reduce(r1, r, function2);
            }

            @Override // skip.lib.Collection
            public void removeFirst(int i) {
                super.removeFirst(i);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Sequence
            public Array<K> sorted(Function2<? super K, ? super K, Boolean> function2) {
                return super.sorted(function2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Sequence
            public boolean starts(Sequence<K> sequence, Function2<? super K, ? super K, Boolean> function2) {
                return super.starts(sequence, function2);
            }

            @Override // skip.lib.Collection
            public Array<K> suffix(int i, Object obj) {
                return super.suffix(i, obj);
            }

            @Override // skip.lib.Collection
            public Array<K> prefix(int i, Object obj, Object obj2) {
                return super.prefix(i, obj, obj2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Sequence
            public Array<K> prefix(Function1<? super K, Boolean> function1) {
                return super.prefix(function1);
            }
        };
    }

    @Override // skip.lib.CollectionStorage, skip.lib.MutableListStorage
    public java.util.Collection<Tuple2<K, V>> getMutableCollection() {
        getMutableStorage$SkipLib();
        return this._entryCollection;
    }

    public final LinkedHashMap<K, V> getMutableStorage$SkipLib() {
        if (this.isStorageShared) {
            this.storage = new LinkedHashMap<>(this.storage);
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

    public final LinkedHashMap<K, V> getStorage$SkipLib() {
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

    public final Collection<V> getValues() {
        return new Collection<V>(this) { // from class: skip.lib.Dictionary$values$1
            private final Dictionary.ValueCollection<K, V> collection;

            {
                this.collection = new Dictionary.ValueCollection<>(this);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Sequence
            public boolean allSatisfy(Function1<? super V, Boolean> function1) {
                return super.allSatisfy(function1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Sequence
            public <RE> Array<RE> compactMap(Function1<? super V, ? extends RE> function1) {
                return super.compactMap(function1);
            }

            @Override // skip.lib.Sequence
            public boolean contains(V v) {
                return super.contains((Dictionary$values$1<V>) v);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Sequence
            public int count(Function1<? super V, Boolean> function1) {
                return super.count(function1);
            }

            @Override // skip.lib.CollectionStorage
            public void didMutateStorage() {
                super.didMutateStorage();
            }

            @Override // skip.lib.Collection
            public int distance(int i, int i2) {
                return super.distance(i, i2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Sequence
            public Array<V> drop(Function1<? super V, Boolean> function1) {
                return super.drop(function1);
            }

            @Override // skip.lib.Sequence
            public Array<V> dropFirst(int i) {
                return super.dropFirst(i);
            }

            @Override // skip.lib.Sequence
            public Array<V> dropLast(int i) {
                return super.dropLast(i);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Sequence
            public boolean elementsEqual(Sequence<V> sequence, Function2<? super V, ? super V, Boolean> function2) {
                return super.elementsEqual(sequence, function2);
            }

            @Override // skip.lib.Sequence
            public Sequence<Tuple2<Integer, V>> enumerated() {
                return super.enumerated();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Sequence
            public V first(Function1<? super V, Boolean> function1) {
                return (V) super.first(function1);
            }

            @Override // skip.lib.Collection
            public Integer firstIndex(V v) {
                return super.firstIndex((Dictionary$values$1<V>) v);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Sequence
            public <RE> Array<RE> flatMap(Function1<? super V, ? extends Sequence<RE>> function1) {
                return super.flatMap(function1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Sequence
            public void forEach(Function1<? super V, Unit> function1) {
                super.forEach(function1);
            }

            @Override // skip.lib.Collection
            public void formIndex(InOut<Integer> inOut) {
                super.formIndex(inOut);
            }

            @Override // skip.lib.Collection
            public Collection<V> get(IntRange intRange) {
                return super.get(intRange);
            }

            @Override // skip.lib.CollectionStorage
            public /* bridge */ /* synthetic */ java.util.Collection getCollection() {
                return getCollection();
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
            public V getFirst() {
                return (V) super.getFirst();
            }

            @Override // skip.lib.Collection
            public Sequence<Integer> getIndices() {
                return super.getIndices();
            }

            @Override // skip.lib.IterableStorage, skip.lib.CollectionStorage
            public Iterable<V> getIterable() {
                return super.getIterable();
            }

            @Override // skip.lib.CollectionStorage, skip.lib.MutableListStorage
            public java.util.Collection<V> getMutableCollection() {
                throw new UnsupportedOperationException();
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

            @Override // skip.lib.Sequence
            public int getUnderestimatedCount() {
                return super.getUnderestimatedCount();
            }

            @Override // skip.lib.Collection
            public int index(int i) {
                return super.index(i);
            }

            @Override // skip.lib.Collection
            public boolean isEmpty() {
                return super.isEmpty();
            }

            @Override // skip.lib.IterableStorage, java.lang.Iterable
            public Iterator<V> iterator() {
                return super.iterator();
            }

            @Override // skip.lib.Sequence
            public IteratorProtocol<V> makeIterator() {
                return super.makeIterator();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Sequence
            public <RE> Array<RE> map(Function1<? super V, ? extends RE> function1) {
                return super.map(function1);
            }

            @Override // skip.lib.Sequence
            public V max() {
                return (V) super.max();
            }

            @Override // skip.lib.Sequence
            public V min() {
                return (V) super.min();
            }

            @Override // skip.lib.Collection
            public V popFirst() {
                return (V) super.popFirst();
            }

            @Override // skip.lib.Sequence
            public Array<V> prefix(int i) {
                return super.prefix(i);
            }

            @Override // skip.lib.Collection
            public V randomElement(InOut<RandomNumberGenerator> inOut) {
                return (V) super.randomElement(inOut);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Sequence
            public <R> R reduce(R r, Function2<? super R, ? super V, ? extends R> function2) {
                return (R) super.reduce(r, function2);
            }

            @Override // skip.lib.Collection
            public void removeAll(boolean z) {
                super.removeAll(z);
            }

            @Override // skip.lib.Collection
            public V removeFirst() {
                return (V) super.removeFirst();
            }

            @Override // skip.lib.Sequence
            public Array<V> reversed() {
                return super.reversed();
            }

            @Override // skip.lib.Collection
            public void shuffle(InOut<RandomNumberGenerator> inOut) {
                super.shuffle(inOut);
            }

            @Override // skip.lib.Sequence
            public Array<V> shuffled(InOut<RandomNumberGenerator> inOut) {
                return super.shuffled(inOut);
            }

            @Override // skip.lib.Collection
            public void sort() {
                super.sort();
            }

            @Override // skip.lib.Sequence
            public Array<V> sorted() {
                return super.sorted();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Sequence
            public boolean starts(Sequence<V> sequence) {
                return super.starts(sequence);
            }

            @Override // skip.lib.Sequence
            public Array<V> suffix(int i) {
                return super.suffix(i);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Collection
            public void trimPrefix(Function1<? super V, Boolean> function1) {
                super.trimPrefix(function1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Collection
            public Array<V> trimmingPrefix(Function1<? super V, Boolean> function1) {
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
            public void formIndex(InOut<Integer> inOut, int i) {
                super.formIndex(inOut, i);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Collection
            public void sort(Function2<? super V, ? super V, Boolean> function2) {
                super.sort(function2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Sequence
            public boolean contains(Function1<? super V, Boolean> function1) {
                return super.contains((Function1) function1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Collection
            public Integer firstIndex(Function1<? super V, Boolean> function1) {
                return super.firstIndex((Function1) function1);
            }

            @Override // skip.lib.CollectionStorage
            public Dictionary.ValueCollection<K, V> getCollection() {
                return this.collection;
            }

            @Override // skip.lib.Collection
            public int index(int i, int i2) {
                return super.index(i, i2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Sequence
            public V max(Function2<? super V, ? super V, Boolean> function2) {
                return (V) super.max(function2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Sequence
            public V min(Function2<? super V, ? super V, Boolean> function2) {
                return (V) super.min(function2);
            }

            @Override // skip.lib.Collection
            public Array<V> prefix(int i, Object obj) {
                return super.prefix(i, obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Sequence
            public <R> R reduce(Void r1, R r, Function2<? super InOut<R>, ? super V, Unit> function2) {
                return (R) super.reduce(r1, r, function2);
            }

            @Override // skip.lib.Collection
            public void removeFirst(int i) {
                super.removeFirst(i);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Sequence
            public Array<V> sorted(Function2<? super V, ? super V, Boolean> function2) {
                return super.sorted(function2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Sequence
            public boolean starts(Sequence<V> sequence, Function2<? super V, ? super V, Boolean> function2) {
                return super.starts(sequence, function2);
            }

            @Override // skip.lib.Collection
            public Array<V> suffix(int i, Object obj) {
                return super.suffix(i, obj);
            }

            @Override // skip.lib.Collection
            public Array<V> prefix(int i, Object obj, Object obj2) {
                return super.prefix(i, obj, obj2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // skip.lib.Sequence
            public Array<V> prefix(Function1<? super V, Boolean> function1) {
                return super.prefix(function1);
            }
        };
    }

    public int hashCode() {
        return this.storage.hashCode();
    }

    @Override // skip.lib.Collection
    public int index(int i) {
        return super.index(i);
    }

    @Override // skip.lib.Collection
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // skip.lib.IterableStorage, java.lang.Iterable
    public Iterator<Tuple2<K, V>> iterator() {
        return super.iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // skip.lib.KotlinConverting
    /* renamed from: kotlin, reason: avoid collision after fix types in other method */
    public Map<?, ?> kotlin2(boolean nocopy) {
        Object obj;
        if (nocopy) {
            return getMutableStorage$SkipLib();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, V> entry : this.storage.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            Object obj2 = null;
            if (key != null) {
                obj = KotlinSupportKt.kotlin$default(key, false, 1, null);
            } else {
                obj = null;
            }
            if (value != null) {
                obj2 = KotlinSupportKt.kotlin$default(value, false, 1, null);
            }
            linkedHashMap.put(obj, obj2);
        }
        return linkedHashMap;
    }

    @Override // skip.lib.Sequence
    public IteratorProtocol<Tuple2<K, V>> makeIterator() {
        return super.makeIterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // skip.lib.Sequence
    public <RE> Array<RE> map(Function1<? super Tuple2<K, V>, ? extends RE> function1) {
        return super.map(function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> Dictionary<K, T> mapValues(Function1<? super V, ? extends T> transform) {
        transform.getClass();
        LinkedHashMap<K, V> linkedHashMap = this.storage;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(c1c.a(linkedHashMap.size()));
        Iterator<T> it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap2.put(entry.getKey(), transform.invoke((Object) entry.getValue()));
        }
        return new Dictionary<>(linkedHashMap2, true, false, 4, null);
    }

    @Override // skip.lib.Sequence
    public Tuple2<K, V> max() {
        return (Tuple2) super.max();
    }

    @Override // skip.lib.Sequence
    public Tuple2<K, V> min() {
        return (Tuple2) super.min();
    }

    @Override // skip.lib.Collection
    public Tuple2<K, V> popFirst() {
        return (Tuple2) super.popFirst();
    }

    @Override // skip.lib.Sequence
    public Array<Tuple2<K, V>> prefix(int i) {
        return super.prefix(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void put(K key, V value) {
        willmutate();
        getMutableStorage$SkipLib().put(StructKt.sref$default(key, null, 1, null), StructKt.sref$default(value, null, 1, null));
        didmutate();
    }

    @Override // skip.lib.Collection
    public Tuple2<K, V> randomElement(InOut<RandomNumberGenerator> inOut) {
        return (Tuple2) super.randomElement(inOut);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // skip.lib.Sequence
    public <R> R reduce(R r, Function2<? super R, ? super Tuple2<K, V>, ? extends R> function2) {
        return (R) super.reduce(r, function2);
    }

    @Override // skip.lib.Collection
    public void removeAll(boolean z) {
        super.removeAll(z);
    }

    @Override // skip.lib.Collection
    public Tuple2<K, V> removeFirst() {
        return (Tuple2) super.removeFirst();
    }

    public final V removeValue(K forKey) {
        willmutate();
        V remove = getMutableStorage$SkipLib().remove(forKey);
        didmutate();
        return remove;
    }

    @Override // skip.lib.Sequence
    public Array<Tuple2<K, V>> reversed() {
        return super.reversed();
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new Dictionary(this, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void set(K key, Function0<? extends V> r4, V value) {
        r4.getClass();
        willmutate();
        if (value == null) {
            getMutableStorage$SkipLib().remove(key);
        } else {
            getMutableStorage$SkipLib().put(StructKt.sref$default(key, null, 1, null), StructKt.sref$default(value, null, 1, null));
        }
        didmutate();
    }

    @Override // skip.lib.MutableStruct
    public void setSmutatingcount(int i) {
        this.smutatingcount = i;
    }

    public final void setStorage$SkipLib(LinkedHashMap<K, V> linkedHashMap) {
        linkedHashMap.getClass();
        this.storage = linkedHashMap;
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
    public Array<Tuple2<K, V>> shuffled(InOut<RandomNumberGenerator> inOut) {
        return super.shuffled(inOut);
    }

    @Override // skip.lib.Collection
    public void sort() {
        super.sort();
    }

    @Override // skip.lib.Sequence
    public Array<Tuple2<K, V>> sorted() {
        return super.sorted();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // skip.lib.Sequence
    public boolean starts(Sequence<Tuple2<K, V>> sequence) {
        return super.starts(sequence);
    }

    @Override // skip.lib.Sequence
    public Array<Tuple2<K, V>> suffix(int i) {
        return super.suffix(i);
    }

    public String toString() {
        String obj = this.storage.toString();
        obj.getClass();
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // skip.lib.Collection
    public void trimPrefix(Function1<? super Tuple2<K, V>, Boolean> function1) {
        super.trimPrefix(function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // skip.lib.Collection
    public Array<Tuple2<K, V>> trimmingPrefix(Function1<? super Tuple2<K, V>, Boolean> function1) {
        return super.trimmingPrefix(function1);
    }

    public final V updateValue(V value, K forKey) {
        willmutate();
        V put = getMutableStorage$SkipLib().put(forKey, value);
        didmutate();
        return put;
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // skip.lib.Collection
    public void sort(Function2<? super Tuple2<K, V>, ? super Tuple2<K, V>, Boolean> function2) {
        super.sort(function2);
    }

    @Override // skip.lib.Collection
    public int index(int i, int i2) {
        return super.index(i, i2);
    }

    @Override // skip.lib.Collection
    public Array<Tuple2<K, V>> prefix(int i, Object obj) {
        return super.prefix(i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // skip.lib.Sequence
    public <R> R reduce(Void r1, R r, Function2<? super InOut<R>, ? super Tuple2<K, V>, Unit> function2) {
        return (R) super.reduce(r1, r, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // skip.lib.Sequence
    public Array<Tuple2<K, V>> sorted(Function2<? super Tuple2<K, V>, ? super Tuple2<K, V>, Boolean> function2) {
        return super.sorted(function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // skip.lib.Sequence
    public boolean starts(Sequence<Tuple2<K, V>> sequence, Function2<? super Tuple2<K, V>, ? super Tuple2<K, V>, Boolean> function2) {
        return super.starts(sequence, function2);
    }

    @Override // skip.lib.Collection
    public Array<Tuple2<K, V>> suffix(int i, Object obj) {
        return super.suffix(i, obj);
    }

    @Override // skip.lib.Collection
    public Array<Tuple2<K, V>> prefix(int i, Object obj, Object obj2) {
        return super.prefix(i, obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // skip.lib.Sequence
    public boolean contains(Function1<? super Tuple2<K, V>, Boolean> function1) {
        return super.contains((Function1) function1);
    }

    @Override // skip.lib.Sequence
    public /* bridge */ /* synthetic */ Object first(Function1 function1) {
        return first(function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // skip.lib.Collection
    public Integer firstIndex(Function1<? super Tuple2<K, V>, Boolean> function1) {
        return super.firstIndex((Function1) function1);
    }

    @Override // skip.lib.Collection
    public /* bridge */ /* synthetic */ Object getFirst() {
        return getFirst();
    }

    @Override // skip.lib.Sequence
    public /* bridge */ /* synthetic */ Object max(Function2 function2) {
        return max(function2);
    }

    @Override // skip.lib.Sequence
    public /* bridge */ /* synthetic */ Object min(Function2 function2) {
        return min(function2);
    }

    @Override // skip.lib.Collection
    public /* bridge */ /* synthetic */ Object popFirst() {
        return popFirst();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // skip.lib.Sequence
    public Array<Tuple2<K, V>> prefix(Function1<? super Tuple2<K, V>, Boolean> function1) {
        return super.prefix(function1);
    }

    @Override // skip.lib.Collection
    public /* bridge */ /* synthetic */ Object randomElement(InOut inOut) {
        return randomElement((InOut<RandomNumberGenerator>) inOut);
    }

    @Override // skip.lib.Collection
    public /* bridge */ /* synthetic */ Object removeFirst() {
        return removeFirst();
    }

    public boolean contains(Tuple2<K, V> tuple2) {
        return super.contains((Dictionary<K, V>) tuple2);
    }

    public Integer firstIndex(Tuple2<K, V> tuple2) {
        return super.firstIndex((Dictionary<K, V>) tuple2);
    }

    @Override // skip.lib.Sequence
    public /* bridge */ /* synthetic */ Object max() {
        return max();
    }

    @Override // skip.lib.Sequence
    public /* bridge */ /* synthetic */ Object min() {
        return min();
    }

    @Override // skip.lib.Collection
    public void removeFirst(int i) {
        super.removeFirst(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // skip.lib.Sequence
    public Tuple2<K, V> max(Function2<? super Tuple2<K, V>, ? super Tuple2<K, V>, Boolean> function2) {
        return (Tuple2) super.max((Function2) function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // skip.lib.Sequence
    public Tuple2<K, V> min(Function2<? super Tuple2<K, V>, ? super Tuple2<K, V>, Boolean> function2) {
        return (Tuple2) super.min((Function2) function2);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00040\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00040\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0010\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lskip/lib/Dictionary$EntryCollection;", "K", "V", "Ll4;", "Lskip/lib/Tuple2;", "Lskip/lib/Dictionary;", "dictionary", "<init>", "(Lskip/lib/Dictionary;)V", "element", "", "add", "(Lskip/lib/Tuple2;)Z", "", "iterator", "()Ljava/util/Iterator;", "contains", "", "clear", "()V", "Lskip/lib/Dictionary;", "getDictionary", "()Lskip/lib/Dictionary;", "", "getSize", "()I", "size", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class EntryCollection<K, V> extends l4 {
        private final Dictionary<K, V> dictionary;

        public EntryCollection(Dictionary<K, V> dictionary) {
            dictionary.getClass();
            this.dictionary = dictionary;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean add(Tuple2<K, V> element) {
            element.getClass();
            this.dictionary.getStorage$SkipLib().put(PackageSupportKt.getKey(element), PackageSupportKt.getValue(element));
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.dictionary.getStorage$SkipLib().clear();
        }

        public boolean contains(Tuple2<K, V> element) {
            element.getClass();
            return Intrinsics.areEqual(this.dictionary.getStorage$SkipLib().get(element.get_e0()), element.get_e1());
        }

        public final Dictionary<K, V> getDictionary() {
            return this.dictionary;
        }

        @Override // defpackage.l4
        public int getSize() {
            return this.dictionary.getStorage$SkipLib().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Tuple2<K, V>> iterator() {
            return new Dictionary$EntryCollection$iterator$1(this.dictionary.getStorage$SkipLib().entrySet().iterator(), this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final /* bridge */ boolean remove(Object obj) {
            if (!(obj instanceof Tuple2)) {
                return false;
            }
            return remove((Tuple2<Object, Object>) obj);
        }

        public /* bridge */ boolean remove(Tuple2<Object, Object> tuple2) {
            return super.remove((Object) tuple2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            return add((Tuple2) obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Tuple2) {
                return contains((Tuple2) obj);
            }
            return false;
        }
    }

    public final V get(K key) {
        V v = this.storage.get(key);
        if (v != null) {
            return (V) StructKt.sref(v, new os6(this, key, 0));
        }
        return null;
    }

    @Override // skip.lib.Collection
    public Collection<Tuple2<K, V>> get(IntRange intRange) {
        return super.get(intRange);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void set(K key, V value) {
        willmutate();
        if (value == null) {
            getMutableStorage$SkipLib().remove(key);
        } else {
            getMutableStorage$SkipLib().put(StructKt.sref$default(key, null, 1, null), StructKt.sref$default(value, null, 1, null));
        }
        didmutate();
    }

    @Override // skip.lib.KotlinConverting
    public /* bridge */ /* synthetic */ Map<?, ?> kotlin(boolean z) {
        return kotlin2(z);
    }

    public /* synthetic */ Dictionary(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public /* synthetic */ Dictionary(Sequence sequence, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sequence, (i & 2) != 0 ? false : z);
    }

    public Dictionary(int i) {
        this.storage = new LinkedHashMap<>();
        this._entryCollection = new EntryCollection<>(this);
    }

    public /* synthetic */ Dictionary(Map map, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Dictionary(Map<K, ? extends V> map, boolean z, boolean z2) {
        map.getClass();
        if (z && (map instanceof LinkedHashMap)) {
            this.storage = (LinkedHashMap) map;
            this.isStorageShared = z2;
        } else {
            this.storage = new LinkedHashMap<>();
            for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
                LinkedHashMap<K, V> linkedHashMap = this.storage;
                if (z) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                } else {
                    linkedHashMap.put(StructKt.sref$default(entry.getKey(), null, 1, null), StructKt.sref$default(entry.getValue(), null, 1, null));
                }
            }
        }
        this._entryCollection = new EntryCollection<>(this);
    }
}
