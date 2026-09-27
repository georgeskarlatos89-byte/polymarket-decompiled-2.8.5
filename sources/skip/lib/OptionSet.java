package skip.lib;

import com.google.android.libraries.places.api.model.PlaceTypes;
import defpackage.gkj;
import defpackage.hkj;
import kotlin.Metadata;
import skip.lib.OptionSet;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\bf\u0018\u0000*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004J\u0017\u0010\t\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u00000\u00172\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u0019\u0010\u001c\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u0014J\u0017\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\rJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001e\u0010\rJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001f\u0010\rJ\u0017\u0010 \u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010\u0014J\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010!\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\"\u0010\u0011J\u0017\u0010#\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b#\u0010\u0011J\u0017\u0010$\u001a\u00020\u000f2\u0006\u0010!\u001a\u00028\u0000H\u0016¢\u0006\u0004\b$\u0010\u0011J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b%\u0010\rJ\u0017\u0010&\u001a\u00020\u000f2\u0006\u0010!\u001a\u00028\u0000H\u0016¢\u0006\u0004\b&\u0010\u0011J\u0017\u0010'\u001a\u00020\u000f2\u0006\u0010!\u001a\u00028\u0000H\u0016¢\u0006\u0004\b'\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006,À\u0006\u0003"}, d2 = {"Lskip/lib/OptionSet;", "T", "R", "Lskip/lib/RawRepresentable;", "Lskip/lib/SetAlgebra;", "Lhkj;", "rawvaluelong", "makeoptionset-VKZWuLQ", "(J)Lskip/lib/OptionSet;", "makeoptionset", "target", "", "assignoptionset", "(Lskip/lib/OptionSet;)V", "element", "", "contains", "(Lskip/lib/OptionSet;)Z", "other", "union", "(Lskip/lib/OptionSet;)Lskip/lib/OptionSet;", PlaceTypes.INTERSECTION, "symmetricDifference", "Lskip/lib/Tuple2;", "insert", "(Lskip/lib/OptionSet;)Lskip/lib/Tuple2;", "remove", "with", "update", "formUnion", "formIntersection", "formSymmetricDifference", "subtracting", "of", "isSubset", "isDisjoint", "isSuperset", "subtract", "isStrictSubset", "isStrictSuperset", "getRawvaluelong-s-VKNKU", "()J", "isEmpty", "()Z", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface OptionSet<T extends OptionSet<T, R>, R> extends RawRepresentable<R>, SetAlgebra<T, T> {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static <T extends OptionSet<T, R>, R> boolean contains(OptionSet<T, R> optionSet, T t) {
            t.getClass();
            return OptionSet.access$contains$jd(optionSet, t);
        }

        @Deprecated
        public static <T extends OptionSet<T, R>, R> void formIntersection(OptionSet<T, R> optionSet, T t) {
            t.getClass();
            OptionSet.access$formIntersection$jd(optionSet, t);
        }

        @Deprecated
        public static <T extends OptionSet<T, R>, R> void formSymmetricDifference(OptionSet<T, R> optionSet, T t) {
            t.getClass();
            OptionSet.access$formSymmetricDifference$jd(optionSet, t);
        }

        @Deprecated
        public static <T extends OptionSet<T, R>, R> void formUnion(OptionSet<T, R> optionSet, T t) {
            t.getClass();
            OptionSet.access$formUnion$jd(optionSet, t);
        }

        @Deprecated
        public static <T extends OptionSet<T, R>, R> Tuple2<Boolean, T> insert(OptionSet<T, R> optionSet, T t) {
            t.getClass();
            return OptionSet.access$insert$jd(optionSet, t);
        }

        @Deprecated
        public static <T extends OptionSet<T, R>, R> T intersection(OptionSet<T, R> optionSet, T t) {
            t.getClass();
            return (T) OptionSet.access$intersection$jd(optionSet, t);
        }

        @Deprecated
        public static <T extends OptionSet<T, R>, R> boolean isDisjoint(OptionSet<T, R> optionSet, T t) {
            t.getClass();
            return OptionSet.access$isDisjoint$jd(optionSet, t);
        }

        @Deprecated
        public static <T extends OptionSet<T, R>, R> boolean isEmpty(OptionSet<T, R> optionSet) {
            return OptionSet.access$isEmpty$jd(optionSet);
        }

        @Deprecated
        public static <T extends OptionSet<T, R>, R> boolean isStrictSubset(OptionSet<T, R> optionSet, T t) {
            t.getClass();
            return OptionSet.access$isStrictSubset$jd(optionSet, t);
        }

        @Deprecated
        public static <T extends OptionSet<T, R>, R> boolean isStrictSuperset(OptionSet<T, R> optionSet, T t) {
            t.getClass();
            return OptionSet.access$isStrictSuperset$jd(optionSet, t);
        }

        @Deprecated
        public static <T extends OptionSet<T, R>, R> boolean isSubset(OptionSet<T, R> optionSet, T t) {
            t.getClass();
            return OptionSet.access$isSubset$jd(optionSet, t);
        }

        @Deprecated
        public static <T extends OptionSet<T, R>, R> boolean isSuperset(OptionSet<T, R> optionSet, T t) {
            t.getClass();
            return OptionSet.access$isSuperset$jd(optionSet, t);
        }

        @Deprecated
        public static <T extends OptionSet<T, R>, R> T remove(OptionSet<T, R> optionSet, T t) {
            t.getClass();
            return (T) OptionSet.access$remove$jd(optionSet, t);
        }

        @Deprecated
        public static <T extends OptionSet<T, R>, R> void subtract(OptionSet<T, R> optionSet, T t) {
            t.getClass();
            OptionSet.access$subtract$jd(optionSet, t);
        }

        @Deprecated
        public static <T extends OptionSet<T, R>, R> T subtracting(OptionSet<T, R> optionSet, T t) {
            t.getClass();
            return (T) OptionSet.access$subtracting$jd(optionSet, t);
        }

        @Deprecated
        public static <T extends OptionSet<T, R>, R> T symmetricDifference(OptionSet<T, R> optionSet, T t) {
            t.getClass();
            return (T) OptionSet.access$symmetricDifference$jd(optionSet, t);
        }

        @Deprecated
        public static <T extends OptionSet<T, R>, R> T union(OptionSet<T, R> optionSet, T t) {
            t.getClass();
            return (T) OptionSet.access$union$jd(optionSet, t);
        }

        @Deprecated
        public static <T extends OptionSet<T, R>, R> T update(OptionSet<T, R> optionSet, T t) {
            t.getClass();
            return (T) OptionSet.access$update$jd(optionSet, t);
        }
    }

    static /* synthetic */ boolean access$contains$jd(OptionSet optionSet, OptionSet optionSet2) {
        return super.contains(optionSet2);
    }

    static /* synthetic */ void access$formIntersection$jd(OptionSet optionSet, OptionSet optionSet2) {
        super.formIntersection(optionSet2);
    }

    static /* synthetic */ void access$formSymmetricDifference$jd(OptionSet optionSet, OptionSet optionSet2) {
        super.formSymmetricDifference(optionSet2);
    }

    static /* synthetic */ void access$formUnion$jd(OptionSet optionSet, OptionSet optionSet2) {
        super.formUnion(optionSet2);
    }

    static /* synthetic */ Tuple2 access$insert$jd(OptionSet optionSet, OptionSet optionSet2) {
        return super.insert(optionSet2);
    }

    static /* synthetic */ OptionSet access$intersection$jd(OptionSet optionSet, OptionSet optionSet2) {
        return super.intersection(optionSet2);
    }

    static /* synthetic */ boolean access$isDisjoint$jd(OptionSet optionSet, OptionSet optionSet2) {
        return super.isDisjoint(optionSet2);
    }

    static /* synthetic */ boolean access$isEmpty$jd(OptionSet optionSet) {
        return super.isEmpty();
    }

    static /* synthetic */ boolean access$isStrictSubset$jd(OptionSet optionSet, OptionSet optionSet2) {
        return super.isStrictSubset(optionSet2);
    }

    static /* synthetic */ boolean access$isStrictSuperset$jd(OptionSet optionSet, OptionSet optionSet2) {
        return super.isStrictSuperset(optionSet2);
    }

    static /* synthetic */ boolean access$isSubset$jd(OptionSet optionSet, OptionSet optionSet2) {
        return super.isSubset(optionSet2);
    }

    static /* synthetic */ boolean access$isSuperset$jd(OptionSet optionSet, OptionSet optionSet2) {
        return super.isSuperset(optionSet2);
    }

    static /* synthetic */ OptionSet access$remove$jd(OptionSet optionSet, OptionSet optionSet2) {
        return super.remove(optionSet2);
    }

    static /* synthetic */ void access$subtract$jd(OptionSet optionSet, OptionSet optionSet2) {
        super.subtract(optionSet2);
    }

    static /* synthetic */ OptionSet access$subtracting$jd(OptionSet optionSet, OptionSet optionSet2) {
        return super.subtracting(optionSet2);
    }

    static /* synthetic */ OptionSet access$symmetricDifference$jd(OptionSet optionSet, OptionSet optionSet2) {
        return super.symmetricDifference(optionSet2);
    }

    static /* synthetic */ OptionSet access$union$jd(OptionSet optionSet, OptionSet optionSet2) {
        return super.union(optionSet2);
    }

    static /* synthetic */ OptionSet access$update$jd(OptionSet optionSet, OptionSet optionSet2) {
        return super.update(optionSet2);
    }

    void assignoptionset(T target);

    default boolean contains(T element) {
        element.getClass();
        long mo1057getRawvaluelongsVKNKU = mo1057getRawvaluelongsVKNKU() & element.mo1057getRawvaluelongsVKNKU();
        gkj gkjVar = hkj.b;
        if (mo1057getRawvaluelongsVKNKU == element.mo1057getRawvaluelongsVKNKU()) {
            return true;
        }
        return false;
    }

    default void formIntersection(T other) {
        other.getClass();
        assignoptionset(intersection((OptionSet<T, R>) other));
    }

    default void formSymmetricDifference(T other) {
        other.getClass();
        assignoptionset(symmetricDifference((OptionSet<T, R>) other));
    }

    default void formUnion(T other) {
        other.getClass();
        assignoptionset(union((OptionSet<T, R>) other));
    }

    /* renamed from: getRawvaluelong-s-VKNKU */
    long mo1057getRawvaluelongsVKNKU();

    default Tuple2<Boolean, T> insert(T element) {
        element.getClass();
        if (contains((OptionSet<T, R>) element)) {
            return new Tuple2<>(Boolean.FALSE, element);
        }
        long mo1057getRawvaluelongsVKNKU = mo1057getRawvaluelongsVKNKU() | element.mo1057getRawvaluelongsVKNKU();
        gkj gkjVar = hkj.b;
        assignoptionset(mo1058makeoptionsetVKZWuLQ(mo1057getRawvaluelongsVKNKU));
        return new Tuple2<>(Boolean.TRUE, element);
    }

    default T intersection(T other) {
        other.getClass();
        long mo1057getRawvaluelongsVKNKU = mo1057getRawvaluelongsVKNKU() & other.mo1057getRawvaluelongsVKNKU();
        gkj gkjVar = hkj.b;
        return mo1058makeoptionsetVKZWuLQ(mo1057getRawvaluelongsVKNKU);
    }

    default boolean isDisjoint(T with) {
        with.getClass();
        long mo1057getRawvaluelongsVKNKU = with.mo1057getRawvaluelongsVKNKU() & mo1057getRawvaluelongsVKNKU();
        gkj gkjVar = hkj.b;
        if (mo1057getRawvaluelongsVKNKU == 0) {
            return true;
        }
        return false;
    }

    default boolean isEmpty() {
        if (mo1057getRawvaluelongsVKNKU() == 0) {
            return true;
        }
        return false;
    }

    default boolean isStrictSubset(T of) {
        of.getClass();
        if (isSubset((OptionSet<T, R>) of) && mo1057getRawvaluelongsVKNKU() != of.mo1057getRawvaluelongsVKNKU()) {
            return true;
        }
        return false;
    }

    default boolean isStrictSuperset(T of) {
        of.getClass();
        if (isSuperset((OptionSet<T, R>) of) && mo1057getRawvaluelongsVKNKU() != of.mo1057getRawvaluelongsVKNKU()) {
            return true;
        }
        return false;
    }

    default boolean isSubset(T of) {
        of.getClass();
        long mo1057getRawvaluelongsVKNKU = of.mo1057getRawvaluelongsVKNKU() & mo1057getRawvaluelongsVKNKU();
        gkj gkjVar = hkj.b;
        if (mo1057getRawvaluelongsVKNKU == mo1057getRawvaluelongsVKNKU()) {
            return true;
        }
        return false;
    }

    default boolean isSuperset(T of) {
        of.getClass();
        long mo1057getRawvaluelongsVKNKU = mo1057getRawvaluelongsVKNKU() & of.mo1057getRawvaluelongsVKNKU();
        gkj gkjVar = hkj.b;
        if (mo1057getRawvaluelongsVKNKU == of.mo1057getRawvaluelongsVKNKU()) {
            return true;
        }
        return false;
    }

    /* renamed from: makeoptionset-VKZWuLQ */
    T mo1058makeoptionsetVKZWuLQ(long rawvaluelong);

    default T remove(T element) {
        element.getClass();
        if (contains((OptionSet<T, R>) element)) {
            long mo1057getRawvaluelongsVKNKU = mo1057getRawvaluelongsVKNKU();
            long j = ~element.mo1057getRawvaluelongsVKNKU();
            gkj gkjVar = hkj.b;
            assignoptionset(mo1058makeoptionsetVKZWuLQ(mo1057getRawvaluelongsVKNKU & j));
            return element;
        }
        return null;
    }

    default void subtract(T other) {
        other.getClass();
        assignoptionset(subtracting((OptionSet<T, R>) other));
    }

    default T subtracting(T other) {
        other.getClass();
        long mo1057getRawvaluelongsVKNKU = mo1057getRawvaluelongsVKNKU();
        long j = ~other.mo1057getRawvaluelongsVKNKU();
        gkj gkjVar = hkj.b;
        return mo1058makeoptionsetVKZWuLQ(mo1057getRawvaluelongsVKNKU & j);
    }

    default T symmetricDifference(T other) {
        other.getClass();
        long mo1057getRawvaluelongsVKNKU = mo1057getRawvaluelongsVKNKU() ^ other.mo1057getRawvaluelongsVKNKU();
        gkj gkjVar = hkj.b;
        return mo1058makeoptionsetVKZWuLQ(mo1057getRawvaluelongsVKNKU);
    }

    default T union(T other) {
        other.getClass();
        long mo1057getRawvaluelongsVKNKU = mo1057getRawvaluelongsVKNKU() | other.mo1057getRawvaluelongsVKNKU();
        gkj gkjVar = hkj.b;
        return mo1058makeoptionsetVKZWuLQ(mo1057getRawvaluelongsVKNKU);
    }

    default T update(T with) {
        with.getClass();
        long mo1057getRawvaluelongsVKNKU = mo1057getRawvaluelongsVKNKU() | with.mo1057getRawvaluelongsVKNKU();
        gkj gkjVar = hkj.b;
        T mo1058makeoptionsetVKZWuLQ = mo1058makeoptionsetVKZWuLQ(mo1057getRawvaluelongsVKNKU);
        if (!contains((OptionSet<T, R>) with)) {
            with = null;
        }
        assignoptionset(mo1058makeoptionsetVKZWuLQ);
        return with;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ default void formIntersection(SetAlgebra setAlgebra) {
        formIntersection((OptionSet<T, R>) setAlgebra);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ default void formSymmetricDifference(SetAlgebra setAlgebra) {
        formSymmetricDifference((OptionSet<T, R>) setAlgebra);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ default void formUnion(SetAlgebra setAlgebra) {
        formUnion((OptionSet<T, R>) setAlgebra);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ default void subtract(SetAlgebra setAlgebra) {
        subtract((OptionSet<T, R>) setAlgebra);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ default SetAlgebra intersection(SetAlgebra setAlgebra) {
        return intersection((OptionSet<T, R>) setAlgebra);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ default SetAlgebra symmetricDifference(SetAlgebra setAlgebra) {
        return symmetricDifference((OptionSet<T, R>) setAlgebra);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ default SetAlgebra union(SetAlgebra setAlgebra) {
        return union((OptionSet<T, R>) setAlgebra);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ default SetAlgebra subtracting(SetAlgebra setAlgebra) {
        return subtracting((OptionSet<T, R>) setAlgebra);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ default boolean isDisjoint(SetAlgebra setAlgebra) {
        return isDisjoint((OptionSet<T, R>) setAlgebra);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ default boolean isStrictSubset(SetAlgebra setAlgebra) {
        return isStrictSubset((OptionSet<T, R>) setAlgebra);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ default boolean isStrictSuperset(SetAlgebra setAlgebra) {
        return isStrictSuperset((OptionSet<T, R>) setAlgebra);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ default boolean contains(Object obj) {
        return contains((OptionSet<T, R>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ default boolean isSubset(SetAlgebra setAlgebra) {
        return isSubset((OptionSet<T, R>) setAlgebra);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ default boolean isSuperset(SetAlgebra setAlgebra) {
        return isSuperset((OptionSet<T, R>) setAlgebra);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ default Object update(Object obj) {
        return update((OptionSet<T, R>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ default Object remove(Object obj) {
        return remove((OptionSet<T, R>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ default Tuple2 insert(Object obj) {
        return insert((OptionSet<T, R>) obj);
    }
}
