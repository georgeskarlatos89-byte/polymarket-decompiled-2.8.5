package skip.lib;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000f\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0004\b\u0003\u0010\u00042 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u00000\u0005B'\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00028\u0002\u0012\u0006\u0010\t\u001a\u00028\u0003¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u001a\u001a\u00020\u001b2\u001e\u0010\u001c\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0000H\u0096\u0002JN\u0010\u001d\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002.\b\u0002\u0010\u001e\u001a(\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0000\u0012\u0004\u0012\u00020 \u0018\u00010\u001fJ\u000e\u0010!\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\rJ\u000e\u0010\"\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\rJ\u000e\u0010#\u001a\u00028\u0002HÆ\u0003¢\u0006\u0002\u0010\rJ\u000e\u0010$\u001a\u00028\u0003HÆ\u0003¢\u0006\u0002\u0010\rJN\u0010%\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u00002\b\b\u0002\u0010\u0007\u001a\u00028\u00012\b\b\u0002\u0010\b\u001a\u00028\u00022\b\b\u0002\u0010\t\u001a\u00028\u0003HÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020(2\b\u0010\u001c\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u001bHÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0013\u0010\u0006\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\b\u001a\u00028\u0002¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\t\u001a\u00028\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0012\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0014\u001a\u00028\u00018F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\rR\u0011\u0010\u0016\u001a\u00028\u00028F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\rR\u0011\u0010\u0018\u001a\u00028\u00038F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\r¨\u0006-"}, d2 = {"Lskip/lib/Tuple4;", "E0", "E1", "E2", "E3", "", "_e0", "_e1", "_e2", "_e3", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "get_e0", "()Ljava/lang/Object;", "Ljava/lang/Object;", "get_e1", "get_e2", "get_e3", "element0", "getElement0", "element1", "getElement1", "element2", "getElement2", "element3", "getElement3", "compareTo", "", "other", "sref", "onUpdate", "Lkotlin/Function1;", "", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lskip/lib/Tuple4;", "equals", "", "", "hashCode", "toString", "", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Tuple4<E0, E1, E2, E3> implements Comparable<Tuple4<E0, E1, E2, E3>> {
    private final E0 _e0;
    private final E1 _e1;
    private final E2 _e2;
    private final E3 _e3;

    public Tuple4(E0 e0, E1 e1, E2 e2, E3 e3) {
        this._e0 = e0;
        this._e1 = e1;
        this._e2 = e2;
        this._e3 = e3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Tuple4 copy$default(Tuple4 tuple4, Object obj, Object obj2, Object obj3, Object obj4, int i, Object obj5) {
        if ((i & 1) != 0) {
            obj = tuple4._e0;
        }
        if ((i & 2) != 0) {
            obj2 = tuple4._e1;
        }
        if ((i & 4) != 0) {
            obj3 = tuple4._e2;
        }
        if ((i & 8) != 0) {
            obj4 = tuple4._e3;
        }
        return tuple4.copy(obj, obj2, obj3, obj4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Tuple4 sref$default(Tuple4 tuple4, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return tuple4.sref(function1);
    }

    public int compareTo(Tuple4<E0, E1, E2, E3> other) {
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
        int compareTo2 = ((Comparable) e1).compareTo(other._e1);
        if (compareTo2 != 0) {
            return compareTo2;
        }
        E2 e2 = this._e2;
        if (!(e2 instanceof Comparable)) {
            return 0;
        }
        e2.getClass();
        int compareTo3 = ((Comparable) e2).compareTo(other._e2);
        if (compareTo3 != 0) {
            return compareTo3;
        }
        E3 e3 = this._e3;
        if (!(e3 instanceof Comparable)) {
            return 0;
        }
        e3.getClass();
        return ((Comparable) e3).compareTo(other._e3);
    }

    public final E0 component1() {
        return this._e0;
    }

    public final E1 component2() {
        return this._e1;
    }

    public final E2 component3() {
        return this._e2;
    }

    public final E3 component4() {
        return this._e3;
    }

    public final Tuple4<E0, E1, E2, E3> copy(E0 _e0, E1 _e1, E2 _e2, E3 _e3) {
        return new Tuple4<>(_e0, _e1, _e2, _e3);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Tuple4)) {
            return false;
        }
        Tuple4 tuple4 = (Tuple4) other;
        if (Intrinsics.areEqual(this._e0, tuple4._e0) && Intrinsics.areEqual(this._e1, tuple4._e1) && Intrinsics.areEqual(this._e2, tuple4._e2) && Intrinsics.areEqual(this._e3, tuple4._e3)) {
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

    public final E2 getElement2() {
        return (E2) StructKt.sref$default(this._e2, null, 1, null);
    }

    public final E3 getElement3() {
        return (E3) StructKt.sref$default(this._e3, null, 1, null);
    }

    public final E0 get_e0() {
        return this._e0;
    }

    public final E1 get_e1() {
        return this._e1;
    }

    public final E2 get_e2() {
        return this._e2;
    }

    public final E3 get_e3() {
        return this._e3;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        E0 e0 = this._e0;
        int i = 0;
        if (e0 == null) {
            hashCode = 0;
        } else {
            hashCode = e0.hashCode();
        }
        int i2 = hashCode * 31;
        E1 e1 = this._e1;
        if (e1 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = e1.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        E2 e2 = this._e2;
        if (e2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = e2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        E3 e3 = this._e3;
        if (e3 != null) {
            i = e3.hashCode();
        }
        return i4 + i;
    }

    public final Tuple4<E0, E1, E2, E3> sref(Function1<? super Tuple4<E0, E1, E2, E3>, Unit> onUpdate) {
        Object sref$default = StructKt.sref$default(this._e0, null, 1, null);
        Object sref$default2 = StructKt.sref$default(this._e1, null, 1, null);
        Object sref$default3 = StructKt.sref$default(this._e2, null, 1, null);
        Object sref$default4 = StructKt.sref$default(this._e3, null, 1, null);
        if (sref$default == this._e0 && sref$default2 == this._e1 && sref$default3 == this._e2 && sref$default4 == this._e3) {
            return this;
        }
        return new Tuple4<>(sref$default, sref$default2, sref$default3, sref$default4);
    }

    public String toString() {
        return "Tuple4(_e0=" + this._e0 + ", _e1=" + this._e1 + ", _e2=" + this._e2 + ", _e3=" + this._e3 + ")";
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((Tuple4) obj);
    }
}
