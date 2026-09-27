package skip.lib;

import defpackage.ix2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000f\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0004\b\u0003\u0010\u0004*\u0004\b\u0004\u0010\u00052&\u0012\"\u0012 \u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u00000\u0006B/\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u0006\u0010\b\u001a\u00028\u0001\u0012\u0006\u0010\t\u001a\u00028\u0002\u0012\u0006\u0010\n\u001a\u00028\u0003\u0012\u0006\u0010\u000b\u001a\u00028\u0004¢\u0006\u0004\b\f\u0010\rJ/\u0010\u001f\u001a\u00020 2$\u0010!\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0000H\u0096\u0002JZ\u0010\"\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u000024\b\u0002\u0010#\u001a.\u0012\"\u0012 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0000\u0012\u0004\u0012\u00020%\u0018\u00010$J\u000e\u0010&\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000e\u0010'\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000e\u0010(\u001a\u00028\u0002HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000e\u0010)\u001a\u00028\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000e\u0010*\u001a\u00028\u0004HÆ\u0003¢\u0006\u0002\u0010\u000fJ^\u0010+\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u00002\b\b\u0002\u0010\u0007\u001a\u00028\u00002\b\b\u0002\u0010\b\u001a\u00028\u00012\b\b\u0002\u0010\t\u001a\u00028\u00022\b\b\u0002\u0010\n\u001a\u00028\u00032\b\b\u0002\u0010\u000b\u001a\u00028\u0004HÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020.2\b\u0010!\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020 HÖ\u0001J\t\u00101\u001a\u000202HÖ\u0001R\u0013\u0010\u0007\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\t\u001a\u00028\u0002¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\n\u001a\u00028\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\u000b\u001a\u00028\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u0015\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0017\u001a\u00028\u00018F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000fR\u0011\u0010\u0019\u001a\u00028\u00028F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000fR\u0011\u0010\u001b\u001a\u00028\u00038F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000fR\u0011\u0010\u001d\u001a\u00028\u00048F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000f¨\u00063"}, d2 = {"Lskip/lib/Tuple5;", "E0", "E1", "E2", "E3", "E4", "", "_e0", "_e1", "_e2", "_e3", "_e4", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "get_e0", "()Ljava/lang/Object;", "Ljava/lang/Object;", "get_e1", "get_e2", "get_e3", "get_e4", "element0", "getElement0", "element1", "getElement1", "element2", "getElement2", "element3", "getElement3", "element4", "getElement4", "compareTo", "", "other", "sref", "onUpdate", "Lkotlin/Function1;", "", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lskip/lib/Tuple5;", "equals", "", "", "hashCode", "toString", "", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Tuple5<E0, E1, E2, E3, E4> implements Comparable<Tuple5<E0, E1, E2, E3, E4>> {
    private final E0 _e0;
    private final E1 _e1;
    private final E2 _e2;
    private final E3 _e3;
    private final E4 _e4;

    public Tuple5(E0 e0, E1 e1, E2 e2, E3 e3, E4 e4) {
        this._e0 = e0;
        this._e1 = e1;
        this._e2 = e2;
        this._e3 = e3;
        this._e4 = e4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Tuple5 copy$default(Tuple5 tuple5, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, Object obj6) {
        E0 e0 = obj;
        if ((i & 1) != 0) {
            e0 = tuple5._e0;
        }
        E1 e1 = obj2;
        if ((i & 2) != 0) {
            e1 = tuple5._e1;
        }
        E2 e2 = obj3;
        if ((i & 4) != 0) {
            e2 = tuple5._e2;
        }
        E3 e3 = obj4;
        if ((i & 8) != 0) {
            e3 = tuple5._e3;
        }
        E4 e4 = obj5;
        if ((i & 16) != 0) {
            e4 = tuple5._e4;
        }
        E4 e42 = e4;
        E2 e22 = e2;
        return tuple5.copy(e0, e1, e22, e3, e42);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Tuple5 sref$default(Tuple5 tuple5, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return tuple5.sref(function1);
    }

    public int compareTo(Tuple5<E0, E1, E2, E3, E4> other) {
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
        int compareTo4 = ((Comparable) e3).compareTo(other._e3);
        if (compareTo4 != 0) {
            return compareTo4;
        }
        E4 e4 = this._e4;
        if (!(e4 instanceof Comparable)) {
            return 0;
        }
        e4.getClass();
        return ((Comparable) e4).compareTo(other._e4);
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

    public final E4 component5() {
        return this._e4;
    }

    public final Tuple5<E0, E1, E2, E3, E4> copy(E0 _e0, E1 _e1, E2 _e2, E3 _e3, E4 _e4) {
        return new Tuple5<>(_e0, _e1, _e2, _e3, _e4);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Tuple5)) {
            return false;
        }
        Tuple5 tuple5 = (Tuple5) other;
        if (Intrinsics.areEqual(this._e0, tuple5._e0) && Intrinsics.areEqual(this._e1, tuple5._e1) && Intrinsics.areEqual(this._e2, tuple5._e2) && Intrinsics.areEqual(this._e3, tuple5._e3) && Intrinsics.areEqual(this._e4, tuple5._e4)) {
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

    public final E4 getElement4() {
        return (E4) StructKt.sref$default(this._e4, null, 1, null);
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

    public final E4 get_e4() {
        return this._e4;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
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
        if (e3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = e3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        E4 e4 = this._e4;
        if (e4 != null) {
            i = e4.hashCode();
        }
        return i5 + i;
    }

    public final Tuple5<E0, E1, E2, E3, E4> sref(Function1<? super Tuple5<E0, E1, E2, E3, E4>, Unit> onUpdate) {
        Object sref$default = StructKt.sref$default(this._e0, null, 1, null);
        Object sref$default2 = StructKt.sref$default(this._e1, null, 1, null);
        Object sref$default3 = StructKt.sref$default(this._e2, null, 1, null);
        Object sref$default4 = StructKt.sref$default(this._e3, null, 1, null);
        Object sref$default5 = StructKt.sref$default(this._e4, null, 1, null);
        if (sref$default == this._e0 && sref$default2 == this._e1 && sref$default3 == this._e2 && sref$default4 == this._e3 && sref$default5 == this._e4) {
            return this;
        }
        return new Tuple5<>(sref$default, sref$default2, sref$default3, sref$default4, sref$default5);
    }

    public String toString() {
        E0 e0 = this._e0;
        E1 e1 = this._e1;
        E2 e2 = this._e2;
        E3 e3 = this._e3;
        E4 e4 = this._e4;
        StringBuilder sb = new StringBuilder("Tuple5(_e0=");
        sb.append(e0);
        sb.append(", _e1=");
        sb.append(e1);
        sb.append(", _e2=");
        sb.append(e2);
        sb.append(", _e3=");
        sb.append(e3);
        sb.append(", _e4=");
        return ix2.o(sb, e4, ")");
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((Tuple5) obj);
    }
}
