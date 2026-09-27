package skip.lib;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00000\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0096\u0002J6\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\"\b\u0002\u0010\u0014\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015J\u000e\u0010\u0017\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\tJ\u000e\u0010\u0018\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\tJ.\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0012\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0011HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0011\u0010\u000e\u001a\u00028\u00018F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\t¨\u0006!"}, d2 = {"Lskip/lib/Tuple2;", "E0", "E1", "", "_e0", "_e1", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "get_e0", "()Ljava/lang/Object;", "Ljava/lang/Object;", "get_e1", "element0", "getElement0", "element1", "getElement1", "compareTo", "", "other", "sref", "onUpdate", "Lkotlin/Function1;", "", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lskip/lib/Tuple2;", "equals", "", "", "hashCode", "toString", "", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Tuple2<E0, E1> implements Comparable<Tuple2<E0, E1>> {
    private final E0 _e0;
    private final E1 _e1;

    public Tuple2(E0 e0, E1 e1) {
        this._e0 = e0;
        this._e1 = e1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Tuple2 copy$default(Tuple2 tuple2, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = tuple2._e0;
        }
        if ((i & 2) != 0) {
            obj2 = tuple2._e1;
        }
        return tuple2.copy(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Tuple2 sref$default(Tuple2 tuple2, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return tuple2.sref(function1);
    }

    public int compareTo(Tuple2<E0, E1> other) {
        other.getClass();
        E0 e0 = this._e0;
        if (!(e0 instanceof Comparable)) {
            return 0;
        }
        e0.getClass();
        int compareTo = ((Comparable) e0).compareTo(other._e0);
        if (compareTo != 0) {
            return compareTo;
        }
        E1 e1 = this._e1;
        if (!(e1 instanceof Comparable)) {
            return 0;
        }
        e1.getClass();
        return ((Comparable) e1).compareTo(other._e1);
    }

    public final E0 component1() {
        return this._e0;
    }

    public final E1 component2() {
        return this._e1;
    }

    public final Tuple2<E0, E1> copy(E0 _e0, E1 _e1) {
        return new Tuple2<>(_e0, _e1);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Tuple2)) {
            return false;
        }
        Tuple2 tuple2 = (Tuple2) other;
        if (Intrinsics.areEqual(this._e0, tuple2._e0) && Intrinsics.areEqual(this._e1, tuple2._e1)) {
            return true;
        }
        return false;
    }

    public final E0 getElement0() {
        return (E0) StructKt.sref$default(this._e0, null, 1, null);
    }

    public final E1 getElement1() {
        return (E1) StructKt.sref$default(this._e1, null, 1, null);
    }

    public final E0 get_e0() {
        return this._e0;
    }

    public final E1 get_e1() {
        return this._e1;
    }

    public int hashCode() {
        int hashCode;
        E0 e0 = this._e0;
        int i = 0;
        if (e0 == null) {
            hashCode = 0;
        } else {
            hashCode = e0.hashCode();
        }
        int i2 = hashCode * 31;
        E1 e1 = this._e1;
        if (e1 != null) {
            i = e1.hashCode();
        }
        return i2 + i;
    }

    public final Tuple2<E0, E1> sref(Function1<? super Tuple2<E0, E1>, Unit> onUpdate) {
        Object sref$default = StructKt.sref$default(this._e0, null, 1, null);
        Object sref$default2 = StructKt.sref$default(this._e1, null, 1, null);
        if (sref$default == this._e0 && sref$default2 == this._e1) {
            return this;
        }
        return new Tuple2<>(sref$default, sref$default2);
    }

    public String toString() {
        return "Tuple2(_e0=" + this._e0 + ", _e1=" + this._e1 + ")";
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((Tuple2) obj);
    }
}
